class Account{
    private double balance;

    public Account(double balance){
        this.balance = balance;
    }

    double calculateInterest(){
        return 0;
    }

    double getBalance(){
        return balance;
    }
}

class SavingsAccount extends Account{

    public SavingsAccount(double balance){
        super(balance);
    }

    @Override
    double calculateInterest() {
        return getBalance() * 0.05;
    }
}

class FixedDepositAccount extends Account{

    public FixedDepositAccount(double balance){
        super(balance);
    }

    @Override
    double calculateInterest() {
        return getBalance() * 0.1;
    }
}

class CurrentAccount extends Account{

    public CurrentAccount(double balance){
        super(balance);
    }

    @Override
    double calculateInterest() {
        return 0;
    }
}

public class poly2 {
    public static void main(String[] args) {
        
        Account[] accounts = new Account[3];

        accounts[0] = new SavingsAccount(1000);
        accounts[1] = new FixedDepositAccount(2000);
        accounts[2] = new CurrentAccount(3000);

        for(Account acc : accounts){
            System.out.println(acc.calculateInterest());
        }
    }
}
