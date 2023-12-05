package com.example;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;

import GUI.LoginGUI;

import com.mongodb.client.MongoCollection;
import org.bson.Document;

public class App {
    public static void main(String[] args) {
        // Kết nối tới MongoDB Server (địa chỉ mặc định là localhost, cổng mặc định là 27017)
        // try (MongoClient mongoClient = MongoClients.create("mongodb+srv://Khoyne:123@khoy.ngkwfo4.mongodb.net/")) {

        //     // Chọn cơ sở dữ liệu
        //     MongoDatabase database = mongoClient.getDatabase("SampleDB"); 

        //     // Chọn bảng (collection)
        //     MongoCollection<Document> collection = database.getCollection("ChatLieu");

        //     // Lấy dữ liệu từ collection
        //     for (Document document : collection.find()) {
        //         System.out.println(document.toJson());
        //     }

        // } catch (Exception e) {
        //     e.printStackTrace();
        // }
        new LoginGUI();
    }
}
