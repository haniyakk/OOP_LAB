package payrollsystemtest;
public class BasePlusComissionEmployee extends CommissionEmployee{
    private double baseSalary;
    public BasePlusComissionEmployee(){
    super();
    }
    public BasePlusComissionEmployee(String firstName,String lastName, String CNIC,double grossSale,double commissionRate,double baseSalary){
        super(firstName,lastName,CNIC,grossSale,commissionRate);
        this.baseSalary=baseSalary;
    }
    public double getBS (){
        return baseSalary;
    }
    public void setBS(double baseSalary){
        if(baseSalary>=0){
            this.baseSalary=baseSalary;
        }
        else{
            System.out.println("Base Salary can not be a negative value!!!");
        }
    }
    @Override 
    public String toString(){
        return "\nBase Plus "+super.toString();
    }
    @Override
    public double earning(){
        return baseSalary*super.earning();
       }
}
