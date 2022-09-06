import java.util.ArrayList;
import java.util.List;

public class Bank {

    List<SavingsAccount> savingsAccountList = new ArrayList<>();

    public  void calculateGlobalMonthlyInterest() {
        for(SavingsAccount savingsAccount: savingsAccountList) {
            System.out.println("Saving Account before the calculation: " + savingsAccount.getSavingBalance() + "$");
            savingsAccount.calculateMonthlyInterest();
            System.out.println("Saving Account  after the calculation: " + savingsAccount.getSavingBalance() + "$");
        }


    }

}
