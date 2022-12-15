package variableHidding;

public class MainHidding {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.name = "Graha";
        parent.toDoIt();
        System.out.println("Parent Name "+ parent.name);

        System.out.println();
        System.out.println("Child....");
        Child child = new Child();
        child.name = "Tajim";
        child.toDoIt();
        System.out.println("Child Name "+ child.name);

        System.out.println("\nChild Cast...");
        Parent parent2 = (Parent) child;
        parent2.toDoIt();
        System.out.println("Parent2 Name "+ parent2.name);
    }
}
