import java.util.Arrays;

public class Logic1 {
    public static void main(String[] args) {
    soal1(9);
    soal2(9);
    soal3(9);
    soal4(9);
    soal5(9);
    soal7(9);
    soal8(9);
    soal9(9);
    soal10(10);
    }

    public static void soal1(int n) {
        int[] items = new int[n];

        for (int i = 0; i < items.length; i++){
            items[i]= i+1;
        }
        System.out.println("result soal1 : " + Arrays.toString(items));

        //repeat ke 2
        int[] items2 = new int[n];
        for(int j = 0; j < items2.length; j++) {
            items2[j] = j+1;
        }
        String output2 = Arrays.toString(items2);
        System.out.println(output2);

        //repeat ke 3
        int[] items3 = new int[n];
        for(int k = 0; k < items3.length; k++) {
            items3[k] = k+1;
        }
        String output3 = Arrays.toString(items3);
        System.out.println(output3);

        //repeat ke 4
        int[] items4 = new int[n];
        for(int l = 0; l < items4.length; l++){
            items4[l] = l + 1;
        }
        System.out.println(Arrays.toString(items4));

        //repeat ke 5
        int[] items5 = new int[n];
        for(int m = 0; m < items5.length; m++){
            items5[m] = m + 1;
        }
        System.out.println(Arrays.toString(items5));
    }

    public static void soal2(int n) {
        //indeks 0 1 2 3 4 5 6 7 8
        //       1 3 2 6 3 9 4 12 5
        int[] elements = new int[n];
        for (int i = 0; i < elements.length; i++ ){
            if (i == 0) {
                elements[i]=1;
            } else if (i == 1) {
                elements[i] = 3;
            } else {
                 if (i % 2 == 1) {
                    elements[i] = elements[i-2] + 3;
                } else {
                    elements[i] = elements[i-2] + 1;
                }
            }

        }
        System.out.println("Hasil Soal2 : " + Arrays.toString(elements));

        //repeat ke 2 soal2
        int[] ele2 = new int[n];
        for (int j = 0; j< ele2.length; j++){
            if(j == 0) {
                ele2[j] = 1;
            } else if (j == 1) {
                ele2[j] = 3;
            } else {
                if (j % 2 == 1) {
                    ele2[j]= ele2[j-2] + 3;
                } else {
                    ele2[j]= ele2[j-2] + 1;
                }
            }
        }
        System.out.println(Arrays.toString(ele2));

        //repeat ke 3 soal2
        int[] ele3 = new int[n];
        for (int k = 0; k< ele3.length; k++){
            if(k == 0) {
                ele3[k] = 1;
            } else if (k == 1) {
                ele3[k] = 3;
            } else {
                if (k % 2 == 1) {
                    ele3[k]= ele3[k-2] + 3;
                } else {
                    ele3[k]= ele3[k-2] + 1;
                }
            }
        }
        System.out.println(Arrays.toString(ele3));

        //repeat ke 4 soal2
        int[] ele4 = new int[n];
        for (int l = 0; l< ele4.length; l++){
            if(l == 0) {
                ele4[l] = 1;
            } else if (l == 1) {
                ele4[l] = 3;
            } else {
                if (l % 2 == 1) {
                    ele4[l]= ele4[l-2] + 3;
                } else {
                    ele4[l]= ele4[l-2] + 1;
                }
            }
        }
        System.out.println(Arrays.toString(ele4));

        //repeat ke 5 soal2
        int[] ele5 = new int[n];
        for (int m = 0; m< ele5.length; m++){
            if(m == 0) {
                ele5[m] = 1;
            } else if (m == 1) {
                ele5[m] = 3;
            } else {
                if (m % 2 == 1) {
                    ele5[m]= ele5[m-2] + 3;
                } else {
                    ele5[m]= ele5[m-2] + 1;
                }
            }
        }
        System.out.println(Arrays.toString(ele5));
    }

    public static void soal3(int n) {
        //indeks 0 1 2 3 4  5  6  7  8
        //       0 2 4 6 8 10 12 14 16
        int[] genap = new int[n];
        for (int i = 0; i < genap.length; i++){
            genap[i]= i*2;
        }
        System.out.println("Hasil soal3 : "+ Arrays.toString(genap));

        //repeat ke 2 soal3
        int[] genap2 = new int[n];
        for (int j = 0; j < genap2.length; j++){
            genap2[j]= j*2;
        }
        System.out.println(Arrays.toString(genap2));

        //repeat ke 3 soal3
        int[] genap3 = new int[n];
        for (int k = 0; k < genap3.length; k++){
            genap3[k]= k*2;
        }
        System.out.println(Arrays.toString(genap3));

        //repeat ke 4 soal3
        int[] genap4 = new int[n];
        for (int l = 0; l < genap4.length; l++){
            genap4[l]= l*2;
        }
        System.out.println(Arrays.toString(genap4));

        //repeat ke 5 soal3
        int[] genap5 = new int[n];
        for (int m = 0; m < genap5.length; m++){
            genap5[m]= m*2;
        }
        System.out.println(Arrays.toString(genap5));
    }

