package polymorphism;

public class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }

    void sayHello() {
        System.out.println("Hallo employee "+ this.name);
    }
}
