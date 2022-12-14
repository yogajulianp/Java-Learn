public class Product {
    private int id;
    private String name;
    private double price;

    public Product() {
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void showPrice() {
        System.out.println("ProductId: "+id+ ", Name: "+name+ ", Price: "+ price);
    }

    public void showName(String name) {
        System.out.println("dari ShowName = Product Id: "+ id + ", name "+ this.name);
    }
}
