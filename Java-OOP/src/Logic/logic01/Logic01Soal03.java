package Logic.logic01;

import Logic.BasicLogika;

public class Logic01Soal03 extends BasicLogika {
    public Logic01Soal03(int n) {
        super(n);
    }

    public void isiArray(){
        int angka = 2;
        for (int i = 0; i < this.n; i++){
            this.array[0][i]= String.valueOf(i*angka);
        }
    }

    public void cetakArray() {
        System.out.println("hasil logic 01-soal 03 :");
        this.isiArray();
        this.printSingle();
    }
}
