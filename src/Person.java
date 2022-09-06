public class Person {

    String firstName;
    String lastName;
    int age;
    char gender;
    Person()
    {
        firstName = "Alex";
        lastName = "Green";
        age = 25;
        gender = 'M';
    }
    Person(String firstName, String lastName, int age, char gender)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public void print() {
        System.out.println(firstName + " " + lastName + ", " + age + " years old, " + gender);
    }
}