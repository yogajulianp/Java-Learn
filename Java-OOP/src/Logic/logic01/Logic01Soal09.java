package Logic.logic01;

import Logic.BasicLogika;

public class Logic01Soal09 extends BasicLogika {
    public Logic01Soal09(int n) {
        super(n);
    }

    public void isiArray(){
        for (int i = 0; i < this.n; i++){
            this.array[0][i]= String.valueOf((int) Math.pow(3,i));
        }
    }

    public void cetakArray() {
        System.out.println("hasil logic 01-soal 09 :");
        this.isiArray();
        this.printSingle();
    }
}
