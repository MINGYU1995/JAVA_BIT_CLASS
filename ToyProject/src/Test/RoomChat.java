package Test;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.awt.Font;
import java.awt.List;
import java.awt.TextArea;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JList;
//input으로 id 입력 읽어오기
public class RoomChat extends JFrame implements ActionListener {
	private JPanel contentPane;
	TextField textField = new TextField();
	static TextArea txtRoomChat = new TextArea();
	static PrintWriter pw;
	TextField txtRoomChatWrite = new TextField();
	static String strBuff="";
	public static void main(String[] args) {
		
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FileInputStream fis = new FileInputStream("D:\\java\\JAVA_BIT_CLASS\\ToyProject\\Output.txt");
					BufferedInputStream bis = new BufferedInputStream(fis);
					byte[] byteBuff = new byte[9999];
					int nRLen = bis.read(byteBuff);
					strBuff = new String(byteBuff, 0, nRLen);
					System.out.printf("읽은내용 %s \n",strBuff);
					bis.close();
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("읽을 파일이 없음.");
				}
					
				try {
					RoomChat frame = new RoomChat();
					frame.setVisible(true);	
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		subMain();
	}

	public RoomChat() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 530, 464);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(0, 43, 336, 383);
		contentPane.add(panel);
		panel.setLayout(null);
		
		//출력창
		txtRoomChat.setEditable(true);
		txtRoomChat.setBounds(0, 0, 336, 334);
		panel.add(txtRoomChat);
		
		//입력창
		txtRoomChatWrite.addActionListener(this);
		txtRoomChatWrite.setBounds(10, 340, 241, 33);
		panel.add(txtRoomChatWrite);
//		
		//버튼
		JButton btnRoomSend = new JButton("Enter");
		btnRoomSend.setBounds(259, 344, 65, 29);
		panel.add(btnRoomSend);
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(348, 0, 166, 426);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		TextField textField_1 = new TextField();
		textField_1.setBounds(35, 7, 96, 21);
		textField_1.setText("\uC811\uC18D\uBA64\uBC84"); //접속멤버
		textField_1.setFont(new Font("Dialog", Font.BOLD, 17));
		textField_1.setEnabled(false);
		textField_1.setEditable(false);
		panel_1.add(textField_1);
		
		//접속멤버 
		 List selectOne = new List(6);
         selectOne.setBounds(12, 47, 142, 369);	    
         selectOne.add(strBuff);
         panel_1.add(selectOne);
		
         
		
		textField.setEnabled(false);
		textField.setEditable(false);
		textField.setFont(new Font("Dialog", Font.BOLD, 17));
		textField.setText("ChatRoom");
		textField.setBounds(109, 14, 101, 23);
		contentPane.add(textField);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String msg = txtRoomChatWrite.getText();
		pw.println(msg);
		pw.flush();
		txtRoomChatWrite.setText("");
		txtRoomChatWrite.setText("");
		
	}
	
	public static void subMain() {
	
		String url="192.168.240.102";	//ip주소를 다른사람주소로 바꾸면 다른사람 서버에도 들어갈수있음
		int port=8080;
		Socket sock=null;
		InputStream is=null;
		OutputStream os=null;
		InputStreamReader isr=null;	//문자열로 바꿈
		OutputStreamWriter osw=null;
		BufferedReader br=null;
		
		//Scanner sc=new Scanner(System.in);
		try {
			sock=new Socket(url,port);
			is=sock.getInputStream();
			os=sock.getOutputStream();
			isr=new InputStreamReader(is);
			osw=new OutputStreamWriter(os);
			br=new BufferedReader(isr);
			pw=new PrintWriter(osw);
			String msg=null;
			while(true) {
				System.out.print(">");
				msg=br.readLine();
				if(msg.equals("exit"))break;		//클라이언트가 종료하면
				
//				pw.flush();		//버퍼가 꽉차지않아도 flush()로 밀어내야함
				
			txtRoomChat.append(msg+"\n");		//읽어온 메세지를 textarea에 뿌려주는 역할
			}
			
			if(os!=null)os.close();
			if(is!=null)is.close();
			if(sock!=null)sock.close();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
}
