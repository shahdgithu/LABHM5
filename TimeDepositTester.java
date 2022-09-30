import java.util.Scanner;

public class TimeDepositTester {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double balance;
        System.out.println("enter balance :");
        balance=in.nextDouble();
        TimeDepositAccount sh=new TimeDepositAccount(balance,5);
        System.out.println("the balance is " + sh.getbalance());
        sh.addInsert();
        System.out.println("the balance after adding is "+ sh.getbalance());

        sh.withdraw();
        System.out.println("the balance after withdrawal is "+ sh.getbalance());
    }
}