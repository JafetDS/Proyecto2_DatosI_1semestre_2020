package Arboles;

import java.security.Key;

public class NodoSpaly {
    Comparable key;
    NodoSpaly left;
    NodoSpaly right;

    NodoSpaly(Comparable theKey) {
        key = theKey;
        left = right = null;
    }

}
