import java.util.Scanner;

public class CounterPeopleTest {


    public static void main(String[] args) {
        int p, s1;
        Scanner in = new Scanner(System.in);
        CounterPeople click = new CounterPeople();
        System.out.println("enter the  number :");
        s1 = in.nextInt();
        System.out.println("enter 1 to counting or -1 to undo or 0 to resent.");
        System.out.println("if you want to exit enter 2):");
        p = in.nextInt();
        while (p != 2) {
            if (p == 1) {
                click.click();
                System.out.println("the people is " + click.setLimit(s1));
            }
            if (p == 0) {
                click.reset();
                System.out.println("the people is " + click.getValue());
            }
            if (p == -1) {
                click.undo();
                System.out.println("the people is " + click.getValue());
            }
            p = in.nextInt();
        }
    }
}

