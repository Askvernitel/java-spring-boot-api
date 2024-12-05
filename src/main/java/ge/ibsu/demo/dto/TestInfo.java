package ge.ibsu.demo.dto;

public class TestInfo {
    private String firstName;
    private String lastName;

    private String address;
    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
