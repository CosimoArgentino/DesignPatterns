package creational.builderpattern;

public class StudentTest {
    public static void main(String[] args){
        Student student = new StudentBuilder()
                                    .setFirstName("Cosimo")
                                    .setLastName("Argentino")
                                    .build();

        System.out.println(student.getFirstName() + " " + student.getLastName());
    }
}
