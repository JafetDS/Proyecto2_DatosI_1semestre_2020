package com.apirest.api.Resourge;


import com.apirest.api.Model.User;
import com.apirest.api.Servicio.UserServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping(value = "/aplication/users")
public class UserResource {

    @Autowired
    private UserServicio userServicio;

    @GetMapping
    public LinkedList<User> getUsers(){
        return userServicio.getUsers();
    }

    @PostMapping
    public User addUser (@RequestBody User user){
        return userServicio.addUser(user);
    }

    @GetMapping(value = "/{nombre}")
    public LinkedList<User> getUser(@PathVariable("nombre") String name){
        LinkedList<User> list = new LinkedList();
        list.add(userServicio.getUser(name));
        return list;
    }

    @PutMapping(value ="/{nombre}")
    public User editUser(@PathVariable("nombre") String nombre,@RequestBody User user){
        return userServicio.editUser(nombre,user);
    }

    @DeleteMapping (value= "/{nombre}")
    public void deleteUser(@PathVariable("nombre")String nombre){
        userServicio.deleteUser(nombre);
    }

}
