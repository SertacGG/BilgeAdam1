import java.io.IOException;
import java.util.Scanner;

public class Ornekler {

    public static void main(String[] args) {

        while (true){
            islem();

        }

    }

    public static void islem() {
        Scanner input  = new Scanner(System.in);

        System.out.println("Yapmak istediğiniz işlemi seçiniz");
        System.out.println("1 - toplama");
        System.out.println("2 - cikarma");
        System.out.println("3 - carpma");
        System.out.println("4 - bolme");
        System.out.println("5 - mod");
        String islem = input.nextLine();

        System.out.println("ilk sayıyı girin");
        int sayi1 = input.nextInt();
        System.out.println("ikinci sayıyı girin");
        int sayi2 = input.nextInt();
        float sonuc ;

        switch (islem) {
            case "1" : sonuc = toplama(sayi1, sayi2); System.out.println(sayi1 + "+" + sayi2 + " = " + sonuc); break;
            case "2" : sonuc = cikarma(sayi1, sayi2); System.out.println(sayi1 + "-" + sayi2 + " = " + sonuc); break;
            case "3" : sonuc = carpma(sayi1, sayi2);  System.out.println(sayi1 + "*" + sayi2 + " = " + sonuc); break;
            case "4" : sonuc = bolme(sayi1, sayi2);   System.out.println(sayi1 + "/" + sayi2 + " = " + sonuc); break;
            case "5" : sonuc = mod(sayi1, sayi2);     System.out.println(sayi1 + "%" + sayi2 + " = " + sonuc); break;
            default: System.out.println("işleminiz burada yok"); break;
        }
    }
    public static int toplama(int sayi1, int sayi2) {
        return sayi1 + sayi2 ;

    }
    public static int cikarma(int sayi1, int sayi2) {
        return sayi1 - sayi2 ;

    }
    public static int carpma(int sayi1, int sayi2) {
        return sayi1 * sayi2 ;

    }
    public static float bolme(int sayi1, int sayi2) {
        float sonuc = (float) sayi1 / (float) sayi2;
        return sonuc;

    }
    public static int mod(int sayi1, int sayi2) {
        return sayi1 % sayi2 ;

    }

}
