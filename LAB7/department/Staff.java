package lab7ex1;

public class Staff extends Employee{
    String workHours;
    public Staff(String workHours,String empName,String empDes,String empDep,String empEmail,String empCont,int empNum,int empSalary)
    {
        super(empName, empDes,empDep, empEmail,empCont);
        this.setEmpSalary(empSalary); // Use the setter method to set salary
        this.setEmpNum(empNum); // Use the setter method to set employee number
        this.workHours=workHours;
    }
    @Override
    public String toString()
    {
        return super.toString()+ "\nWork hours: "+workHours;
    }
}
