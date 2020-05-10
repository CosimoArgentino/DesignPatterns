package creational.builderpattern;

public class StudentBuilder {

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public StudentBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public StudentBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Student build(){
        Student student = new Student();
        student.setFirstName(this.firstName);
        student.setLastName(this.lastName);
        return student;
    }
}
