public class Programmer extends Person{
    public String language;
    public Integer yearExperience;

    public Programmer(Integer id, String name, String gender, String address,
                      int age, String language, Integer yearExperience){
        super(id, name, gender, address, age);
        this.language = language;
        this.yearExperience = yearExperience;
    }
}
