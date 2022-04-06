package com.cts.main;

import com.cts.designPatterns.builder.User;
import com.cts.designPatterns.singleton.Database;
import com.cts.designPatterns.singleton.DatabaseTwo;

public class Main {
    public static void main(String[] args) {

        //SINGLETON
        DatabaseTwo.getINSTANCE();

        //BUILDER
        User u = new User.UserBuilder("user1", "firstName1", "lastName1", "email@email.com").address("address1").build();




    }
}
