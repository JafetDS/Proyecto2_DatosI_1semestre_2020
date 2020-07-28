package Arboles;

import Ordenamiento.BubbleSort;
import Ordenamiento.QuickSort;
import Ordenamiento.RadixSort;

import java.sql.SQLOutput;
import java.time.format.TextStyle;
import java.util.ArrayList;

public class Main {
    public static void main(String args[]){
        ArbolSplay<String> ArbolS = new ArbolSplay();
        ArbolAVL<String> ArbolA = new ArbolAVL();
        ArbolB<String> ArbolB = new ArbolB();

        RadixSort RS = new RadixSort();
        QuickSort QS = new QuickSort();
        BubbleSort BS = new BubbleSort();

        /*/Nombres.add("Mauro");
        Nombres.add("Marco");
        Nombres.add("Kevin");
        Nombres.add("Daniel");
        Nombres.add("Pedro");
        Nombres.add("David");
        Nombres.add("Dante");
        Nombres.add("Pedru");/*/

        int arr[] = {170, 45, 75, 90, 802, 24, 2, 66};

        RS.print(arr);
        BS.sort(arr);
        //RS.radixsort(arr);
        RS.print(arr);



    }
}