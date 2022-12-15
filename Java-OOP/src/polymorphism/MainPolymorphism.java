package polymorphism;

public class MainPolymorphism {
    public static void main(String[] args) {
        Employee employee = new Employee("Umi");
        Manager manager = new Manager("Julian");
        VicePresident vicePresident = new VicePresident("Tiyo");

//        employee.sayHello();
//        manager.sayHello();
//        vicePresident.sayHello();

        sayHello(vicePresident);
        sayHello(manager);
        sayHello(employee);

        static void sayHello(Employee employee) {
            if (employee instanceof VicePresident) {
                VicePresident vicePresident = (VicePresident) employee;
                System.out.println("Haloo VP "+ vicePresident.name);
            } else if (employee instanceof Manager) {
                Manager manager = (Manager) employee;
                System.out.println("Hallo Manager " + manager.name);
            } else {
                System.out.println("Hallo Employee " + employee.name);
            }
        }
    }
}
