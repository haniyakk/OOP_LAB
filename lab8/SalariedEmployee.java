package payrollsystemtest;
public class SalariedEmployee extends Employee{
     double  weeklySalary;
    SalariedEmployee(){
    super();
    this.weeklySalary=0.00;
    }
    SalariedEmployee(String firstName,String lastName, String CNIC,double weeklySalary){
        super(firstName,lastName,CNIC);
        this.weeklySalary=weeklySalary;
    }
    public double getWS (){
        return weeklySalary;
    }
    public void setWS(double weeklySalary){
        if(weeklySalary>=0){
            this.weeklySalary=weeklySalary;
        }
        else{
            System.out.println("Weekly salary can not be a negative value!!!");
        }
    }
    @Override 
    public String toString(){
        return "\nSalaried Employee: "+super.toString();
    }
    @Override 
    public  double earning(){
        return weeklySalary;
    }
    
    
}
