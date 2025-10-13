import java.util.Scanner;
class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(){
        super("Insufficient Balance! ");
    }
    
}
class LowBalanceException extends Exception{
    public LowBalanceException(){
        super("Low Balance: ");
    } 
}
class Balance{
    private int balance;
    public Balance(){
        balance = 50000;
    }
    public void deposit(int amount){
        balance += amount;
    }
    public void withdrawal(int amount){
        try{
            if(amount > balance)
            throw new InsufficientBalanceException();
            
            else{
                balance -= amount;
                System.out.println("Amount Detucted! ");
            
            if(balance < amount){
            throw new LowBalanceException();
            }
            
            }
        }
        catch(InsufficientBalanceException e){
            e.printStackTrace();
        }
        catch(LowBalanceException e){
            e.printStackTrace();
        }
        
        }
        public int getBalance(){
            return balance;
    }
}
class TestMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a amount: ");
        int amount = sc.nextInt();

        Balance b = new Balance();
        b.deposit(10000);
        System.out.println("available balance: "+ b.getBalance());
        b.withdrawal(5000);
        System.out.println("Total Balance: " + b.getBalance());
        b.withdrawal(10000);
        System.out.println("Total Balance: " + b.getBalance());
    }
}


