public class Actor {

    private String firstName;
    private String lastName;

    public Actor() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return getFirstName() + ' ' + getLastName();
    }
}
