package kalitim2;

public class Kisi {

    private String ad;
    private String soyad;
    private int yas;

    public Kisi() {

    }

    public Kisi(String ad, String soyad, int yas) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
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

    public String kisiBilgileri() {
        return "Adı : " + this.ad + ", Soyadı : " + this.soyad + ", Yaşı : " + this.yas;
    }

}
