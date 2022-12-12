public class LogicFor {
    public static void main(String[] args) {
        soal01(7);
    }

//    public static void soal01(int n) {
//        //imuttable
//        int[] deret = new int[n];
//        // 1 1 2 3 5 8 13 21
          // 0 1 2 3 4 5  6  7
//        for (int i = 0; i < deret.length; i++) {
//
//            if (i == 0 || i == 1) {
//                deret[i] = 1;
//            } else {
//               deret[i] = deret[i - 1]+ deret[i - 2];
//            }
//        }
//       // System.out.println("Hasil deret "+ deret);
//
//    }

    public static void soal01(int n) {
        for (int i = 0 ; i <= n ; i ++ ) {
            System.out.println(fibonacci(i));
        }
    }

    static int fibonacci(int n){
        int result;
        if (n <= 2) {
            result = 1;
        } else {
            result = fibonacci(n-1) + fibonacci(n-2);
        }
        return result;
    }
}
