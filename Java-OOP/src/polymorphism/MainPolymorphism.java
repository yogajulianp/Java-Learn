package polymorphism;

public class MainPolymorphism {
    public static void main(String[] args) {
        Employee employee = new Employee("Umi");
        Manager manager = new Manager("Julian");
        VicePresident vicePresident = new VicePresident("Tiyo");

        employee.sayHello();
        manager.sayHello();
        vicePresident.sayHello();
    }
}
