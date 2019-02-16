public class Matris {
    public static void main(String[] args) {
        int [][] dizi = { {3,4,1}, {8,5,6}, {2,4,15}};

//        dizi[0][0] + dizi[0][2]
//               dizi[1][1]
//        dizi[2][0] + dizi[2][2]
        int sonucSag = 0;
        int sonucSol = 0;
        int dd = dizi.length;
        for(int i = 0; i<dizi.length; i++) {

            dd--;
            sonucSol += dizi[i][i];
            sonucSag += dizi[i][dd];
        }
        System.out.println(Math.abs(sonucSag - sonucSol));
    }

}
