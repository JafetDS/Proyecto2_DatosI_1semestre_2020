package Arboles;

/**
 *
 * @param <T>
 */
public class NodoA <T> {
    T element;
    NodoA<T> left;
    NodoA<T> right;

    /**
     * Constructor del nodoA
     * @param element
     */
    public NodoA(T element) {
        this(element, null, null);
    }

    public NodoA(T element, NodoA<T> left, NodoA<T> right) {
        this.element = element;
        this.left = left;
        this.right = right;
    }
}

