/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BST;

import coba.*;
import java.awt.*;
import java.awt.datatransfer.*;
import java.io.*;
import java.util.ArrayList;
import java.util.logging.*;
import javax.swing.*;
import java.util.List;
import java.util.NoSuchElementException;

/**
 *
 * @author LENOVO
 */
public class MainScreen2 extends javax.swing.JFrame {

    /**
     * Creates new form MainScreen
     */
//    class MyTransferHandler extends TransferHandler {
//
//        public int getSourceActions(JComponent c) {
//            return COPY_OR_MOVE;
//        }
//
//        protected Transferable createTransferable(JComponent c) {
//            JList l = (JList) c;
//            return new StringSelection(l.getSelectedValue().toString());
//        }
//
//        protected void exportDone(JComponent c, Transferable t, int action) {
//            if (action == MOVE) {
//                JList l = (JList) c;
//                DefaultListModel dlm = (DefaultListModel) l.getModel();
//                dlm.remove(l.getSelectedIndex());
//            }
//        }
//
//        public boolean canImport(TransferHandler.TransferSupport supp) {
//            if (!supp.isDataFlavorSupported(DataFlavor.stringFlavor)) {
//                return false;
//            }
//            return true;
//        }
//
//        public boolean importData(TransferHandler.TransferSupport supp) {
//            if (!supp.isDrop()) {
//                return false;
//            }
//            pic = (JLabel) supp.getComponent();
//            String data;
//            try {
//                data = (String) supp.getTransferable().getTransferData(DataFlavor.stringFlavor);
//            } catch (Exception e) {
//                return false;
//            }
//            listModel = (DefaultListModel) list.getModel();
//            
//            JList.DropLocation dl = (JList.DropLocation) supp.getDropLocation();
//            idx = dl.getIndex();
//            System.out.println("dx" + dl.getIndex());
//            listModel.add(idx, data);
//            idx++;
//            return true;
//
//        }
//    }
    public MainScreen2() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        this.setBackground(new Color(0, 0, 0, 0));
        jPanel1.setBackground(new Color(0, 0, 0, 0));
        screenAwal();
        modifyLabel();
    }
    Tree node = new Tree();
    TreeNode Tn = new TreeNode();
    Senyawa comp, s;
    String code, code2, pathIm;
    ArrayList<String> kode = new ArrayList<>();
    ArrayList<String> kode2 = new ArrayList<>();

    public void screenAwal() {
        ketAdd.setVisible(false);
        ketSearch.setVisible(false);
        ketTanpaSpasi.setVisible(false);
        ketAddkode.setVisible(false);
        searchShade.setVisible(false);
        kodeSenyawa.setVisible(false);
        sepcode.setVisible(false);
        addShade.setVisible(false);
        seeallShade.setVisible(false);
        levelShade.setVisible(false);
        sizeShade.setVisible(false);
        kodeSenyawa2.setVisible(false);
        sepcode2.setVisible(false);
        pathImage.setVisible(false);
        sepPath.setVisible(false);
        nameSenyawa.setVisible(false);
        sepname.setVisible(false);
        UsageInscroll.setVisible(false);
        usageInShade.setVisible(false);
        SeeAllInfoscroll.setVisible(false);
        sepSeeAllInfo.setVisible(false);
        levelInfoTf.setVisible(false);
        levelInfoShade.setVisible(false);
        sizeInfoTf.setVisible(false);
        sizeInfoShade.setVisible(false);
        MrTf.setVisible(false);
        Usagescroll.setVisible(false);
        titleNameCompounds.setVisible(false);
        MrTf.setText("");
        usageTf.setText("");
    }

    public void modifyLabel() {
        TransferHandler th = new TransferHandler() {

            @Override
            public boolean canImport(JComponent comp, DataFlavor[] transferFlavors) {
                return true;
            }

            @Override
            public boolean importData(JComponent comp, Transferable t) {

                try {
                    List<File> files = (java.util.List<File>) t.getTransferData(DataFlavor.javaFileListFlavor);
                    if (files.size() == 1) {
                        File f = files.get(0);
                        pathIm = f.getPath();
                        pathImage.setText(pathIm);
//                        String path = new File(getClass().getResource("/imagespath").getFile()).getAbsolutePath() + "\\" + file.getName();
                    }

                } catch (UnsupportedFlavorException ex) {
                    java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);
                }
                return true;

            }

        };
        pathImage.setTransferHandler(th);
    }

