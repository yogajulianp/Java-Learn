import java.util.Arrays;

public class Logic2 {

    public static void main(String[] args) {
        soal1(9);
    }

    public static void soal1(int n) {
        String[][] silang = new String[n][n];
        //baris = i
        //kolom = j

        for (int i = 0 ; i < n; i++){
            int angka = 1;
            //kolom
            for(int j = 0; j < n; j++) {
                if(i==j){
                    silang[i][j] = String.valueOf(angka);
                }
            }
        }
        System.out.println(Arrays.toString(silang));
    }
}


