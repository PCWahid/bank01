package application;
import framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {

    public MMCurrentAcc(int AccNo, String AccNm, float AccBal, float creditLimit) {
        super(AccNo, AccNm, AccBal, creditLimit);
        //TODO Auto-generated constructor stub
    
    }
    @Override
    public void withdraw(float acc){
        if(acc>creditLimit){
            System.out.println("Credit Limit has reached");
        }else{
            setAccBal(getAccBal()-acc);
            System.out.println("Current account balance is :"+getAccBal());
        }
    }
    public String toString(){
        return "MMCurrentAcc[creditLimit="+creditLimit+",getAccNo()="+getAccNo()+",getAccBal()="+getAccBal()+",getAccNm()="+getAccNm()+",toString="+super.toString()+",getClass="+getClass()+",hashcode="+hashCode()+"]";
        
    }
    
}
