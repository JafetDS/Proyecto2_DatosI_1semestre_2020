package Arboles;

public class ArbolSplay<T extends Comparable<? super T>> {
    private NodoSpaly root;

    public ArbolSplay() {
        this.root = null;
    }

    public Comparable findroot(){
        return this.root.key;
    }

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

    public Comparable findMin() {
        NodoSpaly x = root;
        if(root == null) return null;
        while(x.left != null) x = x.left;
        splay(x.key);
        return x.key;
    }

    public Comparable findMax() {
        NodoSpaly x = root;
        if(root == null) return null;
        while(x.right != null) x = x.right;
        splay(x.key);
        return x.key;
    }

    public Comparable find(Comparable key) {
        if (root == null) return null;
        splay(key);
        if(root.key.compareTo(key) != 0) return null;
        return root.key;
    }

    public boolean isEmpty() {
        return root == null;
    }


    public void moveToRoot(Comparable key) {
        NodoSpaly l, r, t, y;
        l = r = header;
        t = root;
        header.left = header.right = null;
        for (;;) {
            if (key.compareTo(t.key) < 0) {
                if (t.left == null) break;
                r.left = t;                                 /* link right */
                r = t;
                t = t.left;
            } else if (key.compareTo(t.key) > 0) {
                if (t.right == null) break;
                l.right = t;                                /* link left */
                l = t;
                t = t.right;
            } else {
                break;
            }
        }
        l.right = t.left;                                   /* assemble */
        r.left = t.right;
        t.left = header.right;
        t.right = header.left;
        root = t;
    }

    private static NodoSpaly header = new NodoSpaly(null); // For splay

    /**
     * Internal method to perform a top-down splay.
     *
     *   splay(key) does the splay operation on the given key.
     *   If key is in the tree, then the BinaryNode containing
     *   that key becomes the root.  If key is not in the tree,
     *   then after the splay, key.root is either the greatest key
     *   < key in the tree, or the lest key > key in the tree.
     *
     *   This means, among other things, that if you splay with
     *   a key that's larger than any in the tree, the rightmost
     *   node of the tree becomes the root.  This property is used
     *   in the delete() method.
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
                    y = t.left;                            /* rotate right */
                    t.left = y.right;
                    y.right = t;
                    t = y;
                    if (t.left == null) break;
                }
                r.left = t;                                 /* link right */
                r = t;
                t = t.left;
            } else if (key.compareTo(t.key) > 0) {
                if (t.right == null) break;
                if (key.compareTo(t.right.key) > 0) {
                    y = t.right;                            /* rotate left */
                    t.right = y.left;
                    y.left = t;
                    t = y;
                    if (t.right == null) break;
                }
                l.right = t;                                /* link left */
                l = t;
                t = t.right;
            } else {
                break;
            }
        }
        l.right = t.left;                                   /* assemble */
        r.left = t.right;
        t.left = header.right;
        t.right = header.left;
        root = t;
    }
}
