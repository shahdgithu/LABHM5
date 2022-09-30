public class Bank {

    private double balance;

    public Bank()
    {
        // this (0);
        balance=0;
    }
    public Bank(double initialBalance)
    {
        balance=initialBalance;
    }
    public void deposit (double balance)
    {
        this.balance=this.balance+balance;
    }
    public void withdraw(double balance)
    {
        this.balance=this.balance-balance;
    }
    public  double getBalance()
    {
        return balance;
    }
}