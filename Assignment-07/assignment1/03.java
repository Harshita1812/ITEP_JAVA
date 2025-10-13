import java.util.Scanner;
class BankAccount{
    private int accountNumber;
    private String holderName;
    private float balance;

    public void setData(int accountNumber, String holderName, float balance){
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance; 
    }
    public int getAccountNumber(int accountNumber){
        return accountNumber;
    }
    public String getHolderName(String holderName){
        return holderName;
    }
    public float getBalance(float balance){
        return balance;
    }
    public void Display(){
        System.out.println("account number: " + accountNumber);
        System.out.println("holder name: " + holderName);
        System.out.println("balance: "+ balance);
    }
}
class Bank{
    public static void main (String args[]){
      BankAccount obj =  new BankAccount();
      Scanner sc = new Scanner(System.in) ;

      System.out.println("enter a account number: ");
      int accountNumber = sc. nextInt();

      System.out.println("enter a holder name: ");
      int holderName = sc. nextLine();

      System.out.println("enter a balance: ");
      float balance = sc. nextFloat();
       
      obj.setData(accountNumber, holderName, balance);
      obj.Display();
    }
}