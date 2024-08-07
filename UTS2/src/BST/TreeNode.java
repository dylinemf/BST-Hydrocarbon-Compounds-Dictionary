package BST;

public class TreeNode {

    private TreeNode leftChild;
    private TreeNode rightChild;
    private TreeNode parent;
//    private String kodeSenyawa;
//    private String namaSenyawa;
    private Senyawa senyawa;

    public TreeNode() {
        this.senyawa = getSenyawa();
    }

    public TreeNode(Senyawa senyawa) throws IllegalArgumentException {
        if (senyawa.getKode() == null || senyawa.getKode().isEmpty()) {
            throw new IllegalArgumentException("MASUKKAN SALAH");
        }
        if (senyawa.getIlmiah() == null || senyawa.getIlmiah().isEmpty()) {
            throw new IllegalArgumentException("MASUKKAN SALAH");
        }
//        this.kodeSenyawa = senyawa.getKode();
//        this.namaSenyawa = senyawa.getIlmiah();
        this.senyawa = senyawa;
    }

    public Senyawa getSenyawa() {
        return senyawa;
    }

    public void setS(Senyawa s) {
        this.senyawa = senyawa;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    public Double getMrSenyawa() {
        return senyawa.getMassaMR();
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }
    
//    public String getKodeSenyawa() {
//        return kodeSenyawa;
//    }

//    public String getNamaSenyawa() {
//        return namaSenyawa;
//    }
//    @Override
//    public String toString() {
//        return kodeSenyawa + ": " + namaSenyawa;
//    }
}
