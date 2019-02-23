package Odev;

import java.util.Scanner;

public class DiziOdev {

    public static void main(String[] args) {
        /*
        //kullanıcı dizinin boyutunu girecek ve merdiven şeklinde aşağıdaki şekil oluşturulacak
        // satır ve sutun eşit olcak.
        //dizi[i][k] = "x"
        // 4 x 4 bir dizi alttaki şekil
        // dizi ile yapılacak

            *
           **
          ***
         ****

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dizinin eleman sayisini giriniz");
        int sayi = scanner.nextInt();

        char[][] dizi = new char[sayi][sayi];

        for (int i = 0; i < dizi.length; i++) {
            for (int y = 0; y < dizi.length; y++) {
                if ((y + i) >= dizi.length - 1) {
                    dizi[i][y] = 'x';
                } else {
                    dizi[i][y] = ' ';
                }
            }
        }

        for (int i = 0; i < dizi.length; i++) {
            for (int y = 0; y < dizi.length; y++) {
                System.out.print(dizi[i][y]); // dizi[i][y]
            }
            System.out.println("\n");
        }

    }
}
