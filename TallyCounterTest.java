public class TallyCounterTest {

    public static void main(String[] args) {
        TallyCounter s= new TallyCounter();
        System.out.println("the value of counter after building "+s.getValue());
        s.click();s.click();s.click();
        System.out.println("the value of counter after three clicks "+s.getValue());
        s.undo();s.undo();s.undo();s.undo();
        System.out.println("the value of counter after the undo "+s.getValue());
        s.reset();
        System.out.println("the value of counter after reset "+s.getValue());

    }
}
