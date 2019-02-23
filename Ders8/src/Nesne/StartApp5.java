package Nesne;

public class StartApp5 {
    public static void main(String[] args) {

        Diktortgen.sayi = 45;
        System.out.println("Nesneyi new lemeden static değere ataa yaptım ve ulaştım : " + Diktortgen.sayi);

        Diktortgen diktortgen = new Diktortgen();
        System.out.println("sayinin son değer : " + diktortgen.sayi); //Son atanan değer kalır sonuc değişmedi nekadar nesne new lesende
        // atama yapmaz isen hep aynı kalır.




    }
}
