package com.apirest.api.Servicio;


import com.apirest.api.Data.UserList;
import com.apirest.api.Model.User;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


/**
 *
 */
@Component
public class UserServicio {
    private static LinkedList<User> Lista = UserList.getLista();

  //  @GET
   // @Produces(MediaType.APPLICATION_JSON)
    public LinkedList<User> getUsers(){

        return Lista;
        //{ return Response.ok(Lista).build();
    }
    public User addUser(User user){
        Lista.add(user);

        return user;
    }

    public User getUser(String name){
        for(User user: Lista){
            if (user.getNombre().equals(name)){
                return user;
            }
        }
        return null;
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
        Lista.remove(getUser(name));
    }

}
