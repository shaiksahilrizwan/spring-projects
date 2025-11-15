package com.demomvc.basic_mvc.Service;

import com.demomvc.basic_mvc.Repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserService {
    private UserRepository ur;
    @Autowired
    public UserService(UserRepository ur){
        this.ur=ur;
    }
    public void addUser(String user){
        ur.saveUser(user);
    }
    public List<String> getUsers(){
        return ur.getUsers();
    }
}
