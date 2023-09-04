package ru.mirea.it.ivt;

public class Main {
    public static void main(String[] args) {/*
        String s = "Hello world!";
        System.out.println(s);
        User user_1 = new User();
        User user_2 = new User("Programmer", "EasyPass");
        System.out.println("Number of users: " + User.NumberOfUsers);
        System.out.println("Name: " + user_1.getUsername() + "; Password: " + user_1.getPassword());
        System.out.println("Name: " + user_2.getUsername() + "; Password: " + user_2.getPassword());*/
        User[] Users = {new User("Maria", "Pass"),
                new User("Just", "FindIt"), new User()};
        var i = 0;
        while( i < Users.length){
            /*System.out.println("User " + (i+1) + " Name: " + Users[i].getUsername()
                    + "; Password: " + Users[i].getPassword());
            */
            System.out.println(Users[i]);
            i++;
        }
    }
}