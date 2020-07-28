package Arboles;

import java.util.List;

/**
 *
 * @param <T>
 */
public class ArbolB <T extends Comparable<? super T>> {
    private NodoA<T> root;

    /**
     * Construcyor del arbol binario
     */
    public ArbolB() {
        this.root = null;
    }

    /**
     * Metodo para saber si el nodo esta vacio
     * @return
     */
    public boolean isEmpty() {
        return this.root == null;
    }

    /**
     * Metodo para saber si un elemento ya esta dentro del arbol
     * @param element
     * @return
     */
    public boolean contains(T element) {
        return this.contains(element, this.root);
    }
    private boolean contains(T element, NodoA<T> node) {
        if (node == null) {
            return false;
        } else {
            int compareResult = element.compareTo(node.element);
            if (compareResult < 0)
                return contains(element, node.left);
            else if (compareResult > 0)
                return contains(element, node.right);
            else
                return true;
        }
    }

    /**
     * Metodo para insertar elementos dentro del arbol binario
     * @param element
     */
    public void insert(T element) {
        this.root = this.insert(element, this.root);
    }
    private NodoA<T> insert(T element, NodoA<T> node) {
        if (node == null)
            return new NodoA<T>(element, null, null);
        int compareResult = element.compareTo(node.element);
        if (compareResult < 0)
            node.left = this.insert(element, node.left);
        else if (compareResult > 0)
            node.right = this.insert(element, node.right);
        return node;
    }

    /**
     * Metodo para eliminar elementos dentro del arbol binario
     * @param element
     */
    public void remove(T element) {
        this.root = this.remove(element, this.root);
    }
    private NodoA<T> remove(T element, NodoA<T> node) {
        if (node == null)
            return node;

        int compareResult = element.compareTo(node.element);
        if (compareResult < 0)
            node.left = remove(element, node.left);

        else if (compareResult > 0)
            node.right = remove(element, node.right);

        else if (node.left != null && node.right != null){
            node.element = findMin(node.right).element;
            node.right = remove(node.element, node.right);
        }
        else {
            node = node.left != null ? node.left : node.right;
        }

        return node;
    }

    /**
     * Metodo para encontrar el elemento mas pequeño dentro del arbol
     * @return
     */
    public T findMin() {
        if (this.isEmpty()) {
            return null;
        } else {
            return this.findMin(this.root).element;
        }
    }
    private NodoA<T> findMin(NodoA<T> node) {
        if (node == null)
            return null;
        else if (node.left == null)
            return node;
        else
            return findMin(node.left);
    }

    /**
     * Metodo para encontrar el elemento mas grande dentro del arbol
     * @return
     */
    public T findMax() {
        if (this.isEmpty()) {
            return null;
        } else {
            return this.findMax(this.root).element;
        }
    }
    private NodoA<T> findMax(NodoA<T> node) {
        if (node!= null)
            while (node.right != null) {
                node = node.right;
            }
        return node;
    }


    private List<T> toList(){
        return null;
    }

}

