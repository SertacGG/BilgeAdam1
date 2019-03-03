package kalitim2;

public class StartApp {

    public static void main(String[] args) {

        Ogrenci ogr = new Ogrenci();
        ogr.setAd("sertac");
        ogr.setSoyad("guler");
        ogr.setYas(27);
        ogr.setOkulNumarasi(123456789);

        System.out.println(ogr.kisiBilgileri());

        Personel personel = new Personel();
        personel.setAd("mahmut");
        personel.setSoyad("tuncer");
        personel.setYas(51);
        personel.setSicilNumarasi(987654321);

        System.out.println(personel.kisiBilgileri());

        Ogrenci ogrenci = new Ogrenci();
        ogrenci.setOkulNumarasi(123456852);
        System.out.println(ogrenci.kisiBilgileri());

    }
}
