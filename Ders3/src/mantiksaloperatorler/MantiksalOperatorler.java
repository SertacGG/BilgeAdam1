package mantiksaloperatorler;

public class MantiksalOperatorler {

    public static void main(String[] args) {

        String sonuc = "";
        int i;
        for(i =0; i<=100; i++) {
            if(i % 2 == 1) {
                sonuc += i + " ";
            }
        }
        System.out.println(sonuc);
    }
}
