package com.apirest.api.Data;

import Arboles.ArbolB;
import Arboles.ArbolSplay;
import com.apirest.api.Model.Empresa;
import com.apirest.api.Model.User;

public class EmpresaTree {
    public static ArbolSplay<Empresa> getArbolSplay() {
        ArbolSplay<User> ArbolB = new ArbolSplay();
        User user1 = new Empresa();
        User user2 = new Empresa();
        User user3 = new Empresa();
        User user4 = new Empresa();
        User user5 = new Empresa();

        ArbolSplay.insert(user1);
        ArbolSplay.insert(user2);
        ArbolSplay.insert(user3);
        ArbolSplay.insert(user4);
        ArbolSplay.insert(user5);

        return ArbolB;
    }
}
