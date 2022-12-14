package polymorphism;

public class Manager extends Employee{
    Manager(String name){
        super(name);
    }
    void sayHello() {
        System.out.println("Hallo Manager "+ this.name);
    }
}
