package genericType;

public class Car {
    private String name;
    private Double price;
    private Integer tier;

    public Car(String name, Double price, Integer tier) {
        this.name = name;
        this.price = price;
        this.tier = tier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getTier() {
        return tier;
    }

    public void setTier(Integer tier) {
        this.tier = tier;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", tier=" + tier +
                '}';
    }
}
