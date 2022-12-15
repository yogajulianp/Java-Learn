package NumberClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class MainScanner {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat formater = new SimpleDateFormat("dd-MM-yyyy");

        System.out.println("Masukkan Nama : ");
        String nama = scanner.nextLine();

        System.out.println("Masukkan tanggal Lahir");
        String tglLahir = scanner.nextLine();
        Date tglLahirDate = formater.parse(tglLahir);
        System.out.println("tgl Lahir : " + tglLahirDate);

        Date currentDate = new Date();
        String tglSekarang = formater.format(currentDate);
        System.out.println("tgl Sekarang Date: " + currentDate);
        System.out.println("tgl Sekarang : " + tglSekarang);


        //hitung umur
        Calendar calendar = Calendar.getInstance();
        // tgl date menjadi calender
        calendar.setTime(tglLahirDate);
        System.out.println("calender tgl lahir" + calendar.getTime());
        Calendar currentCalender = Calendar.getInstance();
        currentCalender.setTime(new Date());
        // cek calender sekarang
        System.out.println("tgl sekarang :" + currentCalender.getTime());

        // ambil selisih
        //cari detik
        Long time = (currentCalender.getTimeInMillis() - calendar.getTimeInMillis())/1000;
        System.out.println("bentuk Second " + time + " detik");

        //hour
        Long hour = time/3600;
        System.out.println("bentuk hour " + hour + " jam");

        //day
        Long day = hour/24;
        System.out.println("bentuk day: " + day+ " hari");

        //weeks
        Long week = day/7;
        System.out.println("bentuk weeks: " + week+ " pekan");

        //Month
        Long month = day/30;
        System.out.println("format month: "+ month + " bulan");

        //years
        Long years = month/12;
        System.out.println("bentuk years : "+ years + " tahun");

        Long sisaBulan = month - years*12;

        System.out.println("usia : " + years + " tahun, " + sisaBulan + " bulan");



//        int tahunSekarang = calendar.get(Calendar.YEAR)
//        int umur = Integer.parseInt(Waktusekarang) - WaktuLahir;

    }
}
