package CokBicimlilik;

public class Kare extends Sekiller {

    private double kenar;

    public Kare() {
    }

    public Kare(double kenar) {
        this.kenar = kenar;
    }

    @Override
    public double alanHesapla() {
        return this.kenar * this.kenar;
    }

    @Override
    public double cevreHesapla() {
        return this.kenar * 4;
    }

    public double getKenar() {
        return kenar;
    }

    public void setKenar(double kenar) {
        this.kenar = kenar;
    }
}
