public class TimeDepositAccount {

    private  double b,r;


    public TimeDepositAccount(double initialbalance,double rate){
        b=initialbalance;
        this.r=rate;
    }
    public TimeDepositAccount(){
        this(0,0);}

    public void  withdraw(){

        b=b-b;
    }

    public double  getbalance(){
        return b;
    }
    public  void addInsert()
    {
        b=b+b*(r/100);
    }



}