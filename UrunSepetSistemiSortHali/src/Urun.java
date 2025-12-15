public abstract class Urun {

    private int id;
    private String ad;
    private double fiyat;

    protected Urun(int id, String ad, double fiyat) {
        this.id = id;
        this.ad = ad;
        this.fiyat = fiyat;
    }

    public int getId() {
        return id;
    }

    public String getAd() {
        return ad;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public abstract void bilgiYazdir();
}
