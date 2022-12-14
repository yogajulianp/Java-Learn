package Logic.logic01;

import Logic.BasicLogika;

public class Logic01Soal05 extends BasicLogika {
    public Logic01Soal05(int n) {
        super(n);
    }

    public void isiArray(){
        for (int i = 0; i < this.n; i++) {
            if (i < 3){
                this.array[0][i]=String.valueOf(1);
            } else {
                this.array[0][i]= String.valueOf(Integer.parseInt(this.array[0][i-3]) +
                                  Integer.parseInt(this.array[0][i-2]) + Integer.parseInt(this.array[0][i-1]));
            }
        }
    }

    public void cetakArray() {
        System.out.println("hasil logic 01-soal 05 :");
        this.isiArray();
        this.printSingle();
    }
}
