public class Dikdortgen {

    public double uzunluk;
    public double en;
    public double cevre;
    public double alan;
    public Double a = new Double(0);

    public static int sayi;
    public static final int PI_SAYISI = 5; //constant lar butuk harf ile başlar yani sabit ler.

    public void alanHasapla() {
        this.alan = this.en * this.uzunluk;
        System.out.println("Diktorgenin Alanı : " + this.alan);

    }

    public void cevreHasapla() {
        this.cevre = 2 * this.en + 2 * this.uzunluk;
        System.out.println("Diktorgenin Çevresi : " + this.cevre);

    }
}