package Logic.logic01;

import Logic.BasicLogika;

public class Logic01Soal10 extends BasicLogika {
    public Logic01Soal10(int n) {
        super(n);
    }

    public void isiArray(){
        for (int i = 0; i < this.n; i++){
            this.array[0][i]= String.valueOf((int) Math.pow(i,3));
        }
    }

    public void cetakArray() {
        System.out.println("hasil logic 01-soal 10 :");
        this.isiArray();
        this.printSingle();
    }
}
