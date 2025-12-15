public class SepetUrun extends Urun implements Indirim, Comparable<SepetUrun> {

    private int adet;

    public SepetUrun(int id, String ad, double fiyat, int adet) {
        super(id, ad, fiyat);
        this.adet = adet;
    }

    public double toplamFiyat() {
        return getFiyat() * adet;
    }

    @Override
    public double indirimliFiyat() {
        if (toplamFiyat() >= 500) {
            return toplamFiyat() * 0.9;
        }
        return toplamFiyat();
    }

    @Override
    public void bilgiYazdir() {
        System.out.println("Bilgiler:");
        System.out.println("Urun adı : " + getAd());
        System.out.println("Urun kodu : " + getId());
        System.out.println("Urun fiyat : " + getFiyat());
        System.out.println("Urun adeti : " + adet);
        System.out.println("Toplam fiyat : " + indirimliFiyat());
    }

    @Override
    public int compareTo(SepetUrun o) {
        return Double.compare(this.toplamFiyat(), o.toplamFiyat());
    }
}
