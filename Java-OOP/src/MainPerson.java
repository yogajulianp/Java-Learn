public class MainPerson {
    public static void main(String[] args) {

        // class - object - instance - constructore
        Person person1 = new Person();
        person1.id = 1;
        person1.name = "Tiyo";
        person1.address = "Jawa Barat";
        person1.gender = "pria";
        person1.age = 15;
        person1.sayHello();

        Person person2 = new Person();
        person2.id = 2;
        person2.name = "Prasutiyo";
        person2.address = "Indonesia";
        person2.gender = "pria";
        person2.age = 10;
        person2.sayHello();

        Person person3 = new Person();
        person3.id = 3;
        person3.name = "Budi";
        person3.address = "Depok";
        person3.gender = "laki-laki";
        person3.age = 45;
        person3.sayHello();

    }
}
