
class Account {
    private int balance;

    public Account() {
        balance = 0;
    }

    public Account(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds");
        } else {
            balance -= amount;
        }
    }
    public void display(){
        System.out.println("Your balance is " + balance);
    }
}

public class Task2 {
    public static void main(String[] args) {
        Account acc1 = new Account();
        acc1.setBalance(1000);
        Account acc2 = new Account(acc1.getBalance());
        acc2.display();

    }
}
