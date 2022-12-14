public class MainProduct {
    public static void main(String[] args) {
        Product product1 = new Product("Nasil Goreng", 23000);
        product1.showPrice();

        Product product2 = new Product(2,"Nasi Ayam",19000);
        product2.showPrice();

        Product product3 = new Product(3,"Nasi Rendang", 25000);
        product3.showPrice();
        product3.showName("Gule");

        Product product4 = new Product();
        product4.showPrice();
    }
}
