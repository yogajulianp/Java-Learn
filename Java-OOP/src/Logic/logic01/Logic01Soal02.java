package Logic.logic01;

import Logic.BasicLogika;

public class Logic01Soal02 extends BasicLogika {
    public Logic01Soal02(int n) {
        super(n);
    }

    public void isiArray(){
        int angka = 1;

        for (int i = 0; i < this.n; i++ ){
            if (i == 0) {
                this.array[0][i]= String.valueOf(1);
            } else if (i == 1) {
                this.array[0][i] = String.valueOf(3);
            } else {
                if (i % 2 == 1) {
                    this.array[0][i] = String.valueOf(Integer.parseInt(this.array[0][i-2]) + 3);
                } else {
                    this.array[0][i] = String.valueOf(Integer.parseInt(this.array[0][i-2]) + 1);
                }
            }

        }
    }

    public void cetakArray() {
        System.out.println("hasil logic 01-soal 02 :");
        this.isiArray();
        this.printSingle();
    }
}
