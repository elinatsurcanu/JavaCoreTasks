import java.util.ArrayList;

public class Main {

    public static void concatenateValues(Object array[])
    {
        String str = "";
        int sum = 0;
        ArrayList<Person> people = new ArrayList<Person>();
        for(int i = 0; i < array.length; i++)

        {
            if(array[i] instanceof String || array[i] instanceof Character) str += array[i] + " ";
            if(array[i] instanceof Integer) sum += (int) array[i];
            if(array[i] instanceof Person)
            {
                people.add((Person) array[i]);
            }
        }
        System.out.println("Concatenation of all strings and characters: " + str);
        System.out.println("Sum of all numbers: " + sum);
        System.out.println("Array with people only:");
        for(Person p: people)
            p.print();
    }

    public static void main(String[] args) {
        Object[] array = new Object[]{"Today", new Person(), 334, "is", 23, 652, 'a', new Person("Ann", "Jenner", 22, 'F'), "big", "day"};
        concatenateValues(array);
    }
}
