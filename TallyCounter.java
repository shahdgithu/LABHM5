public class TallyCounter {

    private   int value;

       public TallyCounter()
    {
        value=0;
    }


    public void click()
    {
        value=value+1;
    }


    public int getValue(){
        return Math.max(value,0);
    }


    public void reset(){
        value=0;
    }


    public void undo()
    {if (value>0)
        value=value-1;
    }

}
