package framework;

public abstract class CurrentAcc extends BankAcc {

    protected final float creditLimit;

    public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
        super(accNo, accNm, accBal);
        this.creditLimit=creditLimit;
        //TODO Auto-generated constructor stub
    }
    @Override
    public void withdraw(float acc){
        if(acc>creditLimit){
            System.out.println("Credit Limit has reached");
        }else{
            setAccBal(getAccBal()-acc);
            System.out.println("Balance is :"+getAccBal());
        }
    }
    @Override
    public String toString(){
        return "CurrentAcc[getAccNo()="+getAccNo()+",creditLimit="+creditLimit+",getAccBal()="+getAccBal()+",getAccNm()="+getAccNm()+",toString="+super.toString()+",getClass="+getClass()+",hashcode="+hashCode()+"]";
        
    }
    
}
