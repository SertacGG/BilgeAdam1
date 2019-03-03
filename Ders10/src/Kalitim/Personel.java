package Kalitim;

public class Personel {

    private String ad;
    private String soyad;
    private int yas;
    private long sicilNumarasi;

    public Personel() {

    }

    public Personel(String ad, String soyad, int yas, long sicilNumarasi) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
        this.sicilNumarasi = sicilNumarasi;
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

    public long getSicilNumarasi() {
        return sicilNumarasi;
    }

    public void setSicilNumarasi(long sicilNumarasi) {
        this.sicilNumarasi = sicilNumarasi;
    }

    @Override
    public String toString() {
        return "Personel{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                ", sicilNumarasi=" + sicilNumarasi +
                '}';
    }
}
