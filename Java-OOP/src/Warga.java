public class Warga extends Person{
    public int rt;
    public String dusun;

    public Warga(Integer id,String name, String address, String gender, int age, int rt, String dusun){
        super(id, name, address, gender, age);
        this.rt = rt;
        this.dusun = dusun;
    }
}
