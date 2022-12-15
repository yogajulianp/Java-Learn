package genericType;

public class MainDataGeneric {
    public static void main(String[] args) {
        DataGeneric<String> data1 = new DataGeneric<String>();
        data1.setData("Yoga Prasutiyo");
        System.out.println("detai1 Value "+ data1.getData());

        //data1.setData(1233) ; ==> error

        DataGeneric<Integer> data2 = new DataGeneric<Integer>();
        data2.setData(12345);
        System.out.println("data2-int value "+ data2.getData());

        DataGeneric<Boolean> data3 = new DataGeneric<Boolean>();
        data3.setData(true);
        System.out.println("deta3 Value "+ data3.getData());

        DataGeneric<Product> data4 = new DataGeneric<Product>();
        //        data4.setData(new Product("Masako", 2500.00));
        Product product = new Product("shampoo Body Motor", 15000.0);
        data4.setData(product);
        System.out.println("deta4 Value "+ data4.getData());

        DataGeneric<Animal> data5 = new DataGeneric<Animal>();
        Animal animal = new Animal("kucing", 4);
        data5.setData(animal);
        System.out.println("deta5 Value "+ data5.getData());

        DataGeneric<Car> data6 = new DataGeneric<Car>();
        Car car = new Car("CRV", 4505000.0, 2000);
        data6.setData(car);
        System.out.println("deta6 Value "+ data6.getData());

        DataGeneric<Person> data7 = new DataGeneric<Person>();
        Person person = new Person("Yjp", "Jawa Barat", 20  );
        data7.setData(person);
        System.out.println("deta7 Value "+ data7.getData());
    }
}
