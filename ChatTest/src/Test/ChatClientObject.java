package Test;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.io.*;

class  ChatClientObject extends JFrame implements ActionListener,Runnable
{
	private JPanel contentPane;
	private JTextArea output; 
	private JTextField testput;
	private JTextField input; 
	private JTextField memberList;
	private JButton sendBtn;
	private JButton addBtn;
	private Socket socket;
	private ObjectInputStream reader=null;
	private ObjectOutputStream writer=null; 
	
	
	List selectOne = new List(6);	//총 6개의 공간 list,를 선언하여
	private String nickName;
	
	
	public ChatClientObject() { 
		
		//센터에 TextArea만들기
		output = new JTextArea();
		output.setFont(new Font("맑은 고딕",Font.BOLD,15));
		output.setEditable(false);
		JScrollPane scroll = new JScrollPane(output);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  //항상 스크롤바가 세로로 떠있음

		//하단에 버튼과 TextArea넣기 
		JPanel bottom = new JPanel();
		bottom.setLayout(new BorderLayout()); 
		input = new JTextField();
		
		sendBtn = new JButton( "보내기");
		sendBtn.setBackground(Color.white);
	
		addBtn = new JButton("인원추가하기");
		addBtn.setBackground(Color.white);
		addBtn.addActionListener(new MyLt()); //추가버튼에 대한 이벤트 발생 메서드
	
		
		bottom.add("Center",input);  //센터에 붙이기
		bottom.add("East",sendBtn);  //동쪽에 붙이기
		bottom.add("South",addBtn);
		
	
		//멤버 목록
		JPanel memberPan = new JPanel(); //memberList 패널을 하나 생성하고
		selectOne.setBounds(12, 47, 142, 369);	 //칸크기
        memberPan.setLayout(new BorderLayout()); //memberPan패널의 레이아웃초기화
		memberList = new JTextField();
		
		selectOne.add(nickName);
		
		memberPan.add("Center",memberList);		
		memberPan.add(selectOne);
		
		//멤버목록 타이틀
		TextField textField_1 = new TextField();
		textField_1.setBounds(35, 7, 96, 21);
		textField_1.setText("접속멤버"); //접속멤버
		textField_1.setFont(new Font("Dialog", Font.BOLD, 17));
		textField_1.setEnabled(false);
		textField_1.setEditable(false);
		memberPan.add(textField_1);
		
		
		//container에 붙이기
		Container c = this.getContentPane();
		c.add("Center", scroll);  //센터에 붙이기
		c.add("South", bottom);  //남쪽에 붙이기
		c.add("East",memberPan);
		//c.add("East",right);
		//윈도우 창 설정
		setBounds(500,500,500,500);
		setVisible(true);

		//윈도우 이벤트
		
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){ 
				//System.exit(0);
				try{
					//InfoDTO dto = new InfoDTO(nickName,Info.EXIT);
					InfoDTO dto = new InfoDTO();
					dto.setNickName(nickName);
					dto.setCommand(Info.EXIT);
					writer.writeObject(dto);  //역슬러쉬가 필요가 없음
					writer.flush();
				}catch(IOException io){
					io.printStackTrace();
				}
			}
		});
	}
	////////ui 끝 
	
	private class MyLt implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton button = (JButton) e.getSource();
			if(e.getSource() == button){
				new ChatClientObject().service();
			}
		}
	}
	public void service(){ // 클라이언트 -> 서버 (데이터)
		//서버 IP 입력받기
		String serverIP= JOptionPane.showInputDialog(this,"서버IP를 입력하세요","192.168.240.114");  //기본적으로 아이피 값이 입력되어 들어가게 됨
		if(serverIP==null || serverIP.length()==0){  //만약 값이 입력되지 않았을 때 창이 꺼짐
			System.out.println("서버 IP가 입력되지 않았습니다.");
			System.exit(0);
		}
		//닉네임 받기
	
		nickName= JOptionPane.showInputDialog(this,"닉네임을 입력하세요","닉네임" ,JOptionPane.INFORMATION_MESSAGE);
		if(nickName == null || nickName.length()==0){
			nickName="guest";
		}
		try{
			socket = new Socket(serverIP,9500);
			//에러 발생
			reader= new ObjectInputStream(socket.getInputStream());
			writer = new ObjectOutputStream(socket.getOutputStream());
			System.out.println("전송 준비 완료!"); 			
		} catch(UnknownHostException e ){
			System.out.println("서버를 찾을 수 없습니다.");
			e.printStackTrace();
			System.exit(0);
		} catch(IOException e){
			System.out.println("서버와 연결이 안되었습니다.");
			e.printStackTrace();
			System.exit(0);
		}
		try{
			//서버로 닉네임 보내기	
			InfoDTO dto = new InfoDTO();
			dto.setCommand(Info.JOIN);
			dto.setNickName(nickName);
			writer.writeObject(dto);  //역슬러쉬가 필요가 없음
			writer.flush();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		//스레드 생성
		
		Thread t = new Thread(this);
		t.start();
		input.addActionListener(this);
		sendBtn.addActionListener(this);  //멕션 이벤트 추가
	}
	//스레드 오버라이드 
	@Override
	public void run(){  //클라이언트 <- 서버 (데이터)
		//서버로부터 데이터 받기
		InfoDTO dto= null;
		while(true){
			try{
				dto = (InfoDTO) reader.readObject();
				if(dto.getCommand()==Info.EXIT){  //서버로부터 내 자신의 exit를 받으면 종료됨
					reader.close();
					writer.close();
					socket.close();
					System.exit(0);
				} else if(dto.getCommand()==Info.SEND){
					
					selectOne. add(dto.getNickName());
					output.append(dto.getMessage()+"\n");	
					int pos=output.getText().length();
					output.setCaretPosition(pos);
				}
			}catch(IOException e){
				e.printStackTrace();
			}catch(ClassNotFoundException e){
				e.printStackTrace();
			}	
		}
	}
	
	
	//ActionPerformed
	@Override
	public void actionPerformed(ActionEvent e){
			try{
				//서버로 보냄 
				//JTextField값을 서버로보내기
				//버퍼 비우기
				String msg=input.getText();
				InfoDTO dto = new InfoDTO();
				if(msg.equals("exit")){
					dto.setCommand(Info.EXIT);
				} else {
					dto.setCommand(Info.SEND);
					dto.setMessage(msg);
					dto.setNickName(nickName);
				}
				writer.writeObject(dto);
				writer.flush();
				input.setText("");
				
			}catch(IOException io){
				io.printStackTrace();
			}
	}

	public static void main(String[] args) 
	{
		new ChatClientObject().service();
	}
}
//동시 채팅을 위해 쓰레드를 생성해주어야 함