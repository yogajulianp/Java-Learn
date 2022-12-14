import java.util.Arrays;

public class Logic2 {

    public static void main(String[] args) {
//        logic2soal1(9);
        logic2soal9(9);
    }

    public static void logic2soal1(int n) {
        String[][] silang = new String[n][n];
        //baris = i
        //kolom = j
        for (int i = 0 ; i < n; i++){
            int angka = 1;
            //kolom
            for(int j = 0; j < n; j++) {
                if(i==j){
                    silang[i][j] = String.valueOf(angka);
                }else if(i+j == n-1) {
                    silang[i][j] = String.valueOf(angka);
                }
                angka++;
            }
        }
        System.out.println("Logic2 Soal no1");
        PrintArray.print(silang);

        //ripitasi ke 2 soal 1
        String[][] silang2 = new String[n][n];
        // isi array

        for (int i = 0; i < n ; i++){
            int angka2 = 1;
            for (int j = 0; j < n ; j++ ){
                if (i == j) {
                    silang2[i][j] = String.valueOf(angka2);
                } else if ( i + j == n-1) {
                    silang2[i][j] = String.valueOf(angka2);
                }
                angka2++;
            }
        }
        System.out.println("Logic2 Soal no1- ulang ke2");
        PrintArray.print(silang2);

        //repitisi ke 3 soal 1, logic 2
//        String[][] silang3 = new String[n][n];
        //isi array
//        for (int i = )
    }

    public static void logic2soal9(int n) {
        String[][] ketupat = new String[n][n];
        //isi array
        int nilaiTengah = n/2;
        for (int i = 0; i< n; i++) {
            for (int j = 0 ; j < n ; j++){
                if (    i+j >= nilaiTengah
                        && j-i <= nilaiTengah
                        && i-j <= nilaiTengah
                        && i+j <= nilaiTengah + n -1 ) {
                    ketupat[i][j]= String.valueOf(1);
                }
            }
        }
        PrintArray.print(ketupat);
    }
}


