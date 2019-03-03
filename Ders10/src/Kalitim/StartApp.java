package Kalitim;

public class StartApp {
    public static void main(String[] args) {
        Personel personel = new Personel("sertac", "guler", 27, 123456);
        Ogrenci ogrenci = new Ogrenci();
        ogrenci.setAd("mahmut");
        ogrenci.setSoyad("tuncer");
        ogrenci.setYas(12);
        ogrenci.setOkulNumarasi(654321);

        System.out.println(personel.toString());
        System.out.println(ogrenci.toString());
    }
}
