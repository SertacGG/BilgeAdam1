import java.util.Scanner;

public class StringMethod {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kelime sayısını bulmak için camel cse bir ifade girin");
        String deger = scanner.next();
        //String deger = "stringIfadeleriGetirenMathod";

        char[] charDeger = deger.toCharArray();
        int x = 1;

        for (int i = 0; i<deger.length(); i++) {
            if (charDeger[i] == Character.toUpperCase(charDeger[i])) {
                x++;
                //System.out.println(charDeger[i]);
            }
        }
        System.out.println("Cümlede " + x + " kelime vardır.");

    }
}
