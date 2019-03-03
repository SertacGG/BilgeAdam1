package Kalitim;

public class Ogrenci {

    private String ad;
    private String soyad;
    private int yas;
    private long okulNumarasi;

    public Ogrenci() {

    }

    public Ogrenci(String ad, String soyad, int yas, long okulNumarasi) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
        this.okulNumarasi = okulNumarasi;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public long getOkulNumarasi() {
        return okulNumarasi;
    }

    public void setOkulNumarasi(long okulNumarasi) {
        this.okulNumarasi = okulNumarasi;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                ", okulNumarasi=" + okulNumarasi +
                '}';
    }
}
