package Tutorial.Stage_17;

public class DataSingleton {
    private static final DataSingleton instance = new DataSingleton();

    private String userName;
    private String firstName;
    private String lastName;

    private DataSingleton(){}

    public static DataSingleton getInstance(){
        return instance;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
}
