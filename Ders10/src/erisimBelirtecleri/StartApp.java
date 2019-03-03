package erisimBelirtecleri;

public class StartApp {
    public static void main(String[] args) {

        Dikdortgen dikdortgen = new Dikdortgen();
        System.out.println(dikdortgen.getEn());
        dikdortgen.setEn(20);
        System.out.println(dikdortgen.getEn());
        System.out.println(dikdortgen.toString());
    }
}