//    public void modifyLabel() {
//        TransferHandler th;
//        th = new TransferHandler() {
//            
//            @Override
//            public boolean canImport(JComponent comp, DataFlavor[] transferFlavors) {
//                return true;
//            }
//            
//            @Override
//            public boolean importData(JComponent comp, Transferable t) {
//                try {
//                    List<File> files = (List<File>) t.getTransferData(DataFlavor.javaFileListFlavor);
////                try {
////                    List files = (List<Files>) t.getTransferData(DataFlavor.javaFileListFlavor);
//////                    for (File file : files) {
////                    if (files.size() == 1) {
////                        File f = files.get(0);
////                        
////                    }
////                    String path = new File(getClass().getResource("/image").getFile()).getAbsolutePath() + "\\" + files.getName();
////                    System.out.println(path + " yeee");
////                    dropPic.setIcon(new javax.swing.ImageIcon(path));
//////                        idx++;
////
//////                    }
//                } catch (UnsupportedFlavorException ex) {
//                    java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);
//                } catch (IOException ex) {
//                    java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);
//                }}
//                return true;
//                
////                } catch (UnsupportedFlavorException ex) {
////                    Logger.getLogger(MainScreen2.class.getName()).log(Level.SEVERE, null, ex);
////                } catch (IOException ex) {
////                    Logger.getLogger(MainScreen2.class.getName()).log(Level.SEVERE, null, ex);
////                }
////            }
//            
//        };
//        pic.setTransferHandler(th);
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titleNameCompounds = new javax.swing.JLabel();
        ketTanpaSpasi = new javax.swing.JLabel();
        ketAddkode = new javax.swing.JLabel();
        ketSearch = new javax.swing.JLabel();
        ketAdd = new javax.swing.JLabel();
        sepSeeAllInfo = new javax.swing.JSeparator();
        SeeAllInfoscroll = new javax.swing.JScrollPane();
        seeAllInfoTf = new javax.swing.JTextArea();
        sepMrIn = new javax.swing.JSeparator();
        mrIn = new javax.swing.JTextField();
        sizeInfoTf = new javax.swing.JTextField();
        sizeInfoShade = new javax.swing.JLabel();
        levelInfoTf = new javax.swing.JTextField();
        levelInfoShade = new javax.swing.JLabel();
        dropPic = new javax.swing.JLabel();
        sepPath = new javax.swing.JSeparator();
        pathImage = new javax.swing.JTextField();
        UsageInscroll = new javax.swing.JScrollPane();
        usageInTf = new javax.swing.JTextArea();
        usageInShade = new javax.swing.JLabel();
        sepcode2 = new javax.swing.JSeparator();
        kodeSenyawa2 = new javax.swing.JTextField();
        sepname = new javax.swing.JSeparator();
        nameSenyawa = new javax.swing.JTextField();
        sepcode = new javax.swing.JSeparator();
        kodeSenyawa = new javax.swing.JTextField();
        Usagescroll = new javax.swing.JScrollPane();
        usageTf = new javax.swing.JTextArea();
        usageShade = new javax.swing.JLabel();
        MrTf = new javax.swing.JTextField();
        MrShade = new javax.swing.JLabel();
        usageLb = new javax.swing.JLabel();
        mrLb = new javax.swing.JLabel();
        bin = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        size = new javax.swing.JLabel();
        sizeShade = new javax.swing.JLabel();
        level = new javax.swing.JLabel();
        levelShade = new javax.swing.JLabel();
        seeall = new javax.swing.JLabel();
        seeallShade = new javax.swing.JLabel();
        add = new javax.swing.JLabel();
        addShade = new javax.swing.JLabel();
        search = new javax.swing.JLabel();
        searchShade = new javax.swing.JLabel();
        title2 = new javax.swing.JLabel();
        title1 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleNameCompounds.setFont(new java.awt.Font("Lemon/Milk", 0, 20)); // NOI18N
        titleNameCompounds.setForeground(new java.awt.Color(255, 255, 153));
        titleNameCompounds.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(titleNameCompounds, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 370, 40));

        ketTanpaSpasi.setForeground(new java.awt.Color(189, 215, 238));
        ketTanpaSpasi.setText("cari tanpa spasi (contoh:ch4)");
        jPanel1.add(ketTanpaSpasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 184, -1, -1));

        ketAddkode.setForeground(new java.awt.Color(189, 215, 238));
        ketAddkode.setText("contoh input: c 7 h 14 (diberi spasi untuk setiap unsur & indeks)");
        jPanel1.add(ketAddkode, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 246, -1, -1));

        ketSearch.setForeground(new java.awt.Color(189, 215, 238));
        ketSearch.setText("(tekan enter pada keyboard untuk mencari)");
        jPanel1.add(ketSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, -1, -1));

        ketAdd.setForeground(new java.awt.Color(189, 215, 238));
        ketAdd.setText("(tekan enter di 'path gambar' jika sudah selesai)");
        jPanel1.add(ketAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, -1, -1));

        sepSeeAllInfo.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(sepSeeAllInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 280, 10));

        SeeAllInfoscroll.setBackground(new Color(0,0,0,0));
        SeeAllInfoscroll.setBorder(null);

        seeAllInfoTf.setEditable(false);
        seeAllInfoTf.setBackground(new Color(32,56,100,255));
        seeAllInfoTf.setColumns(20);
        seeAllInfoTf.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        seeAllInfoTf.setForeground(new java.awt.Color(189, 215, 238));
        seeAllInfoTf.setLineWrap(true);
        seeAllInfoTf.setRows(5);
        seeAllInfoTf.setCaretColor(new java.awt.Color(6, 4, 52));
        seeAllInfoTf.setOpaque(true);
        SeeAllInfoscroll.setViewportView(seeAllInfoTf);

        jPanel1.add(SeeAllInfoscroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 300, 70));

        sepMrIn.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(sepMrIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 120, 10));
        sepMrIn.setVisible(false);

        mrIn.setBackground(new Color(0,0,0,0));
        mrIn.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        mrIn.setForeground(new java.awt.Color(189, 215, 238));
        mrIn.setText("MR");
        mrIn.setBorder(null);
        mrIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mrInActionPerformed(evt);
            }
        });
        jPanel1.add(mrIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 120, 30));
        mrIn.setVisible(false);

        sizeInfoTf.setEditable(false);
        sizeInfoTf.setBackground(new Color(0,0,0,0));
        sizeInfoTf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sizeInfoTf.setForeground(new java.awt.Color(189, 215, 238));
        sizeInfoTf.setBorder(null);
        sizeInfoTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sizeInfoTfActionPerformed(evt);
            }
        });
        jPanel1.add(sizeInfoTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, 60, 30));

        sizeInfoShade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tf mr3.png"))); // NOI18N
        jPanel1.add(sizeInfoShade, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, 70, 50));

        levelInfoTf.setEditable(false);
        levelInfoTf.setBackground(new Color(0,0,0,0));
        levelInfoTf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        levelInfoTf.setForeground(new java.awt.Color(189, 215, 238));
        levelInfoTf.setBorder(null);
        levelInfoTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                levelInfoTfActionPerformed(evt);
            }
        });
        jPanel1.add(levelInfoTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 60, 30));

        levelInfoShade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tf mr3.png"))); // NOI18N
        jPanel1.add(levelInfoShade, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 70, 50));

        dropPic.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 102), new java.awt.Color(204, 0, 255)));
        jPanel1.add(dropPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 65, 270, 260));

        sepPath.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(sepPath, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 210, 10));

        pathImage.setBackground(new Color(0,0,0,0));
        pathImage.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        pathImage.setForeground(new java.awt.Color(189, 215, 238));
        pathImage.setText("path gambar/drag image here");
        pathImage.setBorder(null);
        pathImage.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pathImageFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pathImageFocusLost(evt);
            }
        });
        pathImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pathImageActionPerformed(evt);
            }
        });
        pathImage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pathImageKeyPressed(evt);
            }
        });
        jPanel1.add(pathImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 210, 30));

        UsageInscroll.setBackground(new Color(0,0,0,0));
        UsageInscroll.setBorder(null);

        usageInTf.setBackground(new Color(32,56,100,255));
        usageInTf.setColumns(20);
        usageInTf.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        usageInTf.setForeground(new java.awt.Color(189, 215, 238));
        usageInTf.setLineWrap(true);
        usageInTf.setRows(5);
        usageInTf.setText("manfaat/sering ditemukan di...");
        usageInTf.setCaretColor(new java.awt.Color(6, 4, 52));
        usageInTf.setOpaque(true);
        usageInTf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usageInTfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usageInTfFocusLost(evt);
            }
        });
        UsageInscroll.setViewportView(usageInTf);

        jPanel1.add(UsageInscroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 355, 300, 70));

        usageInShade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tA usage2.png"))); // NOI18N
        jPanel1.add(usageInShade, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 330, 100));

        sepcode2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(sepcode2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 120, 10));

        kodeSenyawa2.setBackground(new Color(0,0,0,0));
        kodeSenyawa2.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        kodeSenyawa2.setForeground(new java.awt.Color(189, 215, 238));
        kodeSenyawa2.setText("kode senyawa");
        kodeSenyawa2.setBorder(null);
        kodeSenyawa2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                kodeSenyawa2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                kodeSenyawa2FocusLost(evt);
            }
        });
        kodeSenyawa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodeSenyawa2ActionPerformed(evt);
            }
        });
        jPanel1.add(kodeSenyawa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 120, 30));

        sepname.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(sepname, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 120, 10));

        nameSenyawa.setBackground(new Color(0,0,0,0));
        nameSenyawa.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        nameSenyawa.setForeground(new java.awt.Color(189, 215, 238));
        nameSenyawa.setText("nama senyawa");
        nameSenyawa.setBorder(null);
        nameSenyawa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameSenyawaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameSenyawaFocusLost(evt);
            }
        });
        nameSenyawa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameSenyawaActionPerformed(evt);
            }
        });
        jPanel1.add(nameSenyawa, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 120, 30));

        sepcode.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(sepcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 120, 10));

        kodeSenyawa.setBackground(new Color(0,0,0,0));
        kodeSenyawa.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        kodeSenyawa.setForeground(new java.awt.Color(189, 215, 238));
        kodeSenyawa.setText("kode senyawa");
        kodeSenyawa.setBorder(null);
        kodeSenyawa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                kodeSenyawaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                kodeSenyawaFocusLost(evt);
            }
        });
        kodeSenyawa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodeSenyawaActionPerformed(evt);
            }
        });
        kodeSenyawa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                kodeSenyawaKeyPressed(evt);
            }
        });
        jPanel1.add(kodeSenyawa, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 120, 30));

        Usagescroll.setBackground(new Color(0,0,0,0));
        Usagescroll.setBorder(null);

        usageTf.setEditable(false);
        usageTf.setBackground(new Color(32,56,100,255));
        usageTf.setColumns(20);
        usageTf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        usageTf.setForeground(new java.awt.Color(189, 215, 238));
        //usageTf.setBackground(new Color(0,0,0,0));
        usageTf.setLineWrap(true);
        usageTf.setRows(5);
        //AbstractBorder brdr = new TextBubbleBorder(Color.BLACK,2,16,0);
        usageTf.setCaretColor(new java.awt.Color(6, 4, 52));
        usageTf.setOpaque(true);
        Usagescroll.setViewportView(usageTf);

        jPanel1.add(Usagescroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 405, 300, 70));

        usageShade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tA usage2.png"))); // NOI18N
        jPanel1.add(usageShade, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 390, 330, 100));

        MrTf.setEditable(false);
        MrTf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        MrTf.setForeground(new java.awt.Color(189, 215, 238));
        MrTf.setBackground(new Color(0,0,0,0));
        MrTf.setBorder(null);
        MrTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MrTfActionPerformed(evt);
            }
        });
        jPanel1.add(MrTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 350, 60, 30));

        MrShade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tf mr3.png"))); // NOI18N
        jPanel1.add(MrShade, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 340, 70, 50));

        usageLb.setBackground(new java.awt.Color(124, 131, 239));
        usageLb.setFont(new java.awt.Font("Cambria", 0, 22)); // NOI18N
        usageLb.setForeground(new java.awt.Color(6, 4, 52));
        usageLb.setText("Biasa terdapat pada:");
        usageLb.setOpaque(true);
        jPanel1.add(usageLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 420, -1, -1));

        mrLb.setBackground(new java.awt.Color(0, 128, 128));
        mrLb.setFont(new java.awt.Font("Cambria", 0, 22)); // NOI18N
        mrLb.setForeground(new java.awt.Color(255, 230, 153));
        mrLb.setText("Massa relatif senyawa:");
        mrLb.setOpaque(true);
        jPanel1.add(mrLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 350, 220, -1));

        bin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/trashbin2.png"))); // NOI18N
        bin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                binMousePressed(evt);
            }
        });
        jPanel1.add(bin, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 510, 40, 50));

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/exit2.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                closeMousePressed(evt);
            }
        });
        jPanel1.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 30, 30, 30));

        size.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/size2.png"))); // NOI18N
        size.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sizeMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sizeMousePressed(evt);
            }
        });
        jPanel1.add(size, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 475, 40, 30));

        sizeShade.setBackground(new Color(255,204,102,30));
        sizeShade.setForeground(new Color(255,204,102,0));
        sizeShade.setBorder(null);
        sizeShade.setMaximumSize(new java.awt.Dimension(213, 26));
        sizeShade.setMinimumSize(new java.awt.Dimension(213, 26));
        sizeShade.setOpaque(true);
        sizeShade.setPreferredSize(new java.awt.Dimension(213, 26));
        jPanel1.add(sizeShade, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 90, 40));

        level.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/level3.png"))); // NOI18N
        level.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                levelMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                levelMousePressed(evt);
            }
        });
        jPanel1.add(level, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 399, 40, 40));

        levelShade.setBackground(new Color(255,204,102,30));
        levelShade.setForeground(new Color(255,204,102,0));
        levelShade.setBorder(null);
        levelShade.setMaximumSize(new java.awt.Dimension(213, 26));
        levelShade.setMinimumSize(new java.awt.Dimension(213, 26));
        levelShade.setOpaque(true);
        levelShade.setPreferredSize(new java.awt.Dimension(213, 26));
        jPanel1.add(levelShade, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 90, 40));

        seeall.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/seeall2.png"))); // NOI18N
        seeall.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                seeallMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                seeallMousePressed(evt);
            }
        });
        jPanel1.add(seeall, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 335, -1, 30));

        seeallShade.setBackground(new Color(255,204,102,30));
        seeallShade.setForeground(new Color(255,204,102,0));
        seeallShade.setBorder(null);
        seeallShade.setMaximumSize(new java.awt.Dimension(213, 26));
        seeallShade.setMinimumSize(new java.awt.Dimension(213, 26));
        seeallShade.setOpaque(true);
        seeallShade.setPreferredSize(new java.awt.Dimension(213, 26));
        jPanel1.add(seeallShade, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 90, 40));

        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add3.png"))); // NOI18N
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                addMousePressed(evt);
            }
        });
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 265, 40, -1));

        addShade.setBackground(new Color(255,204,102,30));
        addShade.setForeground(new Color(255,204,102,0));
        addShade.setBorder(null);
        addShade.setMaximumSize(new java.awt.Dimension(213, 26));
        addShade.setMinimumSize(new java.awt.Dimension(213, 26));
        addShade.setOpaque(true);
        addShade.setPreferredSize(new java.awt.Dimension(213, 26));
        jPanel1.add(addShade, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 90, 40));

        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search2.png"))); // NOI18N
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                searchMousePressed(evt);
            }
        });
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 40, 40));

        searchShade.setBackground(new Color(255,204,102,30));
        searchShade.setForeground(new Color(255,204,102,0));
        searchShade.setBorder(null);
        searchShade.setMaximumSize(new java.awt.Dimension(213, 26));
        searchShade.setMinimumSize(new java.awt.Dimension(213, 26));
        searchShade.setOpaque(true);
        searchShade.setPreferredSize(new java.awt.Dimension(213, 26));
        jPanel1.add(searchShade, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 90, 40));

        title2.setFont(new java.awt.Font("Century Schoolbook", 0, 36)); // NOI18N
        title2.setForeground(new java.awt.Color(197, 224, 180));
        title2.setText("Senyawa Kimia");
        jPanel1.add(title2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        title1.setFont(new java.awt.Font("Century Schoolbook", 0, 36)); // NOI18N
        title1.setForeground(new java.awt.Color(197, 224, 180));
        title1.setText("Struktur");
        jPanel1.add(title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bg3.png"))); // NOI18N
        bg.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bg3.png"))); // NOI18N
        jPanel1.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 580));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 580));

        setSize(new java.awt.Dimension(1139, 575));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MrTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MrTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MrTfActionPerformed

    private void kodeSenyawaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodeSenyawaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kodeSenyawaActionPerformed

    private void nameSenyawaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameSenyawaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameSenyawaActionPerformed

    private void kodeSenyawa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodeSenyawa2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kodeSenyawa2ActionPerformed

    private void pathImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pathImageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pathImageActionPerformed

    private void levelInfoTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_levelInfoTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_levelInfoTfActionPerformed

    private void sizeInfoTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sizeInfoTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sizeInfoTfActionPerformed
    public int indexReverse(ArrayList<String> kode, String in, int size) {
        int ind=0;
        for (int i = 0; i < size; i++) {
            if (kode.get(i).equalsIgnoreCase(in)) {
                ind = i;
            }
        }
        return ind;
    }

    public String reverse(String code2) {

        for (int i = 0; i < kode.size(); i++) {

            if (code2.equalsIgnoreCase(kode2.get(i))) {
                System.out.println("code2 " + code2);
                System.out.println("kode2 ke "+ i +" "+ kode2.get(i));
                code2 = kode.get(i);
                System.out.println("kode ke "+ i +" " + kode.get(i));
            }
        }
        return code2;
    }

    private void mrInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mrInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mrInActionPerformed

    private void closeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMousePressed
        System.exit(0);
    }//GEN-LAST:event_closeMousePressed

    private void kodeSenyawaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kodeSenyawaKeyPressed
        MrTf.setVisible(true);
        Usagescroll.setVisible(true);
        dropPic.setVisible(true);

        int key = evt.getKeyCode();
        if (key == 10) {
//            comp.setKode(kodeSenyawa.getText());
            try {
                double mr = comp.hitungMassa(reverse(kodeSenyawa.getText()));
                Tn = node.lookup(kodeSenyawa.getText().replaceAll(" ", ""), mr);
                if (node.flag == 0) {
                    MrTf.setText(String.valueOf(Tn.getSenyawa().getMassaMR()));
                    usageTf.setText(Tn.getSenyawa().getUsage());
                    titleNameCompounds.setVisible(true);
                    titleNameCompounds.setText("<html><div style='text-align: center;'>" + Tn.getSenyawa().getIlmiah() + "</div></html>");
                    ImageIcon icon = new ImageIcon(Tn.getSenyawa().getStruktur());
                    Image image = icon.getImage().getScaledInstance(dropPic.getWidth(), dropPic.getHeight(), Image.SCALE_SMOOTH);
                    dropPic.setIcon(new ImageIcon(image));
                } else {
                    MrTf.setText("");
                    usageTf.setText("");
                    titleNameCompounds.setText("");
                    ImageIcon icon = new ImageIcon("");
                    Image image = icon.getImage().getScaledInstance(dropPic.getWidth(), dropPic.getHeight(), Image.SCALE_SMOOTH);
                    dropPic.setIcon(new ImageIcon(image));
                    JOptionPane.showMessageDialog(null, "DATA TIDAK DITEMUKAN", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            } catch (Exception e) {
                MrTf.setText("");
                usageTf.setText("");
                titleNameCompounds.setText("");
                ImageIcon icon = new ImageIcon("");
                Image image = icon.getImage().getScaledInstance(dropPic.getWidth(), dropPic.getHeight(), Image.SCALE_SMOOTH);
                dropPic.setIcon(new ImageIcon(image));
                JOptionPane.showMessageDialog(null, "DATA TIDAK ADA", "Warning", JOptionPane.WARNING_MESSAGE);
            }

        }
    }//GEN-LAST:event_kodeSenyawaKeyPressed

    private void levelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_levelMousePressed
        screenAwal();
        levelShade.setBackground(new Color(255, 204, 102, 60));
        levelShade.setVisible(true);
        dropPic.setIcon(new ImageIcon(resetImage()));
        levelInfoTf.setVisible(true);
        levelInfoShade.setVisible(true);
        levelInfoTf.setText(String.valueOf(node.height()));
    }//GEN-LAST:event_levelMousePressed

    private void sizeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sizeMousePressed
        screenAwal();
        sizeShade.setBackground(new Color(255, 204, 102, 60));
        sizeShade.setVisible(true);
        dropPic.setIcon(new ImageIcon(resetImage()));
        sizeInfoTf.setVisible(true);
        sizeInfoShade.setVisible(true);
        sizeInfoTf.setText(String.valueOf(node.size()));
    }//GEN-LAST:event_sizeMousePressed
    public Image resetImage() {
        ImageIcon icon = new ImageIcon("");
        Image image = icon.getImage().getScaledInstance(dropPic.getWidth(), dropPic.getHeight(), Image.SCALE_SMOOTH);
        return image;
    }

    private void seeallMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seeallMousePressed
        screenAwal();
        seeallShade.setBackground(new Color(255, 204, 102, 60));
        seeallShade.setVisible(true);
        dropPic.setIcon(new ImageIcon(resetImage()));
        SeeAllInfoscroll.setVisible(true);
        sepSeeAllInfo.setVisible(true);
        node.inOrder();
