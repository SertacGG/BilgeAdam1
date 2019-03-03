package CokBicimlilik;

import java.util.ArrayList;

public class StartApp3 {

    public static void main(String[] args) {
        //genisletebilirlilik();
        dinamikDizi();

    }

    public static void genisletebilirlilik() {
        Sekiller sekiller = new Sekiller();
        Sekiller sekiller1 = new Sekiller();
        Dikdortgen dikdortgen = new Dikdortgen(3, 5);
        Dikdortgen dikdortgen1 = new Dikdortgen();
        dikdortgen.setEn(2);
        dikdortgen.setBoy(3);
        Kare kare = new Kare(9);
        Kare kare1 = new Kare();
        kare.setKenar(7);

        Sekiller[] sekillerDizisi = new Sekiller[6];
        sekillerDizisi[0] = sekiller;
        sekillerDizisi[1] = sekiller1;
        sekillerDizisi[2] = dikdortgen;
        sekillerDizisi[3] = dikdortgen1;
        sekillerDizisi[4] = kare;
        sekillerDizisi[5] = kare1;

        sekillerAlanlari(sekillerDizisi);

    }

    public static void sekillerAlanlari(Sekiller[] sekillerDizi) {
        if (sekillerDizi.length > 0) {
            for (Sekiller sekiller : sekillerDizi) {
                System.out.println("Sekillerin alanı: " + sekiller.alanHesapla());
            }
        }
    }

    public static void dinamikDizi() {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(17);
        arrayList.get(0);
        System.out.println("Dizinin boyutu: " + arrayList.size());
        //System.out.println(arrayList.get(0));
        for (Integer eleman : arrayList) {
            System.out.println(eleman);
        }

    }

}
