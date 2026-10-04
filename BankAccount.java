package classesObjects;

public class BankAccount {
    String accountHolderName;
    long accountNumber;
    long balance;
    
    void displayAccountdetails()
    {
        System.out.println("account holder name is:"+accountHolderName);
        System.out.println("account holder name number is:"+accountNumber);
        System.out.println("account holder balance is:"+balance);
    }
    void deposit(long amount)
    {
        balance=balance + amount;
    }

    public static void main(String[] args) 
    {
        BankAccount ba = new BankAccount();

        ba.accountHolderName="piyush";
        ba.accountNumber=123447578;
        ba.balance=10000;

        ba.deposit(5000);
        ba.displayAccountdetails();
    }
}
