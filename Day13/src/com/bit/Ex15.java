package com.bit;
import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;

class Student{
	int kor,eng,mat,stuNum;
}

public class Ex15 {
static String result = "";
	public static void main(String[] args) {
		
		File f = new File("TestList.txt");
		OutputStream os;
		
		List<Student> list = new ArrayList<Student>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("학점 계산기 (ver 0.5.0)");
		boolean boo = true;
		
		
		while(boo) {
			//6번 들어가 있는 데이터를 파일형태로 출력시키기.
			//7번 저장되어있는 데이터 불러오기.
			
			Date date = new Date(f.lastModified());
			SimpleDateFormat sdf = new SimpleDateFormat("a hh:MM");
			result += sdf.format(date) + "\t";
			
			System.out.print("1.리스트 2.보기 3.입력 4.수정 5.삭제 0.종료>");
			int input = sc.nextInt();
			
			// 1. 리스트
			if(input == 1) { //리스트 불러오는 건 수정과 삭제랑은 별개.
				f = new File("TestList.txt");
				InputStream is = null;
				BufferedInputStream bis = null;
				
				try {
					
					is = new FileInputStream(f);
					bis = new BufferedInputStream(is);
					List<String> arr = new ArrayList<String>();
					String str = "";
					while(true) {	
						int temp = bis.read();
						if(temp == -1) {
							break;
						}
						if(temp == '\n') {
							arr.add(str);
							str = "";
						}else {
							str += (char)temp;
						}
					}
					list = new ArrayList<Student>();
					for (int i = 0; i < arr.size(); i++) {
						str = arr.get(i);
						String[] arrStr = str.split("\t");
						Student stu = new Student();
						stu.stuNum = Integer.parseInt(arrStr[0]);
						stu.kor = Integer.parseInt(arrStr[1]);
					 	stu.eng = Integer.parseInt(arrStr[2]);
						stu.mat = Integer.parseInt(arrStr[3]);
						list.add(stu);
					}
					
					if(bis!=null)bis.close();
					if(is!=null)is.close();
					
				} catch (FileNotFoundException e1) {		
					e1.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
					System.out.println("학번\t국어\t영어\t수학\t파일수정시간\t");
					for (int i = 0; i < list.size(); i++) {
						Student stu = list.get(i);
						System.out.println(stu.stuNum+"\t"+stu.kor+"\t"+stu.eng+"\t"+stu.mat+"\t"+result);
					}		      
				// 3. 입력 
			}else if(input == 3) {		
				Student stu = new Student();
				
				System.out.print("새로 입력할 학번을 입력해주세요:");
				stu.stuNum = sc.nextInt();
	
				System.out.print("국어의 성적은?");
				stu.kor = sc.nextInt();
				
				System.out.print("영어의 성적은?");
				stu.eng = sc.nextInt();
					
				System.out.print("수학의 성적은?");
				stu.mat = sc.nextInt();
						
				list.add(stu);
				
				try {
					os = new FileOutputStream(f);
					
					for (int i = 0; i < list.size(); i++) {
						Student student = list.get(i);
						int studentNum = student.stuNum;
						int studentKor = student.kor;
						int studentEng = student.eng;
						int studentMat = student.mat;
						String str = ""+studentNum + "\t" + studentKor + "\t" + studentEng + "\t" + studentMat + "\n";
						os.write(str.getBytes());//한라인씩 써진다. 두번째 사람 들어올떄 
								//getBytes str 에 있는 문자열 하나하나 짤라서 바이트배열로 만듬.
						
					}
					
					os.close();
				}catch(FileNotFoundException e) {
					e.printStackTrace();
				}catch(IOException e) {
					e.printStackTrace();
				} 
			
				// 4. 수정
			}else if(input == 4) {	
				// 학번 조회
				update(list, sc);		
				// 5. 삭제
			}else if(input == 5) {
				//System.out.print("삭제할 학번을 입력하세요 ");
				//int su2 = sc.nextInt();
				for (int i = 0; i < list.size(); i++) {
					Student stu = list.get(i);
				//	if(stu.stuNum == su2) { //list 값 존재
						list.remove(i);	//삭제 완료.		
						try {
							String msg;			
							BufferedReader br = new BufferedReader(new FileReader(new File("TestList.txt")));
							File file = new File("TestList.txt");
					
							//파일 생성
						      file.createNewFile();
						      FileWriter fw = new FileWriter(file);
						      BufferedWriter bw = new BufferedWriter(fw);
				
						      while((msg=br.readLine())!=null) {	
						    	 // if(msg.equals(su2)) {		  
						    		  bw.write(msg);
						    		  bw.write("\n");			    		 
						    	 // }
						    	  bw.close();
						    	  fw.close();	
						    	  
						      }
						      System.out.println("삭제완료");
						} catch (FileNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						
					//}	
				}
				// 2. 상세이력
			}else if(input == 2) {
				System.out.print("확인 할 학번을 입력하세요:");
				int su2 = sc.nextInt();
				for (int i = 0; i < list.size(); i++) {
					Student stu = list.get(i);
					if(stu.stuNum == su2) { //특정 해당 
						char score ;
						int sum = stu.eng+stu.kor+stu.mat;
						int allKor = 0, allEng = 0, allMat = 0;
						double avg = sum*100/3/100.0;
						
						for (int j = 0; j < list.size(); j++) {
							allKor += list.get(i).kor;
							allEng += list.get(i).eng;
							allMat += list.get(i).mat;
						}
						int allStudentScore = allKor+allEng+allMat;
						double allStudentAvg = (allStudentScore*100/3/list.size()/100.0);
						
						
						switch((int)avg/10){
						case 10 : score = 'A';break;
						case 9 : score = 'A';break;
						case 8 : score = 'B';break;
						case 7 : score = 'C';break;
						default : score ='F';
						}
						System.out.println("학번\t합계\t평균\t학점\t전체평균\t");
						System.out.println(stu.stuNum+"\t"+sum+"\t"+avg+"\t"+score+"\t"+allStudentAvg);
					}
				}		
			}
			// 0. 종료 
			if(input == 0)break;	
		}				
	}
	public static String UpdateStr(String str) {
		return str;
	}
		
	private static void update(List list, Scanner sc) {
	
		System.out.print("수정할 학번을 입력하세요 ");
		int su2 = sc.nextInt();
		int idx = findIdx(su2, list);
		if(idx==-1) {
			System.out.println("찾는 학번이 없습니다.");
		}
		Student stu = (Student) list.get(idx);
		System.out.print("국어의 성적은?");
		stu.kor = sc.nextInt();
		System.out.print("영어의 성적은?");
		stu.eng = sc.nextInt();
		System.out.print("수학의 성적은?");
		stu.mat = sc.nextInt();
		
		list.set(idx,stu);
		
}
		

	//  학번 찾기
private static int findIdx(int su2, List list) {

	for (int i = 0; i < list.size(); i++) {
		Student stu = (Student)list.get(i);
		if(stu.stuNum==su2) return i;
	}
	return -1;
}

}
