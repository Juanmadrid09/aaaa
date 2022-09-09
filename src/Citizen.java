public class Citizen {

    private String id;
    private String name;
    private String dateOfBirth;
    private String cityOfBirth;


    public Citizen(String id, String name, String dateOfBirth, String cityOfBirth) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.cityOfBirth = cityOfBirth;
    }

    @Override
    public String toString() {
        return name+"\n"+dateOfBirth+"\n"+id+"\n"+cityOfBirth;
    }
}
