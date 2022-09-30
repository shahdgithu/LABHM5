public class CounterPeople {

    private   int people;
    public CounterPeople()
    {
        people=0;
    }
    public void click()
    {
        people=people+1;
    }
    public void reset()
    {
        people = 0;
    }
    public void undo()
    {if (people>0)
        people=people-1;
    }
    public   int setLimit(int maximum)
    {
        return people= Math.min(people,maximum);
    }
    public int getValue()
    {
        return people;
    }
}