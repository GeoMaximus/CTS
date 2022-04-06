package com.cts.designPatterns.builder;

public class User {
    //mandatory
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    //optional
    private String phone;
    private String address;
    private String birthdate;

    public User(UserBuilder userBuilder){
        //mmandatory
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        //optional
        this.phone = phone;
        this.address = address;
        this.birthdate = birthdate;
    }

    public static class UserBuilder{
        //mandatory
        private String username;
        private String firstName;
        private String lastName;
        private String email;
        //optional
        private String phone;
        private String address;
        private String birthdate;

        public UserBuilder(String username, String firstName, String lastName, String email) {
            this.username = username;
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
        }

        public UserBuilder birthdate(String birthdate){
            this.birthdate = birthdate;
            return this;
        }

        public UserBuilder address(String address){
            this.address = address;
            return this;
        }

        public UserBuilder phone(String phone){
            this.phone = phone;
            return this;
        }

        public User build(){
            User u = new User(this);
            return u;
        }

    }



}
