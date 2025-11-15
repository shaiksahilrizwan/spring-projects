package com.demomvc.basic_mvc;

import com.demomvc.basic_mvc.Controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Basic_MVC {

    public static void main(String[] args) {
        ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
        UserController uc=ctx.getBean(UserController.class);
        uc.creatUser("Sahil");
        uc.creatUser("Pavan");
        uc.creatUser("Srinivas");
        uc.creatUser("Akmal");
        uc.getUsers();
        uc.creatUser("Lardof");
        uc.getUsers();
    }
    
//    private static ApplicationContext AnnotationConfigApplicationContext(Class<AppConfig> aClass) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
}
