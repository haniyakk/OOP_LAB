package payrollsystemtest;
public class Employee {
    private String firstName, lastName, CNIC;
    Employee(){
        this.firstName=" ";
        this.lastName=" ";
        this.CNIC=" ";
    }
    Employee(String firstName,String lastName, String CNIC){
    this.firstName=firstName;
    this.lastName=lastName;
    this.CNIC=CNIC;
    }
    //getters and setters
    public String getFN(){
        return firstName;
    }
    public String getLN(){
        return lastName;
    }
    public String getCNIC(){
        return CNIC;
    }
    public void setFN(String firstName){
        this.firstName=firstName;
    }
    public void setLN(String lastName){
        this.lastName=lastName;
    }
    public void setCNIC(String CNIC){
        this.CNIC=CNIC;
    }
    @Override
    public String toString(){
        return "First Name: "+firstName+", Last Name: "+lastName+", CNIC "+CNIC;
    }
    public double earning(){
        return 0.00;
    }
    
}
