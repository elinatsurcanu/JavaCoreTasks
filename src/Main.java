import java.util.ArrayList;

public class Main {



    public static void main(String[] args) {

        SavingsAccount savingsAccount1 = new SavingsAccount(3000);
        SavingsAccount savingsAccount2 = new SavingsAccount(5000);

        System.out.println("Saving Account #1: " + savingsAccount1.getSavingBalance() + "$");
        System.out.println("Saving Account #2: " + savingsAccount2.getSavingBalance() + "$");

        SavingsAccount.annualInterestRate = 4;

        savingsAccount1.calculateMonthlyInterest();
        savingsAccount2.calculateMonthlyInterest();
        System.out.println("New values for deposits: ");
        System.out.println("Saving Account #1: " + savingsAccount1.getSavingBalance() + "$");
        System.out.println("Saving Account #2: " + savingsAccount2.getSavingBalance() + "$");

        SavingsAccount.annualInterestRate = 5;

        savingsAccount1.calculateMonthlyInterest();
        savingsAccount2.calculateMonthlyInterest();
        System.out.println("New values for deposits: ");
        System.out.println("Saving Account #1: " + savingsAccount1.getSavingBalance() + "$");
        System.out.println("Saving Account #2: " + savingsAccount2.getSavingBalance() + "$");

        SavingsAccount.transferFunds(savingsAccount1, savingsAccount2, 700);
        System.out.println("New values for deposits: ");
        System.out.println("Saving Account #1: " + savingsAccount1.getSavingBalance() + "$");
        System.out.println("Saving Account #2: " + savingsAccount2.getSavingBalance() + "$");


        Bank bank = new Bank();
        bank.savingsAccountList.add(savingsAccount1);
        bank.savingsAccountList.add(savingsAccount2);

        bank.calculateGlobalMonthlyInterest();
    }

}
