package application;
import framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {
    private static float MINBAL=1000;

    public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
        super(accNo, accNm, accBal, isSalaried);
        //TODO Auto-generated constructor stub
    }
    @Override
    public void withdraw(float accc){
        if(getAccBal()<MINBAL){
            System.out.println("Balance is Insufficient");
        }else{
            setAccBal(getAccBal()-accc);
            System.out.println("Savings account balance is :"+getAccBal());

        }
    }
    @Override
    public String toString(){
        return "MMSavingAcc[isSalaried="+isSalaried+",getAccNo()="+getAccNo()+",getAccBal()="+getAccBal()+",getAccNm()="+getAccNm()+",toString="+super.toString()+",getClass="+getClass()+",hashcode="+hashCode()+"]";
    }
}
