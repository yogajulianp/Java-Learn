public class MainString {
    public static void main(String[] args) {
        String name = "Yoga Prasutiyo";
        System.out.println("Length : "+ name.length());

        String[] names = name.split(" ");
        System.out.println("Jumlah kata "+ names.length);
        System.out.println("index kata ke 0 : " + names[0]);
        System.out.println("index kata ke 1 : " + names[1]);
    }

    public static void sample01() {

    }
}