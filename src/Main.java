import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {



    public static void main(String[] args) {
       /* ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Andrew", "Grant", 22));
        students.add(new Student("Ilia", "Peters", 22));
        students.add(new Student("Victor", "Martin", 22));
        students.add(new Student("Ana", "Davis", 22));


        ArrayList<DataStructure> d = new ArrayList<DataStructure>();
        d.add(new DataStructure("05/06/2022", students.get(1)));

        String strDate = "Sat, April 4, 2020";
        SimpleDateFormat formatter = new SimpleDateFormat("EEE, MMMM d, yyyy", Locale.ENGLISH);
        try {
            Date date = formatter.parse(strDate);
            System.out.println(date);
        }
        catch (ParseException e) {
            e.printStackTrace();
        }*/

        //DataStructure dataStructure = new DataStructure("2017", new Student());



        List<Student> students = new ArrayList<>();
        students.add(new Student());
        students.add(new Student("Tom", "Green", 21, 2019));
        students.add(new Student("Bob", "Potter", 20, 2018));

        for (Student student: students) {
            student.print();
            student.readyForErasmus(student.registrationDate);
        }

    }

}
