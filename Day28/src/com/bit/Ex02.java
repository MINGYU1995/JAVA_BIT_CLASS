package com.bit;

import org.w3c.dom.Document;

public class Ex02 {

	public static void main(String[] args) {
		String addr = "127.0.0.1";
		MongoClient client = null;
		try{
			client = new MongoClient(addr);
			client.getDatabase("mongodbVSCode");
			db.getcollection("sales");
			MongoClolection<Document> coll = db.getCollection("sales");
			Document doc = new Document();
			
			coll.insertOne(doc);
			
			client.close();
			client.close();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
