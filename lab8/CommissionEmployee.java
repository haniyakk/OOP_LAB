package payrollsystemtest;
public class CommissionEmployee extends Employee{
    private double grossSale, commissionRate;
    CommissionEmployee(){
        super();
        this.grossSale=0.00;
        this.commissionRate=0.00;
    }
    CommissionEmployee(String firstName,String lastName, String CNIC,double grossSale, double commissionRate){
        super(firstName,lastName,CNIC);
        this.grossSale=grossSale;
        this.commissionRate=commissionRate;
    }
    public double getGS (){return grossSale;}
    public void setGS(double grossSale){
        if(grossSale>=0){
            this.grossSale=grossSale;
        }
        else{
            System.out.println("Gross Sale can not be a negative value!!!");
        }
    }
    public double getHour (){
        return commissionRate;
    }
    public void setCR(double commissionRate){
        if(commissionRate>=0){
            this.commissionRate=commissionRate;
        }
        else{
            System.out.println("Commission Rate can not be a negative value!!!");
        }
    }
    @Override 
    public String toString(){
        return "Commission Employee: "+super.toString();
    }
    @Override
    public double earning(){
        return grossSale*commissionRate;
       }
}
