package test;
import java.util.List;
import java.util.Set;

import org.bson.*;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
   
public class Mongo_Test {
    public static void main(String args[]){
        String ip = "127.0.0.1";
        int port = 27017;
        String db = "student";
        String table = "test";
        
        //Connect to MongoDB
        MongoClient  mongoClient = new MongoClient(ip,port);
        MongoDatabase mongoDb = mongoClient.getDatabase(db);
        MongoCollection<Document> collection = mongoDb.getCollection(table);
        
        insertOne(collection);
        //insertMany(collection);
        mongoClient.close();
        
    }
    public static void insertOne(MongoCollection<Document> collection) {
    	Document doc = null;
    	doc = new Document("name","Joy").append("subject","math").append("score",75);
    	collection.insertOne(doc);
    	
    }
}