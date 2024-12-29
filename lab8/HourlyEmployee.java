package payrollsystemtest;
public class HourlyEmployee extends Employee{
    private double wage,hours;
    HourlyEmployee(){
        super();
        this.wage=0.00;
        this.hours=0.00;
    }
    HourlyEmployee(String firstName,String lastName, String CNIC,double wage,double hours){
        super(firstName,lastName,CNIC);
        this.wage=wage;
        this.hours=hours;
    }
    public double getWage (){
        return wage;
    }
    public void setWage(double wage){
        if(wage>=0){
            this.wage=wage;
        }
        else{
            System.out.println("Wage can not be a negative value!!!");
        }
    }
    public double getHours(){
        return hours;
    }
    public void setHours(double hours){
        if(hours>=0){
            this.hours=hours;
        }
        else{
            System.out.println("hours can not be less than zero!!!");
        }
    }
    @Override 
    public String toString(){
        return "\nHourly Employee: "+super.toString();
    }
    @Override
    public double earning(){
    if(hours<=40){
        return wage*hours;
    }
    return wage*hours+100; //100 extra for overtime workings
       }
}
