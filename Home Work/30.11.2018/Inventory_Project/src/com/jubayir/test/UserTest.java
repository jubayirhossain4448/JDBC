package com.jubayir.test;

import com.jubayir.domain.User;
import com.jubayir.service.UserService;
import java.util.Date;

public class UserTest {

    public static void main(String[] args) {
        // UserService.createTable();
        User user = new User("Salesman", "456", "Salesman", "Md.", "Jubayir",
                "jubayir@gmail.com", "01918718282", new Date(), true);
        UserService.insert(user);

        // User u = UserService.getUserbyUserName("admin", "123", true);
        //System.out.println(u);
    }

}
