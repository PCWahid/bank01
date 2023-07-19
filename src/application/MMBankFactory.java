package application;
import framework.BankFactory;
import framework.CurrentAcc;
import framework.SavingAcc;

public class MMBankFactory extends BankFactory {

    public SavingAcc getNewSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
        SavingAcc sAcc=new SavingAcc(accNo, accNm, accBal, isSalaried) {
            
        };
        return sAcc;
        
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getNewSavingAcc'");
    }

    
    public CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
        CurrentAcc cAcc=new CurrentAcc(accNo, accNm, creditLimit, creditLimit){};
            
        
        return cAcc;

    
        // throw new UnsupportedOperationException("Unimplemented method 'getNewCurrentAcc'");
    }
    
}
