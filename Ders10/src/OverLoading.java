public class OverLoading {

    public static void main(String[] args) {
        Dikdortgen dikdortgen = new Dikdortgen();
        dikdortgen.en = 5;
        passByValue(dikdortgen);
        System.out.println("PassByValue : " + (dikdortgen.en == 5));
        passByReferance(dikdortgen);
        System.out.println("CallByReferance : " + (dikdortgen.en == 5));
    }

    public static void passByValue(Dikdortgen dikdortgen) {
        dikdortgen = new Dikdortgen(); //yeni alan verdik ki öncekinin değerini değiştirmesin.
        dikdortgen.en = 6;
    }

    public static void passByReferance(Dikdortgen dikdortgen) {
        dikdortgen.en = 6;
    }
}
