package com.apirest.api.Servicio;

import Arboles.ArbolB;
import Arboles.ArbolSplay;
import com.apirest.api.Data.EmpresaTree;
import com.apirest.api.Data.UserTree;
import com.apirest.api.Model.Empresa;
import com.apirest.api.Model.User;

public class EmpresaServicio {
    public class UserServicioT {
        private static Arboles.ArbolSplay<Empresa> ArbolSplay= EmpresaTree.getArbolSplay();

        //  @GET
        // @Produces(MediaType.APPLICATION_JSON)
        public Arboles.ArbolSplay<Empresa> getUsers(){

            return ArbolSplay;
            //{ return Response.ok(Lista).build();
        }
        public User addUser(Empresa Empresa){
            ArbolSplay.insert(Empresa);

            return user;
        }

        public User getUser(User user){
            ArbolSplay.contains(user);
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
