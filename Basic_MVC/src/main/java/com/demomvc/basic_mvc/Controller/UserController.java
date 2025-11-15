package com.demomvc.basic_mvc.Controller;
import com.demomvc.basic_mvc.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
@Controller
public class UserController {
    private UserService us;
    @Autowired
    public void UserController(UserService us){
        this.us=us;
    }
    public void creatUser(String s){
        us.addUser(s);
    }
    public void getUsers(){
        for(String s: us.getUsers()){
            System.out.println("USER: "+s);
        }
    }
}
