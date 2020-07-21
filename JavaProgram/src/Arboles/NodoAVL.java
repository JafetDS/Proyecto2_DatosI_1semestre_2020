package Arboles;

public class NodoAVL {

    int element;
    NodoAVL left;
    NodoAVL right;
    int height;

    public NodoAVL(int element) {
        this(element, null, null);
    }

    public NodoAVL(int element, NodoAVL left, NodoAVL right) {
        this.element = element;
        this.left = left;
        this.right = right;
        this.height = 0;
    }
}
