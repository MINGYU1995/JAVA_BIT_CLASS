package test;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.List;
import java.util.Set;

import org.bson.*;
import org.bson.conversions.Bson;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import static com.mongodb.client.model.Filters.eq;

   

class Student {
	String name;
	int kor,eng,mat,stuNum;
}

//학생성적관리 프로그램? 
public class codeTest {
	static ArrayList<Student> list = new ArrayList<Student>();
	public static void main(String[] args) {
		//mongo
		 String ip = "127.0.0.1";
	     int port = 27017;
	     String db = "student";
	     String table = "test";
	     MongoClient  mongoClient = new MongoClient(ip,port);
	     MongoDatabase mongoDb = mongoClient.getDatabase(db);
	     MongoCollection<Document> collection = mongoDb.getCollection(table);
	    //mongo    
	     
	        
		
		Scanner sc = new Scanner(System.in);
		System.out.println("학생성적관리 프로그램");
		
		while(true) {
			System.out.print("1.리스트,2.보기,3.입력,4.수정 ,5.삭제 , 0.종료>");
			int input = sc.nextInt();
			Student stu = new Student();

			//리스트
			if(input == 1) {				
				
				MongoCursor<Document> cursor = collection.find().iterator();
				try {
				
					System.out.println("이름\t학번\t국어\t영어\t수학");
					cursor = collection.find().iterator();
					while(cursor.hasNext()) {
						Document doc2 = cursor.next();
						
						System.out.println(doc2.get("name")+"\t"+doc2.get("stdNum")+"\t"+doc2.get("kor")+"\t"
								+doc2.get("eng")+"\t"+doc2.get("mat"));
						System.out.println();
					}
					
				} catch (Exception e) {
					System.out.println("err: " + e);
				}				
			}
			//보기
			if(input == 2) {
				sc.nextLine();
				MongoCursor<Document> cursor = collection.find().iterator();
				int total=0;
				double avg = 0;
				System.out.print("이름>");
				String name = sc.nextLine();
				
				cursor = collection.find(Filters.eq("name", name)).iterator();
				int sum = 0;
				if(cursor.hasNext()) {
					Document doc2 = cursor.next();
					sum = doc2.getInteger("kor")+doc2.getInteger("eng")+doc2.getInteger("mat");
				}
				System.out.println("개인합계:"+sum+"점");
				System.out.println("개인평균:"+(sum/3.0)+"점");
				
				cursor = collection.find().iterator();
				while(cursor.hasNext()) {
					Document doc2 = cursor.next();
					total += (doc2.getInteger("kor")+doc2.getInteger("eng")+doc2.getInteger("mat"));
				}
				int cnt = (int)collection.estimatedDocumentCount();
				avg = total/(cnt*3);
				
			
				System.out.println("전체인원");
				System.out.println("합계:"+total +"점");
				System.out.println("평균:"+avg + "점");
				//System.out.println(stu1.name+"\t"+stu1.stuNum+"\t"+stu1.kor+"\t"+stu1.eng+"\t"+stu1.mat);
			
				
			}
			//입력
			if(input == 3) {
			
		        insertOne(collection);
		        //insertMany(collection);
		        //mongoClient.close();
		       // list.add(stu);
		        
				
			}
			//수정
			if(input == 4) {
				updateOne(collection);
				
			}
		
			//삭제
			if(input == 5) {
				deleteOne(collection);
				
				
			}	
			//완전종료
			if(input == 0) {
				
			}
			
		}
		
	}
	public static void insertOne(MongoCollection<Document> collection) {
		Student stu = new Student();
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		System.out.print("이름>");
		stu.name = sc2.nextLine();
		
		System.out.print("학번>");
		stu.stuNum = sc.nextInt();
		
		System.out.print("국어>");
		stu.kor = sc.nextInt();
				
		System.out.print("영어>");
		stu.eng = sc.nextInt();
		
		System.out.print("수학>");
		stu.mat = sc.nextInt();	
		Document doc = null;
		doc = new Document("name",stu.name).append("stdNum",stu.stuNum).
				append("kor",stu.kor).append("eng", stu.eng).append("mat", stu.mat);
		list.add(stu);
		collection.insertOne(doc);
		
	}	
	public static void deleteOne(MongoCollection<Document> collection) {
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 학번을 입력하세요>");
		int hak = sc.nextInt();
		MongoCursor<Document> cursor = collection.find().iterator();
		
		collection.deleteOne(Filters.eq("stdNum", hak));

		
	}
	public static void updateOne(MongoCollection<Document> collection) {
		Scanner sc = new Scanner(System.in);
		Student stu = new Student();
		System.out.print("수정할 사원명 입력 > ");
		String name = sc.nextLine();
		
		Bson query = eq("name", name);
		
		System.out.print("수정할 학번을 입력하세요>");
		int hak = sc.nextInt();
		
		System.out.print("국어>");
		stu.kor = sc.nextInt();
				
		System.out.print("영어>");
		stu.eng = sc.nextInt();
		
		System.out.print("수학>");
		stu.mat = sc.nextInt();	
		
		Bson edit1 = Updates.combine(Updates.set("kor",stu.kor));
		Bson edit2 = Updates.combine(Updates.set("eng",stu.eng));
		Bson edit3 = Updates.combine(Updates.set("mat",stu.mat));
		collection.updateOne(query,edit1);
		collection.updateOne(query,edit2);
		collection.updateOne(query,edit3);
//		MongoCursor<Document> cursor = collection.find().iterator();
//		collection.deleteOne(Filters.eq("stdNum", hak));
		

		
	}
}

