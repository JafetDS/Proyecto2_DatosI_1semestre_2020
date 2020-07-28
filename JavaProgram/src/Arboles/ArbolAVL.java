package Arboles;

/**
 *
 * @param <T>
 */
public class ArbolAVL<T extends Comparable<? super T>>{
    private NodoAVL root;

    /**
     * Constructor del Arbol AVL
     */
    public ArbolAVL() {
        this.root = null;
    }

    /**
     *
     * @param t
     * @return lo grande del arbol
     */
    private int height(NodoAVL t) {
        return t == null ? -1 : t.height;
    }

    /**
     *
     * @return El root del arbol
     */
    public Comparable findroot(){
        return this.root.element;
    }

    /**
     *
     * @param x
     * Metodo para insertar elementos en el arbol AVL
     */
    public void insert(Comparable x){
        this.root = this.insert(x, this.root);

    }
    private NodoAVL insert(Comparable x, NodoAVL t) {
        if (t == null) {
            return new NodoAVL(x);
        }
        if (x.compareTo(t.element) < 0) {
            t.left = insert(x, t.left);
        } else if (x.compareTo(t.element) > 0) {
            t.right = insert(x, t.right);
        }
        return balance(t);
    }

    /**
     * Metodo para balancear el arbol
     * @param t
     * @return
     */
    private NodoAVL balance(NodoAVL t) {
        if (t == null)
            return t;
        if (height(t.left) - height(t.right) > 1) {
            if (height(t.left.left) >= height(t.left.right))
                t = rotateWithLeftChild(t);
            else
                t = doubleWithLeftChild(t);
        } else {
            if (height(t.right) - height(t.left) > 1){
                if (height(t.right.right) >= height(t.right.left))
                    t = rotateWithRightChild(t);
                else
                    t = doubleWithRightChild(t);
            }
        }
        t.height = Math.max(height(t.left), height(t.right)) + 1;
        return t;
    }

    /**
     * Metodo Zig
     * @param k2
     * @return
     */
    private NodoAVL rotateWithLeftChild(NodoAVL k2) {
        NodoAVL k1 = k2.left;
        k2.left = k1.right;
        k1.right = k2;
        k2.height = Math.max(height(k2.left), height(k2.right)) + 1;
        k1.height = Math.max(height(k1.left), k2.height) + 1;
        return k1;
    }

    /**
     * Metodo Zag
     * @param k2
     * @return
     */
    private NodoAVL rotateWithRightChild(NodoAVL k2) {
        NodoAVL k1 = k2.right;
        k2.right = k1.left;
        k1.left = k2;
        k2.height = Math.max(height(k2.right), height(k2.left)) + 1;
        k1.height = Math.max(height(k1.right), k2.height) + 1;
        return k1;
    }

    /**
     * Metodo Zig Zig
     * @param k3
     * @return
     */
    private NodoAVL doubleWithLeftChild(NodoAVL k3) {
        k3.left = rotateWithRightChild(k3.left);
        return rotateWithLeftChild(k3);
    }

    /**
     * Metodo Zag Zag
     * @param k3
     * @return
     */
    private NodoAVL doubleWithRightChild(NodoAVL k3) {
        k3.right = rotateWithRightChild(k3.right);
        return doubleWithRightChild(k3);
    }
}
