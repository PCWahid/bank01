package client;
import framework.*;
import application.*;
import framework.CurrentAcc;

public class Client {
    public static void main(String[] args) throws Exception {
        SavingAcc sa=new MMSavingAcc(12,"Wahid", 2500, true);
        sa.withdraw(400);
        sa.toString();
        CurrentAcc ca=new MMCurrentAcc(10, "Saad", 15000, 50000);
        ca.withdraw(5000);
        ca.toString();
    }
}
