import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.regex.Pattern;

public class PhoneException extends Exception{

    String phoneException = "+373 79 666-999";
    int sumException = 50;
    Object standartException = null;


    PhoneException(int x) {sumException = x;}
    PhoneException(String x) {phoneException = x;}
    PhoneException(Object x) {standartException = x;}
    void handle()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        if(sumException < 10 || sumException > 500) {System.out.print("Enter a valid sum (between 10 and 500)!");
            System.out.print(" Time: ");
            LocalDateTime now = LocalDateTime.now();
            System.out.println(dtf.format(now));}
        String str = ("^(\\+([3][7][3])[ ]\\d{2}[ ]\\d{6})"); //+373 60 066006
        String str2 = ("^(\\+(\\([3][7][3]\\))[-]\\d{2}[-]\\d{2}[-]\\d{2}[-]\\d{2})"); //+(373)-79-85-85-85
        String str3 = ("^(\\+([3][7][3])[ ]\\d{2}[ ]\\d{3}[-]\\d{3})"); //+373 79 666-999
        if (!(Pattern.compile(str).matcher(phoneException).matches() ||
                Pattern.compile(str2).matcher(phoneException).matches() ||
                Pattern.compile(str3).matcher(phoneException).matches()))
        {
            System.out.print("Enter a valid phone number. Examples: +373 60 066006, +(373)-79-85-85-85, +373 79 666-999");
            System.out.print(" Time: ");
            LocalDateTime now = LocalDateTime.now();
            System.out.println(dtf.format(now));
        }
        if (standartException instanceof IOException)
        {
            System.out.println("Error");
        }
        if (standartException instanceof NumberFormatException)
        { System.out.println("Error");
        }
        if (standartException instanceof NegativeArraySizeException)
        { System.out.println("Error");
        }
        if (standartException instanceof ArrayIndexOutOfBoundsException)
        { System.out.println("Error");
        }
    }
}
