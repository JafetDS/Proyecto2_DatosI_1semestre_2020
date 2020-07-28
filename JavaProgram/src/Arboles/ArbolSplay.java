package Arboles;

/**
 *
 * @param <T>
 */
public class ArbolSplay<T extends Comparable<? super T>> {
    private NodoSpaly root;

    /**
     * Constructor del arbol Splay
     */
    public ArbolSplay() {
        this.root = null;
    }

    /**
     * Metodo para retornar la raiz del arbol Splay
     * @return
     */
    public Comparable findroot(){
        return this.root.key;
    }

    /**
     * Metodo para insertar elementos dentro del arbol Splay
     * @param key
     */
    public void insert(Comparable key) {
        NodoSpaly n;
        int c;
        if (root == null) {
            root = new NodoSpaly(key);
            return;
        }
        splay(key);
        if ((c = key.compareTo(root.key)) == 0) {
            //	    throw new DuplicateItemException(x.toString());
            return;
        }
        n = new NodoSpaly(key);
        if (c < 0) {
            n.left = root.left;
            n.right = root;
            root.left = null;
        } else {
            n.right = root.right;
            n.left = root;
            root.right = null;
        }
        root = n;
    }

    /**
     * Metodo para eliminar elementos dentro del arbol Splay
     * @param key
     */
    public void remove(Comparable key) {
        NodoSpaly x;
        splay(key);
        if (key.compareTo(root.key) != 0) {
            //            throw new ItemNotFoundException(x.toString());
            return;
        }
        // Now delete the root
        if (root.left == null) {
            root = root.right;
        } else {
            x = root.right;
            root = root.left;
            splay(key);
            root.right = x;
        }
    }

    /**
     * Metodo para encontrar el elemento menor
     * @return
     */
    public Comparable findMin() {
        NodoSpaly x = root;
        if(root == null) return null;
        while(x.left != null) x = x.left;
        splay(x.key);
        return x.key;
    }

    /**
     * Metodo para encontrar el mayor elemento
     * @return
     */
    public Comparable findMax() {
        NodoSpaly x = root;
        if(root == null) return null;
        while(x.right != null) x = x.right;
        splay(x.key);
        return x.key;
    }

    /**
     * Metodo para encontrar un elemento en especifico
     * @param key
     * @return
     */
    public Comparable find(Comparable key) {
        if (root == null) return null;
        splay(key);
        if(root.key.compareTo(key) != 0) return null;
        return root.key;
    }

    /**
     * Metodo para verificar si el nodo donde se encuentra esta vacio
     * @return
     */
    public boolean isEmpty() {
        return root == null;
    }


    /**
     * Metodo para pocisionar un nodo en especifico como raiz
     * @param key
     */
    public void moveToRoot(Comparable key) {
        NodoSpaly l, r, t, y;
        l = r = header;
        t = root;
        header.left = header.right = null;
        for (;;) {
            if (key.compareTo(t.key) < 0) {
                if (t.left == null) break;
                r.left = t;
                r = t;
                t = t.left;
            } else if (key.compareTo(t.key) > 0) {
                if (t.right == null) break;
                l.right = t;
                l = t;
                t = t.right;
            } else {
                break;
            }
        }
        l.right = t.left;
        r.left = t.right;
        t.left = header.right;
        t.right = header.left;
        root = t;
    }

    private static NodoSpaly header = new NodoSpaly(null);

    /**
     * Metodo para hacerle splay al arbol
     * @param key
     */
    public void splay(Comparable key) {
        NodoSpaly l, r, t, y;
        l = r = header;
        t = root;
        header.left = header.right = null;
        for (;;) {
            if (key.compareTo(t.key) < 0) {
                if (t.left == null) break;
                if (key.compareTo(t.left.key) < 0) {
                    y = t.left;
                    t.left = y.right;
                    y.right = t;
                    t = y;
                    if (t.left == null) break;
                }
                r.left = t;
                r = t;
                t = t.left;
            } else if (key.compareTo(t.key) > 0) {
                if (t.right == null) break;
                if (key.compareTo(t.right.key) > 0) {
                    y = t.right;
                    t.right = y.left;
                    y.left = t;
                    t = y;
                    if (t.right == null) break;
                }
                l.right = t;
                l = t;
                t = t.right;
            } else {
                break;
            }
        }
        l.right = t.left;
        r.left = t.right;
        t.left = header.right;
        t.right = header.left;
        root = t;
    }
}