//        ArrayList<String> arrayToPrint = node.list;
        String print = "";
        try {
            node.list.isEmpty();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "EMPTY (silahkan masukan data terlebih dahulu)", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        if (node.list.isEmpty() == false) {
            for (int i = 0; i < node.list.size(); i++) {
                print = print + " " + node.list.get(i).getKode() + ", ";
                System.out.println(i + " i " + node.list.get(i).getKode());
            }
        }
        node.list.clear();
//            for (String kode : node.list) {
//                print = print + " " + kode + ",";
//            }
        print = print.substring(0, print.length()).trim();
        seeAllInfoTf.setText(print);

    }//GEN-LAST:event_seeallMousePressed

    private void binMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_binMousePressed
        screenAwal();
        searchShade.setBackground(new Color(255, 204, 102, 60));
        searchShade.setVisible(true);
        kodeSenyawa.setVisible(true);
        sepcode.setVisible(true);
        ketSearch.setVisible(true);
        double mr = 0;
        try {
            mr = comp.hitungMassa(reverse(kodeSenyawa.getText()));
            node.remove(mr);
            dropPic.setIcon(new ImageIcon(resetImage()));
            kode.remove(indexReverse(kode, kodeSenyawa.getText(), kode.size()));
            kode2.remove(indexReverse(kode2, kodeSenyawa.getText(), kode2.size()));
            JOptionPane.showMessageDialog(this, "Data " + kodeSenyawa.getText() + " berhasil dihapus!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "DATA KOSONG/TIDAK ADA", "Warning", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_binMousePressed

    private void searchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMousePressed
        screenAwal();
        searchShade.setBackground(new Color(255, 204, 102, 60));
        searchShade.setVisible(true);
        kodeSenyawa.setVisible(true);
        sepcode.setVisible(true);
        ketSearch.setVisible(true);
        ketTanpaSpasi.setVisible(true);
    }//GEN-LAST:event_searchMousePressed

    private void searchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseEntered
        addShade.setVisible(false);
        seeallShade.setVisible(false);
        levelShade.setVisible(false);
        sizeShade.setVisible(false);
        searchShade.setBackground(new Color(255, 204, 102, 30));
        searchShade.setVisible(true);
    }//GEN-LAST:event_searchMouseEntered

    private void addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseEntered
        searchShade.setVisible(false);
        seeallShade.setVisible(false);
        levelShade.setVisible(false);
        sizeShade.setVisible(false);
        addShade.setBackground(new Color(255, 204, 102, 30));
        addShade.setVisible(true);
    }//GEN-LAST:event_addMouseEntered

    private void seeallMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seeallMouseEntered
        searchShade.setVisible(false);
        addShade.setVisible(false);
        levelShade.setVisible(false);
        sizeShade.setVisible(false);
        seeallShade.setBackground(new Color(255, 204, 102, 30));
        seeallShade.setVisible(true);
    }//GEN-LAST:event_seeallMouseEntered

    private void levelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_levelMouseEntered
        searchShade.setVisible(false);
        addShade.setVisible(false);
        seeallShade.setVisible(false);
        sizeShade.setVisible(false);
        levelShade.setBackground(new Color(255, 204, 102, 30));
        levelShade.setVisible(true);
    }//GEN-LAST:event_levelMouseEntered

    private void sizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sizeMouseEntered
        searchShade.setVisible(false);
        addShade.setVisible(false);
        seeallShade.setVisible(false);
        levelShade.setVisible(false);
        sizeShade.setBackground(new Color(255, 204, 102, 30));
        sizeShade.setVisible(true);
    }//GEN-LAST:event_sizeMouseEntered

    private void pathImageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pathImageKeyPressed
        int key = evt.getKeyCode();
        if (key == 10) {

            try {
                code = kodeSenyawa2.getText();
                kode.add(code);
                code2 = code.replaceAll(" ", "");
                kode2.add(code2);
//        reverse(code2);
                String compounds = nameSenyawa.getText();
//            String pathIm = pathImage.getText();
                String usage = usageInTf.getText();
                s = new Senyawa(code2, compounds, pathIm, usage);
                comp = s;
                s.setMassaMR(code);
                System.out.println("cekk woy " + code);
                node.insert(s);
            } catch (NoSuchElementException e) {
                JOptionPane.showMessageDialog(null, "Bukan Senyawa Hidrokarbon", "Warning", JOptionPane.WARNING_MESSAGE);
                kode.remove(indexReverse(kode, code, kode.size()));
                kode2.remove(indexReverse(kode2, code, kode2.size()));
            }

        }
    }//GEN-LAST:event_pathImageKeyPressed

    private void addMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMousePressed
        screenAwal();
        addShade.setBackground(new Color(255, 204, 102, 60));
        addShade.setVisible(true);
        dropPic.setIcon(new ImageIcon(resetImage()));
        ketAddkode.setVisible(true);
        ketAdd.setVisible(true);
        kodeSenyawa2.setVisible(true);
        sepcode2.setVisible(true);
        pathImage.setVisible(true);
        sepPath.setVisible(true);
        nameSenyawa.setVisible(true);
        sepname.setVisible(true);
        UsageInscroll.setVisible(true);
        usageInShade.setVisible(true);
    }//GEN-LAST:event_addMousePressed

    private void kodeSenyawa2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kodeSenyawa2FocusGained
        if (kodeSenyawa2.getText().equals("kode senyawa")) {
            kodeSenyawa2.setText("");
        }
    }//GEN-LAST:event_kodeSenyawa2FocusGained

    private void kodeSenyawa2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kodeSenyawa2FocusLost
        if (kodeSenyawa2.getText().equals("")) {
            kodeSenyawa2.setText("kode senyawa");
        }
    }//GEN-LAST:event_kodeSenyawa2FocusLost

    private void nameSenyawaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameSenyawaFocusGained
        if (nameSenyawa.getText().equals("nama senyawa")) {
            nameSenyawa.setText("");
        }
    }//GEN-LAST:event_nameSenyawaFocusGained

    private void nameSenyawaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameSenyawaFocusLost
        if (nameSenyawa.getText().equals("")) {
            nameSenyawa.setText("nama senyawa");
        }
    }//GEN-LAST:event_nameSenyawaFocusLost

    private void pathImageFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pathImageFocusGained
        if (pathImage.getText().equals("path gambar/drag image here")) {
            pathImage.setText("");
        }
    }//GEN-LAST:event_pathImageFocusGained

    private void pathImageFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pathImageFocusLost
        if (pathImage.getText().equals("")) {
            pathImage.setText("path gambar/drag image here");
        }
    }//GEN-LAST:event_pathImageFocusLost

    private void kodeSenyawaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kodeSenyawaFocusGained
        if (kodeSenyawa.getText().equals("kode senyawa")) {
            kodeSenyawa.setText("");
        }
    }//GEN-LAST:event_kodeSenyawaFocusGained

    private void kodeSenyawaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kodeSenyawaFocusLost
        if (kodeSenyawa.getText().equals("")) {
            kodeSenyawa.setText("kode senyawa");
        }
    }//GEN-LAST:event_kodeSenyawaFocusLost

    private void usageInTfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usageInTfFocusGained
        if (usageInTf.getText().equals("manfaat/sering ditemukan di...")) {
            usageInTf.setText("");
        }
    }//GEN-LAST:event_usageInTfFocusGained

    private void usageInTfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usageInTfFocusLost
        if (usageInTf.getText().equals("")) {
            usageInTf.setText("manfaat/sering ditemukan di...");
        }
    }//GEN-LAST:event_usageInTfFocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainScreen2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MrShade;
    private javax.swing.JTextField MrTf;
    private javax.swing.JScrollPane SeeAllInfoscroll;
    private javax.swing.JScrollPane UsageInscroll;
    private javax.swing.JScrollPane Usagescroll;
    private javax.swing.JLabel add;
    private javax.swing.JLabel addShade;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel bin;
    private javax.swing.JLabel close;
    private javax.swing.JLabel dropPic;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel ketAdd;
    private javax.swing.JLabel ketAddkode;
    private javax.swing.JLabel ketSearch;
    private javax.swing.JLabel ketTanpaSpasi;
    private javax.swing.JTextField kodeSenyawa;
    private javax.swing.JTextField kodeSenyawa2;
    private javax.swing.JLabel level;
    private javax.swing.JLabel levelInfoShade;
    private javax.swing.JTextField levelInfoTf;
    private javax.swing.JLabel levelShade;
    private javax.swing.JTextField mrIn;
    private javax.swing.JLabel mrLb;
    private javax.swing.JTextField nameSenyawa;
    private javax.swing.JTextField pathImage;
    private javax.swing.JLabel search;
    private javax.swing.JLabel searchShade;
    private javax.swing.JTextArea seeAllInfoTf;
    private javax.swing.JLabel seeall;
    private javax.swing.JLabel seeallShade;
    private javax.swing.JSeparator sepMrIn;
    private javax.swing.JSeparator sepPath;
    private javax.swing.JSeparator sepSeeAllInfo;
    private javax.swing.JSeparator sepcode;
    private javax.swing.JSeparator sepcode2;
    private javax.swing.JSeparator sepname;
    private javax.swing.JLabel size;
    private javax.swing.JLabel sizeInfoShade;
    private javax.swing.JTextField sizeInfoTf;
    private javax.swing.JLabel sizeShade;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title2;
    private javax.swing.JLabel titleNameCompounds;
    private javax.swing.JLabel usageInShade;
    private javax.swing.JTextArea usageInTf;
    private javax.swing.JLabel usageLb;
    private javax.swing.JLabel usageShade;
    private javax.swing.JTextArea usageTf;
    // End of variables declaration//GEN-END:variables
}
