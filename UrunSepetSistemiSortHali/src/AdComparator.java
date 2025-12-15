import java.util.Comparator;

public class AdComparator implements Comparator<SepetUrun> {

    @Override
    public int compare(SepetUrun u1, SepetUrun u2) {
        return u1.getAd().compareToIgnoreCase(u2.getAd());
    }
}
