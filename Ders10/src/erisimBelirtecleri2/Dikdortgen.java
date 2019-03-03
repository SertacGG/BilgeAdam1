package erisimBelirtecleri2;

public class Dikdortgen {

    private double uzunluk;
    private double en;
    private double cevre;
    private double alan;

    //private ile sadece sınıf üzerinden erişim
    //public  ile tüm paketlerden erişim
    //protected sadece aynı ppaket
    // ve protected tanımlı metjhhod olan sınıfın alt sınıflarına erişim
    //default erişim  belirt4eçleri sadece o paket içerisnden erişilebilir.

    protected void cevreHesaplama() {
        //aynı pakage dan erişilebilir
    }

    void alanHesaplama() {
        //aynı pakage dan erişilebilir
    }

    public double getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(double uzunluk) {
        this.uzunluk = uzunluk;
    }

    public double getEn() {
        return en;
    }

    public void setEn(double en) {
        this.en = en;
    }

    public double getCevre() {
        return cevre;
    }

    public void setCevre(double cevre) {
        this.cevre = cevre;
    }

    public double getAlan() {
        return alan;
    }

    public void setAlan(double alan) {
        this.alan = alan;
    }

    @Override
    public String toString() {
        return "Dikdortgen{" +
                "uzunluk=" + uzunluk +
                ", en=" + en +
                '}';
    }
}
