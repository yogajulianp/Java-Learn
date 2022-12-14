package Logic.logic02;

import Logic.BasicLogika;

public class Logic02Soal09 extends BasicLogika {
    public Logic02Soal09(int n) {
        super(n);
    }

    public void isiArray(){
        int nilaiTengah = this.n/2;
        for (int i = 0; i< this.n; i++) {
            for (int j = 0 ; j < this.n ; j++){
                if (    i+j >= nilaiTengah
                        && j-i <= nilaiTengah
                        && i-j <= nilaiTengah
                        && i+j <= nilaiTengah + this.n -1 ) {
                    this.array[i][j]= String.valueOf(1);
                }
            }
        }
    }

    public void cetakArray() {
        System.out.println("hasil logic 02-soal 09 :");
        this.isiArray();
        this.print();
    }
}
