import java.util.Arrays;

public class Logic1 {
    public static void main(String[] args) {
    soal1(9);
    soal2(9);
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

    }

//    public static void soal00(int n) {
//        //imuttable
//        int[] deret = new int[n];
//        // 1 1 2 3 5 8 13 21
//        // 0 1 2 3 4 5  6  7
//        for (int i = 0; i < deret.length; i++) {
//
//            if (i == 0 || i == 1) {
//                deret[i] = 1;
//            } else {
//                deret[i] = deret[i - 1]+ deret[i - 2];
//            }
//        }
//        System.out.println("Hasil deret "+ Arrays.toString(deret));
//
//    }
}
