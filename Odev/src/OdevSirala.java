public class OdevSirala {

    public static void main(String[] args) {
        int[] dizi = {7, 5, 4, 6, 3, 1, 10, 8, 9, 2};
        int temp = 0;
        for (int i = 0; i < dizi.length; i++) {
            for (int x = i + 1; x < dizi.length; x++) {
                if (dizi[i] > dizi[x]) {
                    temp = dizi[i];
                    dizi[i] = dizi[x];
                    dizi[x] = temp;
                }
            }
        }
        String sonuc = "";
        for (int i : dizi) {
            sonuc += i + " ";
        }
        System.out.println("Dizi'nin sıralanmış hali : " + sonuc + " ***");
    }

}
