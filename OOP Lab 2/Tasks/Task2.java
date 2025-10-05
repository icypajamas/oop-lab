
class Account {
    private double balance;

    public Account() {
        balance = 0.0;
    }

    public Account(double balance) {
        if(balance < 0){
            System.out.println("Balance cannot be negative");
            System.out.println("Default balance set to 0$");
        }else{
            this.balance = balance;
        }
        
    }

    void setBalance(double balance){
        if(balance < 0){
            System.out.println("Balance cannot be negative");
        }else{
            this.balance = balance;
        }
    }

    double getBalance(){
        return this.balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid Amount");
        } else {
            this.balance += amount;
            System.out.println("Deposit of " + amount + "$ successful");
            System.out.println("Your new balance is " + this.balance + "$");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid Amount");
        } else if (this.balance < amount) {
            System.out.println("You do not have sufficient funds");

        } else {
            this.balance -= amount;
            System.out.println("Withdrawal of " + amount + "$ successful");
            System.out.println("Your new balance is " + this.balance + "$");
        }

    }

}

public class Task2 {
    public static void main(String[] args) {
        Account acc = new Account(90);
        acc.deposit(100);
        acc.withdraw(80);
    }
}
