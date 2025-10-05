class SavingsAccount {
    private static double annualInterestRate = 0.0;
    private double savingsBalance;

    public SavingsAccount(){
        savingsBalance = 0.0;
    }

    public SavingsAccount(double balance){
        savingsBalance = balance;
    }

    public void setBalance(double balance){
        savingsBalance = balance;
    }

    public void calculateMonthlyInterest() {
        double monthlyInterest = 0.0;
        monthlyInterest = savingsBalance *  (annualInterestRate/100) / 12;
        savingsBalance += monthlyInterest;
    }

    public static void modifyInterestRate(double rate){
        annualInterestRate = rate;
    }

    public void printBalance(){
        System.out.println("Your Balance is: " + savingsBalance + "$");
    }
    
    public static void setAnnualInterestRate(double rate){
        annualInterestRate = rate;
    }

}

public class Bank {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000.0);
        SavingsAccount saver2 = new SavingsAccount(3000.0);
        SavingsAccount.setAnnualInterestRate(3.0);
        saver1.calculateMonthlyInterest();
        saver1.printBalance();
        saver2.calculateMonthlyInterest();
        saver2.printBalance();
        SavingsAccount.setAnnualInterestRate(4.0);
        saver1.calculateMonthlyInterest();
        saver1.printBalance();
        saver2.calculateMonthlyInterest();
        saver2.printBalance();

    }
}
