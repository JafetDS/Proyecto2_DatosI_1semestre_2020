package com.apirest.api.Servicio;

import Arboles.ArbolB;
import com.apirest.api.Data.UserList;
import com.apirest.api.Data.UserTree;
import com.apirest.api.Model.User;

import java.util.LinkedList;

public class UserServicioT {
    private static ArbolB<User> ArbolB = UserTree.getArbolB();

    //  @GET
    // @Produces(MediaType.APPLICATION_JSON)
    public ArbolB<User> getUsers(){

        return ArbolB;
        //{ return Response.ok(Lista).build();
    }
    public User addUser(User user){
        ArbolB.insert(user);

        return user;
    }

    public User getUser(User user){
        ArbolB.contains(user);
}

    public User editUser(String name, User user){
        User temp = getUser(name);
        if (temp!=null) {
            temp.setCorreo(user.getCorreo());
            return temp;
        }
        return null;
    }

    public void deleteUser(String name){
        ArbolB.remove(getUser(name));
    }
}
