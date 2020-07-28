package Arboles;

import java.security.Key;

/**
 * Nodo para Arbol Splay
 */
public class NodoSpaly {
    Comparable key;
    NodoSpaly left;
    NodoSpaly right;

    /**
     * Constructor del nodo para el arbol splay
     * @param theKey
     */
    NodoSpaly(Comparable theKey) {
        key = theKey;
        left = right = null;
    }

}
