package Logic.logic01;

import Logic.BasicLogika;

public class Logic01Soal07 extends BasicLogika {
    public Logic01Soal07(int n) {
        super(n);
    }

    public void isiArray() {
        char karakter = 'A';
        for (int i = 0 ; i< this.n; i++) {
            this.array[0][i] = String.valueOf(karakter);
            karakter++;
        }
    }

    public void cetakArray() {
        System.out.println("hasil logic 01-soal 07 :");
        this.isiArray();
        this.printSingle();
    }
}
