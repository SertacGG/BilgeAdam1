package CokBicimlilik;

public class StartApp2 {
    public static void main(String[] args) {
        Sekiller sekiller = new Sekiller();
        Dikdortgen dikdortgen = new Dikdortgen();
        dikdortgen.setBoy(6);
        dikdortgen.setEn(5);
        Kare kare = new Kare();
        kare.setKenar(10);
        sekillerinAlaniniHesaplama(sekiller);
        sekillerinAlaniniHesaplama(dikdortgen);
        sekillerinAlaniniHesaplama(kare);
        Kisi kisi = new Kisi();
        sekillerinAlaniniHesaplama(kisi);

    }

    public static void sekillerinAlaniniHesaplama(Object nesne) {
        if (nesne instanceof Sekiller) {
            Sekiller sekiller = (Sekiller) nesne;
            System.out.println("Sekiller nesnesinin alanı: " + sekiller.alanHesapla());

        } else {
            System.out.println("Bu bir sekil değildir!");
        }
    }
}
