package Odev;

import java.util.Scanner;

public class GirilenIfadeEdenHarfSayisiniBulun {
    public static void main(String[] args) {
        /*
         * Kullanıcı
         * Önce cümle yada kelime girecek
         * Sonrasında bir harf girecek
         * program kullanıcının girdigi harf sayısını girilen ifade içinde bulacak
         * */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kelime sayısını bulmak için camel cse bir ifade girin");
        String cumle = scanner.nextLine();

        System.out.println("dg");
        String harf = scanner.next();

        int t = 0;
        char[] c = cumle.toCharArray();

        for (int i = 0; i < cumle.length(); i++) {
            if (c[i] == harf.charAt(0)) {
                t++;
            }
        }
        System.out.println("Girilen cümlede " + harf + " harfinden " + t + " tane var.");

    }
}
