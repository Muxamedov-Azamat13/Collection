public class Employee_Directory {

    private int id;
    private String numberPhone;
    private String name;
    private int experience;

    public Employee_Directory(int id, String numberPhone, String name, int experience) {
        this.id = id;
        this.numberPhone = numberPhone;
        this.name = name;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Employee_Directory{" +
                "id=" + id +
                ", numberPhone='" + numberPhone + '\'' +
                ", name='" + name + '\'' +
                ", experience=" + experience +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }
}
