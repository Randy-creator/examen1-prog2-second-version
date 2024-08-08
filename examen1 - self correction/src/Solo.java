import java.time.LocalDate;

public class Solo extends Artist{
    private String firstName;
    private String lastName;
    private LocalDate birthdate;

    public Solo(String id, String artistName, String nationality, int beginYear, String firstName, String lastName, LocalDate birthdate) {
        super(id, artistName, nationality, beginYear);
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }
}
