package Arboles;

import java.time.format.TextStyle;

public class Main {
    public static void main(String args[]){
        ArbolB<String> Arbol = new ArbolB();

        Arbol.insert("Luis");
        Arbol.insert("Marco");
        Arbol.insert("Kevin");
        Arbol.insert("Daniel");
        Arbol.insert("Pedro");
        Arbol.insert("David");
        Arbol.insert("Dante");
        Arbol.insert("Pedru");

        System.out.println(Arbol.findMin());
        System.out.println(Arbol.findMax());

    }
}
