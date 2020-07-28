package com.apirest.api.Servicio;

import Arboles.ArbolB;
import com.apirest.api.Data.EmpresaTree;
import com.apirest.api.Model.Empresa;
import com.apirest.api.Model.User;

public class RecetaServicio {
    private static Arboles.ArbolAVL<Receta> ArbolAVL= EmpresaTree.ArbolAVL();

    //  @GET
    // @Produces(MediaType.APPLICATION_JSON)
    public ArbolAVL<Receta> getUsers(){

        return ArbolSplay;
        //{ return Response.ok(Lista).build();
    }
    public User addUser(Receta Receta){
        ArbolAVL.insert(Receta);

        return Receta;
    }

    public User getUser(User user){
        ArbolAVL.contains(user);
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
        ArbolAVL.remove(getUser(name));
    }
}
