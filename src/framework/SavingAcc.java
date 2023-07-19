package framework;

public abstract class SavingAcc extends BankAcc{

    protected boolean isSalaried;
    private float MINBAL=500;

    public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
        super(accNo,accNm,accBal);
        this.isSalaried=isSalaried;
        //TODO Auto-generated constructor stub
    }
    @Override
    public void withdraw(float acc){

        if(acc<MINBAL){
            System.out.println("Balance not sufficient");
        }else{
            setAccBal(acc);
            System.out.println("Balance is :"+getAccBal());
        }
    }
    @Override
    public String toString(){
        return "SavingAcc[isSalaried="+isSalaried+",getAccNo()="+getAccNo()+",getAccBal()="+getAccBal()+",getAccNm()="+getAccNm()+",toString="+super.toString()+",getClass="+getClass()+",hashcode="+hashCode()+"]";
        
    }

}
