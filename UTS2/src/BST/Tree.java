package BST;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import javax.swing.JOptionPane;

public class Tree {

    private TreeNode root;
    private TreeNode rootHelper;
    int flag;
    ArrayList<Senyawa> list = new ArrayList<>();

    public void insert(Senyawa s) {
        root = insertRecur(root, s);
        rootHelper = root;
    }

    public TreeNode insertRecur(TreeNode root, Senyawa s) {

        if (root == null) {
            root = new TreeNode(s);
            System.out.println(root.getSenyawa() + " ");
            JOptionPane.showMessageDialog(null,"Data berhasil disimpan!");
            return root;
        }
        System.out.println("penasaran " + s.getKode().equals(root.getSenyawa().getKode()));
        if (s.getKode().equals(root.getSenyawa().getKode())) {
            JOptionPane.showMessageDialog(null, "DUPLIKASI DATA", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            if (s.compareTo(root.getSenyawa()) < 0) {
                root.setLeftChild(insertRecur(root.getLeftChild(), s));
                root.getLeftChild().setParent(root);
                System.out.println("yaa");
            } else if (s.compareTo(root.getSenyawa()) > 0) {
                root.setRightChild(insertRecur(root.getRightChild(), s));
                root.getRightChild().setParent(root);
                System.out.println("yaampun");
            } else if (s.compareTo(root.getSenyawa()) == 0) {
                if (s.getKode().equals(root.getSenyawa().getKode())) {
                    JOptionPane.showMessageDialog(null, "DUPLIKASI DATA", "Warning", JOptionPane.WARNING_MESSAGE);
                } else {
                    root.setRightChild(insertRecur(root.getRightChild(), s));
                    root.getRightChild().setParent(root);
                }
            }
        }
        return root;
    }

    public TreeNode lookup(String k, double mr) {
        return lookupHelper(k, mr, rootHelper);
    }
    

    private TreeNode lookupHelper(String k, double mr, TreeNode root) throws NoSuchElementException {
        flag = 0;
        if (root == null) {
            System.out.println("cekhana");
//            JOptionPane.showMessageDialog(null, "DATA KOSONG", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        System.out.println(k +"cek" +root.getSenyawa().getKode());
        if (mr == root.getSenyawa().getMassaMR() && k.equalsIgnoreCase(root.getSenyawa().getKode())) {
            System.out.println(mr + " yow");
            return root;
        }
        if (mr >= root.getSenyawa().getMassaMR()) {
            if (root.getRightChild() != null) {
                System.out.println("cekset");
                root = root.getRightChild();
                return lookupHelper(k, mr, root);
            } else {
                System.out.println("cekdaseot");
                flag = 1;
//                throw new NoSuchElementException("NULL" + k + " dan " + mr);
            }
        } else if (mr < root.getSenyawa().getMassaMR()) {
            if (root.getLeftChild() != null) {
                System.out.println("cekyeoseot");
                root = root.getLeftChild();
                return lookupHelper(k, mr, root);
            } else {
                System.out.println("cekilgob");
                flag = 1;
//                throw new NoSuchElementException("NULL" + k + " dan " + mr);
            }
        } else {
            JOptionPane.showMessageDialog(null, "DATA TIDAK DITEMUKAN", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        return null;
    }

    public void remove(double id) {
        root = removeRecur(root, id);
    }

    public TreeNode removeRecur(TreeNode root, double key) {

        if (root == null) {
            return root;
        }

        if (key < root.getSenyawa().getMassaMR()) {
            root.setLeftChild(removeRecur(root.getLeftChild(), key));
        } else if (key > root.getSenyawa().getMassaMR()) {
            root.setRightChild(removeRecur(root.getRightChild(), key));
        } else {

            if (root.getLeftChild() == null) {
                return root.getRightChild();
            } else if (root.getRightChild() == null) {
                return root.getLeftChild();
            }

            // node with two children: Get the inorder successor (smallest 
            // in the right subtree) 
            root.getSenyawa().setMR(minValue(root.getRightChild()));
            // Delete the inorder successor 
            root.setRightChild(removeRecur(root.getRightChild(), root.getSenyawa().getMassaMR()));
        }

        return root;
    }

    public double minValue(TreeNode root) {
        double minv = root.getSenyawa().getMassaMR();
        while (root.getLeftChild() != null) {
            minv = root.getLeftChild().getSenyawa().getMassaMR();
            root = root.getLeftChild();
        }
        return minv;
    }

    public int size() {
        if (root == null) {
            return 0;
        }
        return sizeHelper(root);
    }

    private static int sizeHelper(TreeNode current) {
        if (current == null) {
            return 0;
        }
        return sizeHelper(current.getLeftChild()) + sizeHelper(current.getRightChild()) + 1;
    }

    public int height() {
        if (root == null) {
            return 0;
        }
        return heightHelper(root);
    }

    private static int heightHelper(TreeNode current) {

        if (current == null) {
            return 0;
        }

        int leftTree = 1 + heightHelper(current.getLeftChild());
        int rightTree = 1 + heightHelper(current.getRightChild());

        if (leftTree > rightTree) {
            return leftTree;
        } else {
            return rightTree;
        }
    }

    public void inOrder() {
        inOrderH(root);
    }

    public void inOrderH(TreeNode node) {
        if (node == null) {
            return;
        }
        inOrderH(node.getLeftChild());
        System.out.println(node.getSenyawa());
        list.add(node.getSenyawa());
        inOrderH(node.getRightChild());
    }
//    public boolean isEmpty() {
//        if (root == null) {
//            return true;
//        }
//        return false;
//    }
//    public boolean add(Senyawa s) {
//        TreeNode add = new TreeNode(s);
//        if (root == null) {
//            root = add;
//            return true;
//        }
//        return addHelper(add, root);
//    }

//    private static boolean addHelper(TreeNode Node, TreeNode current) {
//        if (Node.getMrSenyawa().compareTo(current.getMrSenyawa()) > 0) {
//            if (current.getRightChild() != null) {
//                return addHelper(Node, current.getRightChild());
//            } else {
//                current.setRightChild(Node);
//                return true;
//            }
//        }
//        if (Node.getMrSenyawa().compareTo(current.getMrSenyawa()) < 0) {
//            if (current.getLeftChild() != null) {
//                return addHelper(Node, current.getLeftChild());
//            } else {
//                current.setLeftChild(Node);
//                return true;
//            }
//        }
//        return false;
//    }
//    public TreeNode find(double key) {
//        if (rootHelper == null || rootHelper.getSenyawa().getMassaMR() == key) {
//            return rootHelper;
//        }
//
//        if (rootHelper.getSenyawa().getMassaMR() > key) {
//            rootHelper = rootHelper.getLeftChild();
//            return find(key);
//        }
//
//        rootHelper = rootHelper.getRightChild();
//        return find(key);
//    }
//    public void deleteN(String kode, double id) {
////        delete(kode, id);
//        getCurrent(kode, id);
//    }
//
//    public boolean delete(String k, double id) {
//        rootHelper = root;
////        find(id);
//        lookup(k, id);
//        boolean flag = false;
//        if (rootHelper.getLeftChild() == null && rootHelper.getRightChild() == null) {
//            flag = true;
//        } else if (rootHelper.getLeftChild() == null || rootHelper.getRightChild() == null) {
//            flag = false;
//        }
//        return flag;
//    }
//    public TreeNode getCurrent(String k, double id) {
//        if (delete(k, id) == true) {
//            if (id > rootHelper.getParent().getSenyawa().getMassaMR()) {
//                rootHelper.getParent().setRightChild(null);
//                return rootHelper.getParent().getRightChild();
//            } else if (id < rootHelper.getParent().getSenyawa().getMassaMR()) {
//                rootHelper.getParent().setLeftChild(null);
//                return rootHelper.getParent().getLeftChild();
//            }
//        } else if (delete(k, id) == false && rootHelper.getParent() != null) {
//            if (rootHelper.getLeftChild() == null) {
//                if (id < rootHelper.getParent().getSenyawa().getMassaMR()) {
//                    rootHelper.getParent().setLeftChild(rootHelper.getRightChild());
//                    return rootHelper.getParent().getLeftChild();
//                } else if (id > rootHelper.getParent().getSenyawa().getMassaMR()) {
//                    rootHelper.getParent().setRightChild(rootHelper.getRightChild());
//                    return rootHelper.getParent().getRightChild();
//                }
//            } else if (rootHelper.getRightChild() == null) {
//                if (id < rootHelper.getParent().getSenyawa().getMassaMR()) {
//                    rootHelper.getParent().setLeftChild(rootHelper.getLeftChild());
//                    return rootHelper.getParent().getLeftChild();
//                } else if (id > rootHelper.getParent().getSenyawa().getMassaMR()) {
//                    rootHelper.getParent().setRightChild(rootHelper.getLeftChild());
//                    return rootHelper.getParent().getRightChild();
//                }
//            }
//        } else {
//            Senyawa help;
//            if (rootHelper.getLeftChild() != null) {
//                System.out.println("lahlohkoklah " + rootHelper.getLeftChild().getSenyawa());
//                help = getPredecessor(rootHelper.getLeftChild());
////            System.out.println("lahlohkoklah "+rootHelper.getLeftChild().getSenyawa());
//
//            } else {
//                System.out.println("lahlohkoklah " + rootHelper.getRightChild().getSenyawa());
//                help = getPredecessor(rootHelper.getRightChild());
//            }
//            TreeNode bantu = rootHelper;
//            System.out.println("nabibobettau");
//            deleteN(k, help.getMassaMR());
//            bantu.setS(help);
//
//        }
//        return rootHelper;
//    }
    //    public Senyawa getSucessor(TreeNode root) {
//        Senyawa suc = root.getSenyawa();
//        while (root.getLeftChild() != null) {
//            suc = root.getLeftChild().getSenyawa();
//            root = root.getLeftChild();
//        }
//        return suc;
//    }
//
//    public Senyawa getPredecessor(TreeNode root) {
//        Senyawa pre = root.getSenyawa();
//        while (root.getRightChild() != null) {
//            pre = root.getRightChild().getSenyawa();
//            root = root.getRightChild();
//        }
//        return pre;
//    }
//    public ArrayList<Senyawa> getList() {
//        return list;
//    }
//    public ArrayList<String> getAll() {
//        if (root == null) {
//            return new ArrayList<String>();
//        }
//        return getAllHelper(root);
//    }
//    private static ArrayList<String> getAllHelper(TreeNode current) {
//        ArrayList<String> list = new ArrayList<String>();
//
//        if (current.getLeftChild() != null) {
//            list.addAll(getAllHelper(current.getLeftChild()));
//        }
//        list.add(current.getKodeSenyawa());
//
//        if (current.getRightChild() != null) {
//
//            list.addAll(getAllHelper(current.getRightChild()));
//
//        }
//        return list;
//    }
}
