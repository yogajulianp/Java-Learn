import java.util.Scanner;

public class IfCondition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //memanggil method
        //sampleConvert(scanner);
        //myFavoriteFood();

        System.out.println("Masukkan Angka: ");
        String input = scanner.next();
        int nilai = stringConverter(input);

        //nilai 0 - 20 => E
        //nilai 21 - 40 => D
        //nilai 41 - 60 => C
        //nilai 61 - 80 => B
        //nilai 81 - 100 => A
        if (nilai >= 0 && nilai <= 20){
            System.out.println("E");
        } else if (nilai >= 21 && nilai <= 40){
            System.out.println("D");
        } else if (nilai >= 41 && nilai <= 60){
            System.out.println("C");
         } else if (nilai >= 61 && nilai <= 80){
             System.out.println("B");
        }  else if (nilai >= 81 && nilai <= 100)  {
            System.out.println("A");
        }

    }

    public static Integer stringConverter(String input) {
        int result = 0;
        try{
            result = Integer.parseInt(input);
        }catch(Exception e) {
            System.out.println("Error " + e.getMessage());
        }
        return result;
    }

    public static void sampleConvert(Scanner scanner){
        System.out.println("Masukkan angka :  ");
        String input1 = scanner.next();
        System.out.println("Hasil Angka: "+ input1);

        System.out.println("Masukkan kata lagi :  ");
        String input2 = scanner.next();
        System.out.println("Hasil Angka: "+ input2);

        System.out.println("convert .....");
        int angka1 = 0;
        int angka2 = 0;
        try {
            angka1 = Integer.parseInt(input1);
            angka2 = Integer.parseInt(input2);
        }catch ( Exception e) {
            System.out.println("Error: "+ e.getMessage());
        }
        System.out.println("hitung...");
        int hasil = angka1 + angka2;
        System.out.println("hasil jumlah " + hasil);
    }
    public static void myFavoriteFood() {
        System.out.println("My Favorite food:");
        System.out.println("Mie Ayam");
        System.out.println("Nasi SeaFood");
        System.out.println("Semangka");
    }
}