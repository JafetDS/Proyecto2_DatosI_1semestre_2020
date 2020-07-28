package com.apirest.api.Data;

import Arboles.ArbolB;
import Arboles.ArbolSplay;
import com.apirest.api.Model.Empresa;
import com.apirest.api.Model.User;

public class RecetasTree {
    Arboles.ArbolAVL<User> ArbolAVL = new ArbolAVL();
    User user1 = new Empresa();
    User user2 = new Empresa();
    User user3 = new Empresa();
    User user4 = new Empresa();
    User user5 = new Empresa();

        ArbolAVL.insert(user1);
        ArbolAVL.insert(user2);
        ArbolAVL.insert(user3);
        ArbolAVL.insert(user4);
        ArbolAVL.insert(user5);

        return ArbolB;
}
}
