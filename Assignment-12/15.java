import java.util.Scanner;
class AccountLockedException extends RuntimeException{
    public AccountLockedException(String msg){
        super(msg);
    }
}

class PinValidation{
    private int pin;
    public PinValidation(){
        pin = 1234;
    }
    public int getPin()
    {
        return pin;
    }
}
class ATM{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    PinValidation pv = new PinValidation();
    for(int i=1; i<=3;i++){     
    try  { 
         System.out.println("enter your atm pin");
         int pin =  sc.nextInt();
        if(pv.getPin()==pin) 
        {
            System.out.println("correct pin ");
            return;
        }
        else{
            if(i==3) throw new AccountLockedException("your account is locked now");
            continue;
        }
    }
    catch(AccountLockedException e){
        e.printStackTrace();

    }
    }

    }
}