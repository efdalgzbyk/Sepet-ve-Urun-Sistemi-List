import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<SepetUrun> s = new ArrayList<>();

        s.add(new SepetUrun(1, "Çikolata", 20, 10));
        s.add(new SepetUrun(2, "Un", 32, 3));
        s.add(new SepetUrun(3, "Tatlı", 50, 35));
        s.add(new SepetUrun(4, "Makarna", 54, 13));

        // 🔹 Comparable (Toplam fiyata göre)
        System.out.println("=== Toplam Fiyata Gore Siralama ===");
        Collections.sort(s);
        for (SepetUrun u : s) {
            u.bilgiYazdir();
            System.out.println("-----------------");
        }

        // 🔹 Comparator (Ada gore)
        System.out.println("\n=== Ada Gore Siralama ===");
        Collections.sort(s, new AdComparator());
        for (SepetUrun u : s) {
            u.bilgiYazdir();
            System.out.println("-----------------");
        }
    }
}
