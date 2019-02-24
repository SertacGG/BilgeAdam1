package kalitim2;

public class Ogrenci extends Kisi {
    private long okulNumarasi;

    public Ogrenci() {
        //superden önce alt sınıfa değer atanamaz
        // önce super sınıfının objesinin oluşturulması gerekir
        //this.okulNumarsı = 12;
        super("Kemal","Sunal", 64);
        super.setAd("mahmut");
        super.setYas(55);
    }

    public long getOkulNumarasi() {
        return okulNumarasi;
    }

    public void setOkulNumarasi(long okulNumarasi) {
        this.okulNumarasi = okulNumarasi;
    }

    @Override
    public String kisiBilgileri() {
        return "Öğrenci bilgisi { " + super.kisiBilgileri() + ", OkulNumarası : "+ this.okulNumarasi + " }";
    }
}
