package scanners;

import java.util.Scanner;

public class AritmatikApp {

    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);

        String mesaj = input.nextLine();
        int sayi1 = input.nextInt();

        System.out.println("input : " + sayi1 + "\n" + "Mesaj : " + mesaj);
    }

}
