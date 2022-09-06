public class SavingsAccount {

    int id;
    static double annualInterestRate;
    static double yearInterestRate;
    private double SavingBalance;



    public SavingsAccount(double savingBalance) {
        SavingBalance = savingBalance;
    }

    public double getSavingBalance() {
        return SavingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        SavingBalance = savingBalance;
    }


    public void calculateMonthlyInterest() {
        double benefit;
        benefit = (SavingBalance* annualInterestRate)/12;
        SavingBalance+=benefit;
    }

    private void modifyInterestRate(double newAnnualInterestRate) {
        annualInterestRate = newAnnualInterestRate;
    }

    public static void transferFunds(SavingsAccount saverAccount1, SavingsAccount saverAccount2, double sum) {
        saverAccount1.SavingBalance -= sum;
        saverAccount2.SavingBalance +=sum;
    }
}
