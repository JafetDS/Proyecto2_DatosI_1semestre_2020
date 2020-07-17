package Arboles;

public class NodoA <T> {
    T element;
    NodoA<T> left;
    NodoA<T> right;

    public NodoA(T element) {
        this(element, null, null);
    }

    public NodoA(T element, NodoA<T> left, NodoA<T> right) {
        this.element = element;
        this.left = left;
        this.right = right;
    }
}

