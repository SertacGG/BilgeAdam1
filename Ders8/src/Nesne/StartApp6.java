package Nesne;

public class StartApp6 {
    public static void main(String[] args) {

        System.out.println( Diktortgen.PI_SAYISI);
        Diktortgen diktortgen = new Diktortgen();
        System.out.println( diktortgen.PI_SAYISI);

        Diktortgen diktortgen1 = new Diktortgen(5,11);
        diktortgen1.alanHasapla();

    }
}
