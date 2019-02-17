public class StringMethod {
    public static void main(String[] args) {
        String deger = "stringIfadeleriGetirenMathod";

        char[] charDeger = deger.toCharArray();
        int x = 0;

        for (int i = 0; i<deger.length(); i++) {
            if (charDeger[i] == Character.toUpperCase(charDeger[i])) {
                x++;
                //System.out.println(charDeger[i]);
            }
        }
        System.out.println("Cümlede " + (x+1) + " kelime vardır.");

    }
}
