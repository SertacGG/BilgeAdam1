public class StringIsleme {
    public static void main(String[] args) {

        String deger = "Merhaba Java"; //degeri tersten yazdıran pro.
        String yeni = "";

        char[] charDeger = deger.toCharArray();

        for (int i = charDeger.length-1; i>=0; i--){
            yeni += charDeger[i];
        }
        System.out.println(yeni);

    }

}
