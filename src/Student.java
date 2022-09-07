import java.util.ArrayList;
import java.util.List;

public class Student {

    String firstName;
    String lastName;
    int age;
    boolean eligibleForErasmusScolarship;
    int registrationDate;
    List<String> universities = new ArrayList<>();

    Student()
    {
        firstName = "Alex";
        lastName = "White";
        age = 20;
        registrationDate = 2018;
    }

    Student(String firstName, String lastName, int age, int registrationDate)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.registrationDate = registrationDate;
    }

    public  void print() {
        System.out.println(firstName + " " + lastName + ", " + age + " years, " +  registrationDate);
    }

    public void readyForErasmus(int date)
    {
        boolean ready = false;
        if(date <= 2018) {
            ready = true;
            System.out.println("Student is ready for Erasmus scholarship");
        }
        else System.out.println("Student is NOT ready for Erasmus scholarship");

    }
}
