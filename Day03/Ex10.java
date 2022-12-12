import java.util.Scanner;
class Ex10
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int kor=97,eng=79;
System.out.println("수학 점수를 입력하세요");
int math = sc.nextInt();
int total = kor+eng+math;
double avg = total*100/3/100.0;
char rank;


if(avg <= 100 && avg >= 90)
rank = 'A';
else if(avg <= 90 && avg >= 80)
rank = 'B';
else if(avg <= 80 && avg >= 70)
rank = 'C';
else if(avg <= 70 && avg >= 60)
rank = 'D';
else {
rank = 'F';
System.out.println("재수강요망");
}

String msg="\n학생성적관리프로그램(ver 0.1.0)";
msg += "\n----------------------------------";
msg += "\n국어: "+kor+ "영어:" +eng+ "수학:" +math;
msg += "\n합계:" +total + "평균:" + avg;
msg += "\n----------------------------------";
msg += "\n학점:" +rank;
System.out.println(msg);
}
}