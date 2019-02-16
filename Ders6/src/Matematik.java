import java.util.Random;
import java.util.Scanner;

public class Matematik {
    public static void main(String[] args) {
        Random rnd = new Random();
        int tutulan = rnd.nextInt(1000);
        System.out.println(tutulan);
        Scanner input = new Scanner(System.in);
        int tahmin = 0;
        while (tahmin != tutulan) {
            System.out.print("Tekrar Dene : ");
            tahmin = input.nextInt();
            if (tahmin <= ( tutulan + 2) && tahmin > tutulan) {
                System.out.println("Çok Yaklaştınız");
            }else if(tahmin >= ( tutulan - 2) && tahmin < tutulan) {
                System.out.println("Çok yakınsınız");
            }else if(tahmin > tutulan){
                System.out.println("Çok uzak be *** Aşağı ***");
            }else if(tahmin < tutulan){
                System.out.println("Çok uzak be *** Yukarı ***");
            }else if (tahmin == tutulan){
                System.out.println("Bingo!");
            }

        }

    }

}