    public static void soal4(int n) {
        //indeks 0 1 2 3 4  5  6  7  8
        //       1 1 2 3 5  8 13  21 34
        int[] fibo = new int[n];
        for(int i=0; i < fibo.length; i++){
            if (i < 2) {
                fibo[i]= 1;
            } else {
                fibo[i]= fibo[i-2] + fibo[i-1];
            }
        }
        System.out.println("Hasil soal 4: "+ Arrays.toString(fibo));

        //repeat ke 2 soal4
        int[] fibo2 = new int[n];
        for(int j=0; j < fibo2.length; j++){
            if (j < 2) {
                fibo2[j]= 1;
            } else {
                fibo2[j]= fibo2[j-2] + fibo2[j-1];
            }
        }
        System.out.println("Hasil soal 4: "+ Arrays.toString(fibo2));

        //repeat ke 3 soal4
        int[] fibo3 = new int[n];
        for(int k=0; k < fibo3.length; k++){
            if (k < 2) {
                fibo3[k]= 1;
            } else {
                fibo3[k]= fibo3[k-2] + fibo3[k-1];
            }
        }
        System.out.println("Hasil soal 4: "+ Arrays.toString(fibo3));

        //repeat ke 4 soal4
        int[] fibo4 = new int[n];
        for(int l=0; l < fibo4.length; l++){
            if (l < 2) {
                fibo4[l]= 1;
            } else {
                fibo4[l]= fibo4[l-2] + fibo4[l-1];
            }
        }
        System.out.println("Hasil soal 4: "+ Arrays.toString(fibo4));

        //repeat ke 5 soal4
        int[] fibo5 = new int[n];
        for(int m=0; m < fibo5.length; m++){
            if (m < 2) {
                fibo5[m]= 1;
            } else {
                fibo5[m]= fibo5[m-2] + fibo5[m-1];
            }
        }
        System.out.println("Hasil soal 4: "+ Arrays.toString(fibo5));
    }

    public static void soal5(int n) {
        //indeks 0 1 2 3 4 5  6  7  8
        //       1 1 1 3 5 9 17 31 57
        int[] tribo = new int[n];
        for (int i = 0; i < tribo.length; i++) {
            if (i < 3){
             tribo[i]=1;
            } else {
              tribo[i]=tribo[i-3]+tribo[i-2]+tribo[i-1];
            }
         }
        System.out.println("Hasil soal no 5 : " + Arrays.toString(tribo));
}

    public static void soal6(int n) {
        //indeks 0 1 2 3 4 5 6 7 8
        //       2 3 5 7 11 13 17 19 23
        int[] prima = new int[n];
        for (int i = 0; i< prima.length; i++) {
            if (i == 0) {
                prima[i]= 2;
            } else {

            }
        }
    }

    public static void soal7(int n) {
        String[] alfabet = new String[n];
        char karakter = 'A';
        for (int i = 0 ; i< alfabet.length; i++) {
            alfabet[i] = String.valueOf(karakter);
            karakter++;
        }
        System.out.println("Hasil no 7: " + Arrays.toString(alfabet));
    }

    public static void soal8(int n) {
        String[] tampung = new String[n];
        char huruf = 'A';
        int angka = 2;
        //isi array
        for (int i = 0; i < n; i++ ){
            // genap dulu
            if(i % 2 == 0) {
                tampung[i] = String.valueOf(huruf);
            } else {
                tampung[i] = String.valueOf(angka);
                angka += 2;
            }
            huruf++;
        }
        System.out.println("Hasil soal no 8 : "+ Arrays.toString(tampung));

        //repitasi ke 2 soal 8
        String[] tampung2 = new String[n];
        char huruf2 = 'A';
        int number = 2;
        for (int j = 0; j < tampung2.length; j++) {
            if (j % 2 == 0) {
                tampung2[j] = String.valueOf(huruf2);
            } else {
                tampung2[j] = String.valueOf(number);
                number += 2;
            }
            huruf2++;
        }
        System.out.println("Hasil soal no 8 : "+ Arrays.toString(tampung2));
    }

    public static void soal9(int n) {
        int[] pangkat = new int[n];
        for (int i = 0; i < pangkat.length; i++){
            pangkat[i]= (int) Math.pow(3,i);
        }
        System.out.println("Hasil soal9 : "+ Arrays.toString(pangkat));
    }

    public static void soal10(int n) {
        //indeks 0 1 2  3  4  5   6   7   8
        //       0 1 8 27 64 125 216 343 512
        int[] power = new int[n];
        for (int i = 0; i < power.length; i++){
            power[i]= (int) Math.pow(i,3);
        }
        System.out.println("Hasil soal10 : "+ Arrays.toString(power));
    }
}