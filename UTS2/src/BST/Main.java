package BST;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Tree node = new Tree();
        Scanner s = new Scanner(System.in);
        String input = "";
        char character = ' ';
        while (character != '0') {
            try {
                printMenu();
                System.out.print("PILIH : ");
                input = s.next().toLowerCase();
                character = input.charAt(0);
                if (character == '1') {
                    String kode = s.next();
                    String nama = s.nextLine();
                    boolean added = node.add(kode, nama);
                    System.out.println("");
                    if (!added) {
                        System.out.println("DUPLIKASI KODE SENYAWA");
                        System.out.println("");
                    }
                } else if (character == '2') {
                    String kode = s.next();
                    String nama = node.lookup(kode);
                    System.out.println(kode + ":" + nama);
                } else if (character == '3') {
                    ArrayList<String> arrayToPrint = node.getAll();
                    if (arrayToPrint.isEmpty()) {
                        System.out.println("NULL");
                    } else {
                        String print = "";
                        for (String kode : arrayToPrint) {
                            print = print + " " + kode + ",";
                        }
                        print = print.substring(0, print.length() - 1).trim();
                        System.out.println(print);
                    }
                } else if (character == '4') {
                    System.out.println(node.size());
                    System.out.println("");
                } else if (character == '5') {
                    System.out.println(node.height());
                    System.out.println("");
                } else if (character == '6') {
                    break;
                } else {
                    System.out.println("MASUKKAN SALAH");
                }

            } catch (Exception e) {
                System.out.println(e.getLocalizedMessage());
            }
        }
        s.close();
    }

    public static void printMenu() {
        System.out.println("STRUKTUR SENYAWA KIMIA");
        System.out.println("[1] Tambah Senyawa");
        System.out.println("[2] Cari Kode Senyawa");
        System.out.println("[3] Lihat Senyawa");
        System.out.println("[4] Size Senyawa");
        System.out.println("[5] Height Senyawa");
        System.out.println("[6] Keluar");
        System.out.println("");
    }
}
