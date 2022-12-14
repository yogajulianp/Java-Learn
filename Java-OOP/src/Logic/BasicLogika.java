package Logic;

public class BasicLogika {

//    private Object dataArray;
//
//    public BasicLogika(int n, Object dataArray) {
//        this.n = n;
//        this.dataArray = dataArray;
//    }
    public int n;
    public String[][] array;

    public BasicLogika(int n) {
        this.n = n;
        this.array = new String[n][n];
    }

    public void print(){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(this.array[i][j] != null) {
                    System.out.println(this.array[i][j] + "\t\t");
                } else {
                    System.out.println("\t\t");
                }
            }
            System.out.println("\n");
        }
    }
}
