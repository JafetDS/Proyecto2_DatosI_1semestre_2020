package Arboles;

import java.sql.SQLOutput;
import java.time.format.TextStyle;

public class Main {
    public static void main(String args[]){
        ArbolSplay<String> ArbolS = new ArbolSplay();
        ArbolAVL<String> ArbolA = new ArbolAVL();
        ArbolB<String> ArbolB = new ArbolB();

        ArbolA.insert("Mauro");
        ArbolA.insert("Marco");
        ArbolA.insert("Kevin");
        ArbolA.insert("Daniel");
        ArbolA.insert("Pedro");
        ArbolA.insert("David");
        ArbolA.insert("Dante");
        ArbolA.insert("Pedru");

        System.out.println(ArbolA.findroot());



    }
}