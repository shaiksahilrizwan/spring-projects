package com.demomvc.basic_mvc.Repository;

import com.demomvc.basic_mvc.DB.DBConnection;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class UserRepository {
    private DBConnection db;
    
    @Autowired
    public UserRepository(DBConnection db){
        this.db=db;
    }
    public void saveUser(String user){
        db.addUser(user);
    }
    public List<String> getUsers(){
       return db.getUsers();
    }

    
}
