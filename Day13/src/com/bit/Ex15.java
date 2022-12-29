package com.bit;
import java.util.*;
import java.io.*;

class Student{
	int kor,eng,mat,stuNum;
}

public class Ex15 {
//CRUD 순으로 기능을 적용한다. 
//list 는 순서를 위해 사용한다.	
	public static void main(String[] args) {
		String msg = "";
		String[] msg2 = new String[5];
		int[] msgInt2 = new int[5];
		byte[] buf = new byte[2];
		File f = new File("TestList.txt");
		OutputStream os;
		
		
		
		
		List<Student> list = new ArrayList<Student>();
		//ArrayList<Integer> listTest = new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("학점 계산기 (ver 0.3.0)");
		boolean boo = true;
		
		while(boo) {
			//6번 들어가 있는 데이터를 파일형태로 출력시키기.
			//7번 저장되어있는 데이터 불러오기.
			System.out.print("1.리스트 2.입력 3.수정 4.삭제 5.상세이력 6.Test 0.종료>");
			int input = sc.nextInt();
			
			// 1. 리스트
			if(input == 1) {
					System.out.println("학번\t국어\t영어\t수학\t");
					for (int i = 0; i < list.size(); i++) {
						Student stu = list.get(i);
						System.out.println(stu.stuNum+"\t"+stu.kor+"\t"+stu.eng+"\t"+stu.mat);
					}		      
				// 2. 입력 
			}else if(input == 2) {
				Student stu = new Student();
				
				System.out.print("새로 입력할 학번을 입력해주세요:");
				stu.stuNum = sc.nextInt();
				//msgInt2[0] = stu.stuNum;
				
				
				System.out.print("국어의 성적은?");
				stu.kor = sc.nextInt();
				//msgInt2[1] = stu.kor;
			
				
				System.out.print("영어의 성적은?");
				stu.eng = sc.nextInt();
				//msgInt2[2] = stu.eng;
				
				
				System.out.print("수학의 성적은?");
				stu.mat = sc.nextInt();
				msgInt2[3] = stu.mat;
				
				
				
				
				list.add(stu);
//				for (int i = 0; i < list.size(); i++) {
//2					//for (int j = 0; j < list.size(); j++) {
//						
//							msg2[i] = ;
//					//}
//				}
							
				// 3. 수정
			}else if(input == 3) {	
				// 학번 조회
				update(list, sc);		
				// 4. 삭제
			}else if(input == 4) {
				System.out.print("수정할 학번을 입력하세요 ");
				int su2 = sc.nextInt();
				for (int i = 0; i < list.size(); i++) {
					Student stu = list.get(i);
					if(stu.stuNum == su2) {
						list.remove(i);
					}			
				}
				// 5. 상세이력
			}else if(input == 5) {
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
			}else if(input == 6) {
				//저장되어있는 list를 파일형태로 내보내기 
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
					System.out.println("완작성료");
				}catch(FileNotFoundException e) {
					e.printStackTrace();
				}catch(IOException e) {
					e.printStackTrace();
				} //파일 데이터 출력하기
			}else if(input == 7) {
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
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
			}
			// 0. 종료 
			if(input == 0)break;	
		}				
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
