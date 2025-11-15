package com.demomvc.basic_mvc.DB;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class DBConnection {
    private List<String> users;
    public DBConnection(){
        users = new ArrayList<>();
        System.out.println("DB Connected");
    }
//    }
//    public void init(){
//        users = new ArrayList<>();
//        System.out.println("DB Connected");
//    }
    public List<String>getUsers(){
        return users;
    }
    public void cleanup(){
        System.out.println("DB Disconnected");
    }
    public void addUser(String s){
        users.add(s);
    }
    
}
