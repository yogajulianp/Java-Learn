package superKeyword;

public class Rectangle extends Shape{
    int getCorner(){
        return 4;
    }

    int getParentCorner(){
        return super.getCorner();
    }

    String getName(){
        return "Yoga Prasutiyo";
    }

    boolean isValid(){
        return false;
    }

    void sayHello(){
        System.out.println("Hallo Dunia");
    }
}
