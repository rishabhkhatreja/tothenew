/*
Create 3 sub class of bank SBI,BOI,ICICI all 4 should have method called getDetails which provide there
specific details like rateofinterest etc,print details of every banks.
*/
abstract class Bank {
    public double rateOfInterest;
    public double rateOfInterest_seniorCitizen;
    public double personalLoan_rate;
    public double homeLoan_rate;
    public int noOfBranches;
    public abstract void getDetails();
}
class BOI extends Bank
{
    public BOI()
    {
        rateOfInterest=8.50;
        rateOfInterest_seniorCitizen=9.00;
        homeLoan_rate=11.20;
        personalLoan_rate=12.00;
        noOfBranches=102;
    }
    public void getDetails()
    {
        System.out.println("Rate of interest of BOI is="+rateOfInterest);
        System.out.println("Rate of interest for senior citizen of BOI is="+rateOfInterest);
        System.out.println("Home loan Rate of interest of BOI is="+homeLoan_rate);
        System.out.println("personal loan rate of interest of BOI is="+personalLoan_rate);
        System.out.println("No of branches of BOI is="+noOfBranches);
    }
}
class SBI extends Bank
{
    public SBI()
    {
        rateOfInterest=8.00;
        rateOfInterest_seniorCitizen=9.00;
        homeLoan_rate=13.25;
        personalLoan_rate=11.00;
        noOfBranches=315;
    }
    public void getDetails()
    {
        System.out.println("Rate of interest of SBI is="+rateOfInterest);
        System.out.println("Rate of interest for senior citizen of SBI is="+rateOfInterest);
        System.out.println("Home loan Rate of interest of SBI is="+homeLoan_rate);
        System.out.println("personal loan rate of interest of SBI is="+personalLoan_rate);
        System.out.println("No of branches of SBI is="+noOfBranches);
    }
}
class ICICI extends Bank
{
    public ICICI()
    {
        rateOfInterest=8.00;
        rateOfInterest_seniorCitizen=9.50;
        homeLoan_rate=13.25;
        personalLoan_rate=11.00;
        noOfBranches=315;
    }
    public void getDetails()
    {
        System.out.println("Rate of interest of ICICI is="+rateOfInterest);
        System.out.println("Rate of interest for senior citizen of ICICI is="+rateOfInterest);
        System.out.println("Home loan Rate of interest of ICICI is="+homeLoan_rate);
        System.out.println("personal loan rate of interest of ICICI is="+personalLoan_rate);
        System.out.println("No of branches of ICICI is="+noOfBranches);
    }
}
public class BankDetails
{
    public static void main(String[] args) {
        BOI obj=new BOI();
        obj.getDetails();
        SBI obj1=new SBI();
        obj1.getDetails();
        ICICI obj2=new ICICI();
        obj2.getDetails();
    }
}