package NumberClass;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MainScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan Nama : ");
        String nama = scanner.nextLine();
        System.out.println("Masukkan tanggal Lahir");
        String tglLahir = scanner.nextLine();

        Date currentDate = new Date();
        System.out.println(currentDate);

        SimpleDateFormat formater = new SimpleDateFormat("dd-MM-yyyy");
        String tglSekarang = formater.format(currentDate);
        System.out.println("tgl Sekarang " + tglSekarang);

    }
}
