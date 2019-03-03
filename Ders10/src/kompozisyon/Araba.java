package kompozisyon;

public class Araba {

    private Motor motor; //Bu olay kompozisyon.

    public Araba() {
        motor = new Motor();
    }

    public void haraketZamani() {
        motor.motorCalistir();
        System.out.println("Araba harekate geçti....");
    }

    public void durmaZamanı() {
        motor.motoruDurdur();
    }
}
