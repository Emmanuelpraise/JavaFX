package Tutorial.TableView;

public class User {
    private String firstname;
    private String lastname;
    private String dob;
    private String email;

    public User(String firstname, String lastname, String dateOfBirth, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.dob = dateOfBirth;
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getDateOfBirth() {
        return dob;
    }

    public String getEmail() {
        return email;
    }
}
