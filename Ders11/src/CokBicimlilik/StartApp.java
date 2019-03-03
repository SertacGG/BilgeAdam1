package CokBicimlilik;

// Bir nesnenin başka nir nesne gibi davranış sergilemesi
public class StartApp {

    public static void main(String[] args) {
        Sekiller sekiller = new Sekiller();
        System.out.println(sekiller.alanHesapla());
        Dikdortgen dikdortgen = new Dikdortgen();
        dikdortgen.setEn(5);
        dikdortgen.setBoy(6);
        //System.out.println("Dikdortgenin alanı: " + dikdortgen.alanHesapla());
        Kare kare = new Kare();
        kare.setKenar(3);
        //System.out.println("Karenin alanı: " + kare.alanHesapla());
        sekillerinAlanininHesapla(sekiller);
        sekillerinAlanininHesapla(dikdortgen);
        sekillerinAlanininHesapla(kare);
    }

    public static void sekillerinAlanininHesapla(Sekiller sekiller) { //Bu olay polimorfizim
        System.out.println("Şeklin Alanı: " + sekiller.alanHesapla());
    }

}
