package Test;
import java.io.*;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JOptionPane;
import javax.xml.soap.Text;

//[Reference] : 졸리운_곰, 「Java 알고리즘 - [SWT] MessageBox Example」 https://www.stechstar.com/user/zbxe/?mid=AlgorithmJava&document_srl=28394.
import java.awt.*;
import java.awt.event.*;
//쓰레드 두개를 사용한다. 
//-Dfile.encoding=MS949

public class ClientUi extends Frame implements ActionListener,Runnable{
	// Label,TextField,Button 객체맴버 선언
	Label lbl_title, lbl_id, lbl_pwd;
	TextField txt_id, txt_pwd;
	Button btn_con, btn_cen;
	RoomChat rch = new RoomChat();
	
	
	
	private String nickName; //닉네임 스트링변
	private Socket socket;
	private ObjectInputStream reader=null;
	private ObjectOutputStream writer=null; 
	
	
	private TextArea output;
	private TextField input;
	private Button sendBtn;
	
	public ClientUi() {
		output = new TextArea();
		output.setFont(new Font("맑은 고딕",Font.BOLD,15));
		output.setEditable(false);
		
		Panel bottom = new Panel();
		bottom.setLayout(new BorderLayout());
		input = new TextField();
		
		sendBtn = new Button("보내기");
		
		bottom.add("Center",input);
		bottom.add("East",sendBtn);
		
		Container c = this.getContendPane();
		c.add("South",bottom);
		
		setBounds(300,300,300,300);
		setVisible(true);
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
	
	
	
	private Container getContendPane() {
		// TODO Auto-generated method stub
		return null;
	}






	public ClientUi(String str) {
		// Frame 생성자 호출(Frame창 타이틀 제목)
		super(str);

		setLayout(null);// 수동으로 컴포넌트 위치지정

		// Label,TextField,Button객체생성
		lbl_title = new Label("아이디와 암호를 입력하세요.");
		lbl_id = new Label("아이디");
		lbl_pwd = new Label("암  호");
		txt_id = new TextField();
		txt_pwd = new TextField();
		btn_con = new Button("접속");
		btn_cen = new Button("취소");
	
		// Label,TextField,Button 컴포넌트의 위치지정
		lbl_title.setBounds(10, 25, 250, 30);
		lbl_id.setBounds(10, 75, 40, 30);
		lbl_pwd.setBounds(10, 115, 30, 30);
		txt_id.setBounds(60, 75, 170, 30);
		txt_pwd.setBounds(60, 115, 170, 30);
		btn_con.setBounds(70, 155, 50, 30);
		btn_cen.setBounds(130, 155, 50, 30);

		txt_pwd.setEchoChar('*');// 암호가 *로 찍힌다.

		// Label,TextField,Button컴포넌트를 Frame컨테이너에 붙히기
		add(lbl_title);
		add(lbl_id);
		add(txt_id);
		add(lbl_pwd);
		add(txt_pwd);
		add(btn_con);
		add(btn_cen);

		// WindowExit객체 생성하고 Frame창의 X(닫기) 이벤트 등록
		this.addWindowListener(new WindowExit());
		MouseClick mc = new MouseClick();// MouseClick객체 생성
		btn_con.addMouseListener(mc);// 접속버튼 이벤트 등록
		btn_cen.addMouseListener(mc);// 취소버튼 이벤트 등록
		
		setBounds(200,200,250,200);
		setVisible(true);// Frame보기
	}
	

	// WindowAdapter상속받고 WindowExit클래스 선언
	class WindowExit extends WindowAdapter {
		// Frame창의 x(닫기) 이벤트 처리
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}

	// MouseAdapter상속 받고 MouseClick클래스 선언
	class MouseClick extends MouseAdapter {
		// 접속버튼,취소버튼 이벤트 처리
		public void mouseClicked(MouseEvent e) {
			Object obj = e.getSource();// 이벤트 발생한 객체 반환
			if (obj == btn_con)
				try {
					btn_con_MouseClicked(e);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			else if (obj == btn_cen)// 취소버튼
				btn_cen_MouseClicked(e);// btn_cen_MouseClicked 메서드 호출
		}
		// 접속버튼의 이벤트 발생시 처리부분
		public void btn_con_MouseClicked(MouseEvent e) throws IOException {
				ClientUi cl = new ClientUi();
			if ((txt_id.getText().trim().equals("test")) & (txt_pwd.getText().trim().equals("1234"))) {
				System.out.println("회원님 환영합니다.");
				JOptionPane.showMessageDialog(null, "반갑습니다.");
				cl.ClientUi();
				//rch.setVisible(true);
				BufferedOutputStream bs = null;
				try {
					bs = new BufferedOutputStream(new FileOutputStream("D:\\java\\JAVA_BIT_CLASS\\ToyProject\\Output.txt"));
					String str = txt_id.getText();
					bs.write(str.getBytes());
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.getStackTrace();
				} finally {
					bs.close();
				}	
			}
			else if ((txt_id.getText().trim().equals("guest")) & (txt_pwd.getText().trim().equals("guest")))
			JOptionPane.showMessageDialog(null, "당신은 비회원 입니다.");
			else
				JOptionPane.showMessageDialog(null, "잘못 입력 하였습니다.");

		}
		// 취소버튼 발생시 처리부분(해당 TextField의 내용을 지운다.)
		public void btn_cen_MouseClicked(MouseEvent e) {
			txt_id.setText("");
			txt_pwd.setText("");
		}
	}
	public void service() {
		String serverIP= JOptionPane.showInputDialog(this,"서버IP를 입력하세요","192.168.240.102");  //기본적으로 아이피 값이 입력되어 들어가게 됨
		if(serverIP==null || serverIP.length()==0){  //만약 값이 입력되지 않았을 때 창이 꺼짐
			System.out.println("서버 IP가 입력되지 않았습니다.");
			System.exit(0);
		}
		
		nickName = JOptionPane.showInputDialog(this,"닉네임을 입력하세요","닉네임" ,JOptionPane.INFORMATION_MESSAGE);
		if(nickName == null || nickName.length()==0) {
			nickName = "guest";
		}
		try{ //ip보내기 서버로
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
		
		try { //서버로 닉네임 보내기
			InfoDTO dto = new InfoDTO();
			dto.setCommand(Info.JOIN);
			dto.setNickName(nickName);
			writer.writeObject(dto);  //역슬러쉬가 필요가 없음
			writer.flush();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		
		Thread t = new Thread(this);
		t.start();
		input.addActionListener(this);
		sendBtn.addActionListener(this);
		
	}
	
	public void ClientUi() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void run() {
		//서버로부터 데이터 받기..
		InfoDTO dto = null;
		while(true) {
			try {
				dto = (InfoDTO) reader.readObject();
				if(dto.getCommand() == Info.EXIT) {
					reader.close();
					writer.close();
					socket.close();
					System.exit(0);
				} else if(dto.getCommand()==Info.SEND) {
					output.append(dto.getMessage()+"\n");
					
					int pos=output.getText().length();
					output.setCaretPosition(pos);
				}				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		try{
			//서버로 보냄 
			//JTextField값을 서버로보내기
			//버퍼 비우기
			String msg=input.getText();
			InfoDTO dto = new InfoDTO();
			//dto.setNickName(nickName);
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
	
	
	
	public static void main(String args[]) {
		new ClientUi("로그인 화면");// Frame창의 타이틀
	}
}