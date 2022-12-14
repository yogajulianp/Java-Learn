package polymorphism;

public class VicePresident extends Manager{
    VicePresident(String name){
        super(name);
    }
    void sayHello() {
        System.out.println("Hallo VicePresident "+ this.name);
    }

}
