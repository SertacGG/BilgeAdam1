package Nesne;

public class NesneBalangic {
    public static void main(String[] args) {
        Diktortgen diktortgen = new Diktortgen();

        System.out.println(diktortgen.uzunluk);
        System.out.println(diktortgen.a);// ilk değerini atamasaydık sınıfın içinde null dönerdi.

        diktortgen.en = 5;
        diktortgen.uzunluk = 10;
        System.out.println(diktortgen.en);
        System.out.println(diktortgen.uzunluk);

        Diktortgen diktortgen1 = new Diktortgen();

        diktortgen1 = diktortgen;
        System.out.println("Yeni nesne " + diktortgen1.alan);
        // referans tipleri steakte tutulur ÖR : Diktortgen diktorgen;
        // heap te ise ÖR : new Diktortgen;
        // ramde ise oluşturulan yeni nesnenin verileri tutulur.
        // üstte yaptığımız  gibi nesnleri biribirne atarsak yani heap teki işaret ettiğimiz new Diktortgen; artık diğer
        // new Diktortgeni işaret ediyor artık işaret edilmeyen artık siliniyor bunu takip eden garbage collector var o boştakileri siler
        // hem heap tekini hemde ramdeki allocate edilen yerleri siler.



    }

}
