package lab7ex1;
import java.util.ArrayList;

public class Faculty extends Employee{
    String workHours;
    private ArrayList<Course> courses;
    public Faculty(String workHours,String empName,String empDes,String empDept,String empEmail,String empCont,int empNum,int empSalary)
    {
        super(empName, empDes,empDept, empEmail,empCont);
        this.setEmpSalary(empSalary); // Use the setter method to set salary
        this.setEmpNum(empNum); // Use the setter method to set employee number
        this.workHours=workHours;
        this.courses=new ArrayList<>();
    }
    public void assignCourse(Course course)
    {
        courses.add(course);
    }
    public void printCourseList()
    {
        for(Course course:courses)
        {
            System.out.println("Course name: "+course.getCourseName());
            System.out.println("Course code: "+course.getCourseCode());
            System.out.println("Course credit hours: "+course.getCourseCH());
        }
    }
}
