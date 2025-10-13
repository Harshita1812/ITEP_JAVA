interface LoanEligible{
    void checkLoanEligibility();
}

abstract class BankAccount{
    int accountNumber;
    double balance;

    public BankAccount(int accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    public void showBalance(){
        System.out.println("Account number "+ this.accountNumber + " has this much ammount of balance: " + this.balance);
    }
}

class SavingsAccount extends BankAccount implements LoanEligible{
    private static final double MIN_BALANCE = 1000;
    public SavingsAccount(int accountNumber, double balance){
        super(accountNumber, balance);
    }
    public void deposit(double amount){
        this.balance += amount;
    }
    public void withdraw(double amount){
        if(balance - amount < 1000){
            System.out.println("You cannot withdraw below Rs.1000");
        }
        else{
            this.balance -= amount;
        }
    }
    public void checkLoanEligibility(){
        if(this.balance > 5000){
            System.out.println("Yes, you are eligible for loan");
        }
        else{
            System.out.println("You, are not eligible for loan as your balance is " + this.balance);
        }
    }
}

class CurrentAccount extends BankAccount{

    public CurrentAccount(int accountNumber, double balance){
        super(accountNumber, balance);
    }
    public void deposit(double amount){
        this.balance += amount;
    }
    public void withdraw(double amount){
        if(amount < 1000){
            System.out.println("You cannot withdraw below Rs.1000");
        }
        else{
            this.balance -= amount;
        }
    }
}

class BankingSystem{
    public static void main(String args[]){

        BankAccount obj1 = new SavingsAccount(321, 5000);
        BankAccount obj2 = new CurrentAccount(232, 6000);

        obj1.showBalance();
        obj2.showBalance();

        obj1.deposit(5000);
        obj2.withdraw(1000);

        obj1.showBalance();
        obj2.showBalance();

        if(obj1 instanceof LoanEligible){
            ((LoanEligible)obj1).checkLoanEligibility();
        }
        if(obj2 instanceof LoanEligible){
            ((LoanEligible)obj2).checkLoanEligibility();
        }

    }
}