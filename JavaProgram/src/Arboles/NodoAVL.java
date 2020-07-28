package Arboles;

/**
 * Arbol AVL
 */
public class NodoAVL {

    Comparable element;
    NodoAVL left;
    NodoAVL right;
    int height;

    /**
     * Constructor del arbol AVL
     * @param element
     */
    public NodoAVL(Comparable element) {
        this(element, null, null);
    }

    public NodoAVL(Comparable element, NodoAVL left, NodoAVL right) {
        this.element = element;
        this.left = left;
        this.right = right;
        this.height = 0;
    }
}
