package Logic.logic02;

import Logic.BasicLogika;

public class Logic02Soal01 extends BasicLogika {
    public Logic02Soal01(int n) {
        super(n);
    }

    public void isiArray(){
        for (int i = 0 ; i < this.n; i++){
            int angka = 1;
            //kolom
            for(int j = 0; j < this.n; j++) {
                if(i==j || i+j == this.n-1 ){
                    this.array[i][j] = String.valueOf(angka);
                }
                angka++;
            }
        }
    }

    public void cetakArray() {
        System.out.println("hasil logic 02-soal 01 :");
        this.isiArray();
        this.print();
    }
}
