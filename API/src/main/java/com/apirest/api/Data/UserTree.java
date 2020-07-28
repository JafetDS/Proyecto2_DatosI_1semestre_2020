package com.apirest.api.Data;

import com.apirest.api.Model.User;

import java.util.LinkedList;
import Arboles.ArbolB;
public class UserTree {
    public static ArbolB<User> getArbolB() {
        ArbolB<User> ArbolB = new ArbolB();
        User user1 = new User(1, "juan", "FFF");
        User user2 = new User(2, "Pedro", "pp");
        User user3 = new User(3, "Pepe", "tt");
        User user4 = new User(4, "jose", "jj");
        User user5 = new User(5, "julio", "Faa");

        ArbolB.insert(user1);
        ArbolB.insert(user2);
        ArbolB.insert(user3);
        ArbolB.insert(user4);
        ArbolB.insert(user5);

        return ArbolB;
    }
}
