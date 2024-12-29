package lab7ex1;

public class Employee {
    private String empName, empDes,empDept,empEmail,empCont;
    private int empSalary,empNum;
    public Employee(String empName,String empDes,String empDept,String empEmail,String empCont){
        this.empName=empName;
        this.empDes=empDes;
        this.empDept=empDept;
        this.empEmail=empEmail;
        this.empCont=empCont;
        this.empSalary=empSalary;
        this.empNum=empNum;
    }
    public int getEmpNum(){return empNum;}
    public int getEmpSalary(){return empSalary;}
    
    public void setEmpNum(int empNum){ this.empNum=empNum;}
    public void setEmpSalary(int empSalary){this.empSalary=empSalary;}
    @Override
    public String toString()
    {
        return "Employee Name: "+empName
        +"\nEmployee Designation: "+empDes
        +"\nEmployee Department: "+empDept
        +"\nEmployee Email: "+empEmail
        +"\nEmployee Contact: "+empCont
        +"\nEmployee Salary: "+empSalary
        +"\nEmployee Number: "+empNum
        ;
    }
    
}
