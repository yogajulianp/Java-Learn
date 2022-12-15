package genericType;

public class MainData {
    public static void main(String[] args) {
        Data data = new Data();
        data.setData("Prasutiyo");

        System.out.println("data Value " + data.getData());

        Data data2 = new Data();
        data2.setData(12345);
        System.out.println("data Value: " + data2.getData());

        Data data3 = new Data();
        data3.setData(12345.1234);
        System.out.println("data Value: " + data3.getData());

    }
}
