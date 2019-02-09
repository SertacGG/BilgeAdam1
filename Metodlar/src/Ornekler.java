public class Ornekler {

    public static void main(String[] args) {
        helloMethod();
        sayiYaz(52);
        toplama(11,12);
        int sonuc = carpma(12, 5);
        System.out.println("Carpma sonucu : " + sonuc);

    }

    public static void helloMethod() {
        System.out.println("Hello Method..");

    }

    public static void sayiYaz(int sayi) {
        System.out.println("Sayiniz : " + sayi);

    }

    public static void toplama(int sayi1, int sayi2) {
        System.out.println("Toplam : " + (sayi1 + sayi2));

    }

    public static int carpma(int sayi1, int sayi2) {
        return sayi1 * sayi2 ;

    }

}
