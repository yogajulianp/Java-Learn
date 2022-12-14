public class Teacher extends Person{
    public String bidang;
    public Integer NUPTK;

    public Teacher(Integer id, String name, String gender, String address, int age, String bidang, Integer NUPTK) {
        super(id, name, gender, address, age);
        this.bidang = bidang;
        this.NUPTK = NUPTK;

    }
}
