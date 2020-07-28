package com.apirest.api.Data;

import com.apirest.api.Model.User;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UserList {
    public static LinkedList<User> getLista(){
        LinkedList<User>Lista = new LinkedList();
        User user1 = new User(1,"juan","FFF");
        User user2 = new User(2,"Pedro","pp");
        User user3 = new User(3,"Pepe","tt");
        User user4 = new User(4,"jose","jj");
        User user5 = new User(5,"julio","Faa");

        Lista.add(user1);
        Lista.add(user2);
        Lista.add(user3);
        Lista.add(user4);
        Lista.add(user5);

        return Lista;


    }
}
