public class Student {
    private String firstName;
    private String  lastName;
    private int conjure;
    private int transgress;

    public Student(String firstName, String lastName, int conjure, int transgress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.conjure = conjure;
        this.transgress = transgress;
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

    public int getConjure() {
        return conjure;
    }

    public void setConjure(int conjure) {
        this.conjure = conjure;
    }

    public int getTransgress() {
        return transgress;
    }

    public void setTransgress(int transgress) {
        this.transgress = transgress;
    }

    @Override
    public String toString() {
        return "Students{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", conjure=" + conjure +
                ", transgress=" + transgress +
                '}';
    }
}
