package BST;

// @author dyline
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class Senyawa implements Comparable {

    private String kode;
    private String ilmiah;
    private String struktur;
    private double massaMR;
    private String usage;

    public Senyawa(String kode) {
        this.kode = kode;
        this.ilmiah = ilmiah;
        this.struktur = struktur;
        this.usage = usage;
        this.massaMR = getMassaMR();
    }

    public Senyawa(String kode, String ilmiah, String struktur, String usage) {
        this.kode = kode;
        this.ilmiah = ilmiah;
        this.struktur = struktur;
        this.usage = usage;
        this.massaMR = getMassaMR();
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getIlmiah() {
        return ilmiah;
    }

    public void setIlmiah(String ilmiah) {
        this.ilmiah = ilmiah;
    }

    public String getStruktur() {
        return struktur;
    }

    public void setStruktur(String struktur) {
        this.struktur = struktur;
    }

    public double getMassaMR() {
        return massaMR;
    }

    public boolean isInteger(String s) {
        boolean result = false;
        try {
            Integer.parseInt(s);
            result = true;
        } catch (NumberFormatException nfe) {
//            JOptionPane.showMessageDialog(null, "FORMAT MASUKAN SALAH\n"
//                    + "Maaf, hanya integer yang diperbolehkan!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return result;
    }

    public void setMR(double mr) {
        this.massaMR = mr;
    }

    public int partHitungMR(int mr1, int unsur, boolean tkn, String e2) {
        int multiplier;
//        if ((j + 1) < length) {
        tkn = isInteger(e2);
        if (tkn == true) {
            multiplier = Integer.parseInt(e2);
            mr1 = mr1 + unsur * multiplier;
            System.out.println(mr1 + " cek1");
        } else {
            mr1 = mr1 + unsur;
        }
//        } else {
//            mr1 = mr1 + unsur;
//        }
        return mr1;
    }

    public double hitungMassa(String kode) throws NoSuchElementException {
        int unsur, multiplier, mr1 = 0;
        int i = 0;
        StringTokenizer tokens = new StringTokenizer(kode, " ");
        String[] a = new String[tokens.countTokens()];
        while (tokens.hasMoreTokens()) {
            a[i] = tokens.nextToken();
            i++;
        }

        for (int j = 0; j < a.length; j++) {
            System.out.println("a " + a[j]);
            boolean tkn;
            tkn = isInteger(a[j]);
            if (tkn == false) {
                System.out.println("hai");
                if (a[j].equalsIgnoreCase("C")) {
                    unsur = 12;
                    if ((j + 1) < a.length) {
                        mr1 = partHitungMR(mr1, unsur, tkn, a[j + 1]);
//                        tkn = isInteger(a[j + 1]);
//                        if (tkn == true) {
//                            multiplier = Integer.parseInt(a[j + 1]);
//                            mr1 = mr1 + unsur * multiplier;
//                            System.out.println(mr1 + " cek1");
//                        } else {
//                            mr1 = mr1 + unsur;
//                        }
                    } else {
                        mr1 = mr1 + unsur;
                    }
                } else if (a[j].equalsIgnoreCase("H")) {
                    System.out.println("");
                    unsur = 1;
                    if ((j + 1) < a.length) {
                        mr1 = partHitungMR(mr1, unsur, tkn, a[j + 1]);
//                        tkn = isInteger(a[j + 1]);
//                        if (tkn == true) {
//                            multiplier = Integer.parseInt(a[j + 1]);
//                            mr1 = mr1 + unsur * multiplier;
//                            System.out.println(mr1 + " cek2");
//                        } else {
//                            mr1 = mr1 + unsur;
//                        }
                    } else {
                        mr1 = mr1 + unsur;
                    }
                } else if (a[j].equalsIgnoreCase("O")) {
                    unsur = 16;
                    if ((j + 1) < a.length) {
                        mr1 = partHitungMR(mr1, unsur, tkn, a[j + 1]);
//                        tkn = isInteger(a[j + 1]);
//                        if (tkn == true) {
//                            multiplier = Integer.parseInt(a[j + 1]);
//                            mr1 = mr1 + unsur * multiplier;
//                            System.out.println(mr1 + " cek3");
//                        } else {
//                            mr1 = mr1 + unsur;
//                        }
                    } else {
                        mr1 = mr1 + unsur;
                    }
                } else if (a[j].equalsIgnoreCase("N")) {
                    unsur = 14;
                    if ((j + 1) < a.length) {
                        mr1 = partHitungMR(mr1, unsur, tkn, a[j + 1]);
//                        tkn = isInteger(a[j + 1]);
//                        if (tkn == true) {
//                            multiplier = Integer.parseInt(a[j + 1]);
//                            mr1 = mr1 + unsur * multiplier;
//                            System.out.println(mr1 + " cek3");
//                        } else {
//                            mr1 = mr1 + unsur;
//                        }
                    } else {
                        mr1 = mr1 + unsur;
                    }
                } else if (a[j].equalsIgnoreCase("P")) {
                    unsur = 31;
                    if ((j + 1) < a.length) {
                        mr1 = partHitungMR(mr1, unsur, tkn, a[j + 1]);
//                        tkn = isInteger(a[j + 1]);
//                        if (tkn == true) {
//                            multiplier = Integer.parseInt(a[j + 1]);
//                            mr1 = mr1 + unsur * multiplier;
//                            System.out.println(mr1 + " cek3");
//                        } else {
//                            mr1 = mr1 + unsur;
//                        }
                    } else {
                        mr1 = mr1 + unsur;
                    }
                } else if (a[j].equalsIgnoreCase("F")) {
                    unsur = 19;
                    if ((j + 1) < a.length) {
                        mr1 = partHitungMR(mr1, unsur, tkn, a[j + 1]);
//                        tkn = isInteger(a[j + 1]);
//                        if (tkn == true) {
//                            multiplier = Integer.parseInt(a[j + 1]);
//                            mr1 = mr1 + unsur * multiplier;
//                            System.out.println(mr1 + " cek3");
//                        } else {
//                            mr1 = mr1 + unsur;
//                        }
                    } else {
                        mr1 = mr1 + unsur;
                    }
                } else if (a[j].equalsIgnoreCase("Cl")) {
                    unsur = 35;
                    if ((j + 1) < a.length) {
                        mr1 = partHitungMR(mr1, unsur, tkn, a[j + 1]);
//                        tkn = isInteger(a[j + 1]);
//                        if (tkn == true) {
//                            multiplier = Integer.parseInt(a[j + 1]);
//                            mr1 = mr1 + unsur * multiplier;
//                            System.out.println(mr1 + " cek3");
//                        } else {
//                            mr1 = mr1 + unsur;
//                        }
                    } else {
                        mr1 = mr1 + unsur;
                    }
                } else if (a[j].equalsIgnoreCase("Br")) {
                    unsur = 80;
                    if ((j + 1) < a.length) {
                        mr1 = partHitungMR(mr1, unsur, tkn, a[j + 1]);
//                        tkn = isInteger(a[j + 1]);
//                        if (tkn == true) {
//                            multiplier = Integer.parseInt(a[j + 1]);
//                            mr1 = mr1 + unsur * multiplier;
//                            System.out.println(mr1 + " cek3");
//                        } else {
//                            mr1 = mr1 + unsur;
//                        }
                    } else {
                        mr1 = mr1 + unsur;
                    }
                } else if (a[j].equalsIgnoreCase("I")) {
                    unsur = 127;
                    if ((j + 1) < a.length) {
                        mr1 = partHitungMR(mr1, unsur, tkn, a[j + 1]);
//                        tkn = isInteger(a[j + 1]);
//                        if (tkn == true) {
//                            multiplier = Integer.parseInt(a[j + 1]);
//                            mr1 = mr1 + unsur * multiplier;
//                            System.out.println(mr1 + " cek3");
//                        } else {
//                            mr1 = mr1 + unsur;
//                        }
                    } else {
                        mr1 = mr1 + unsur;
                    }
                } else {
                    throw new NoSuchElementException("NULL");
                }
            }
        }
        return mr1;
    }

    public void setMassaMR(String kode) {

        this.massaMR = hitungMassa(kode);
//        if (i < a.length - 1) {
//            String recompose = "";
//            for (int j = 0; j < i-1; j++) {
//                recompose = recompose + a[j] + " ";
//            }
//            p.setFirst_name(recompose);
//            p.setLast_name(a[a.length - 1]);

//        if (kode.equalsIgnoreCase("ch4")) {
//            this.massaMR = 18;
//        } else {
//            this.massaMR = 22;
//        }
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    @Override
    public int compareTo(Object o) {
        Senyawa s = (Senyawa) o;
        if (this.massaMR > s.massaMR) {
            return 1;
        } else if (this.massaMR == s.massaMR) {
            return 0;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Senyawa{" + "kode=" + kode + ", ilmiah=" + ilmiah + ", struktur=" + struktur + ", massaMR=" + massaMR + ", usage=" + usage + '}';
    }
}
