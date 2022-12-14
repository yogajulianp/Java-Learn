package Logic.logic01;

import Logic.BasicLogika;

public class Logic01Soal08 extends BasicLogika {
    public Logic01Soal08(int n) {
        super(n);
    }

    public void isiArray(){
        char huruf = 'A';
        int angka = 2;
        //isi array
        for (int i = 0; i < this.n; i++ ){
            // genap dulu
            if(i % 2 == 0) {
                this.array[0][i] = String.valueOf(huruf);
            } else {
                this.array[0][i] = String.valueOf(angka);
                angka += 2;
            }
            huruf++;
        }
    }

    public void cetakArray() {
        System.out.println("hasil logic 01-soal 08 :");
        this.isiArray();
        this.printSingle();
    }
}
