public class BankTester {
    public static void main(String[] args) {
        Bank a = new Bank();
        a.deposit(1000);
        a.withdraw(500);
        a.withdraw(400);
        System.out.println(a.getBalance());
        System.out.println("the expected result is (100)");
    }
}