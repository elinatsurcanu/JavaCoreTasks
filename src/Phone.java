import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;

public class Phone {

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
    String phone;
    int sum;

    static String inString()
    {
        BufferedReader box = new BufferedReader(new InputStreamReader(System.in));
        String str = " ";
        try {
            str = box.readLine();
        } catch (Exception e) {
        }
        return str;
    }

    static  int inInt()
    {
        return (Integer.valueOf(inString())).intValue();
    }

    void inputPhone()
    {
        int counter = 0;
        boolean flag = false;
        do{
            flag = false;
            try{
                try{
                    System.out.print("Enter your phone number: ");
                    System.out.print(" Time: ");
                    LocalDateTime now = LocalDateTime.now();
                    System.out.println(dtf.format(now));
                    phone = inString();
                    String str = ("^(\\+([3][7][3])[ ]\\d{2}[ ]\\d{6})"); //+373 60 066006
                    String str2 = ("^(\\+(\\([3][7][3]\\))[-]\\d{2}[-]\\d{2}[-]\\d{2}[-]\\d{2})"); //+(373)-79-85-85-85
                    String str3 = ("^(\\+([3][7][3])[ ]\\d{2}[ ]\\d{3}[-]\\d{3})"); //+373 79 666-999
                    if (!(Pattern.compile(str).matcher(phone).matches() ||
                            Pattern.compile(str2).matcher(phone).matches() ||
                            Pattern.compile(str3).matcher(phone).matches()))
                        throw new PhoneException(phone);
                }
                catch(ArrayIndexOutOfBoundsException e)
                { throw new PhoneException(e); }}
            catch(PhoneException e)
            { flag = true; e.handle(); counter++; }
        } while(flag && counter<3);

        if(counter>=3) {System.out.print("Unsuccesfully"); System.out.print(" Time: ");
            LocalDateTime now = LocalDateTime.now();
            System.out.println(dtf.format(now));
            System.exit(0);}

    }


    void inputSum()
    {
        int counter = 0;
        boolean flag = false;
        do{
            flag = false;
            try{
                try{
                    System.out.print("Enter value to top up the phone: ");
                    System.out.print(" Time: ");
                    LocalDateTime now = LocalDateTime.now();
                    System.out.println(dtf.format(now));
                    sum = inInt();
                    if (sum < 10 || sum > 500)
                        throw new PhoneException(sum);
                }

                catch(NumberFormatException e)
                { throw new PhoneException(e); }
                catch(NegativeArraySizeException e)
                { throw new PhoneException(e); }
                catch(ArrayIndexOutOfBoundsException e)
                { throw new PhoneException(e); }}
            catch(PhoneException e)
            { flag = true; e.handle(); counter++; }
        } while(flag && counter<3);

        if(counter>=3) {System.out.print("Unsuccesfully"); System.out.print(" Time: ");
            LocalDateTime now = LocalDateTime.now();
            System.out.println(dtf.format(now));
            System.exit(0);}

    }

    void  inputInfo() {
        inputSum();
        inputPhone();
    }


    void print(){
        System.out.print("Your phone number is " + phone); System.out.print(" Time: ");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
        System.out.print("You would like to charhe it with " + sum + " MDL"); System.out.print(" Time: ");
        LocalDateTime now2 = LocalDateTime.now();
        System.out.println(dtf.format(now));
    }
}
