import java.util.ArrayList;

public class Main {

    public enum gradingSystem{
        Excellent,
        VeryGood,
        Good,
        Accepted,
        Failure;
        private static gradingSystem[] vals = values();
        public gradingSystem next()
        {
            return vals[(this.ordinal() + 1) % vals.length];
        }

        public gradingSystem previous()
        {
            return vals[(this.ordinal() - 1) % vals.length];
        }

    }

    public static void main(String[] args) {
        System.out.println(gradingSystem.Good.next());
        System.out.println(gradingSystem.Good.previous());
        System.out.println(java.util.Arrays.asList(gradingSystem.values()));
    }
}
