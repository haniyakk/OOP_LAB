package department;
import java.util.ArrayList;
public class Faculty {
    private String facultyName,facultyDesignation,facultyEmail,facultyContact;
    private int facultySalary, facultyId;
    private ArrayList <Course> course;
    public Faculty(String facultyName,String facultyDesignation,String facultyEmail,String facultyContact, int facultyId,int facultySalary)
    {
        this.facultyName=facultyName;
        this.facultyId=facultyId;
        this.facultyEmail=facultyEmail;
        this.facultyDesignation=facultyDesignation;
        this.facultySalary=facultySalary;
        course=new ArrayList<>();
    }
    
    public String getFacultyName(){return facultyName;}
    public String getFacultyDesign(){return facultyDesignation;}
    public String getFacultyEmail(){return facultyEmail;}
    public String getFacultyContact(){return facultyContact;}
    public int getFacultySalary(){return facultySalary;}
    public int getFacultyId(){return facultyId;}
    //public Course getFacultyCourse(){return course;}
    
    public void assignCourse(Course course)
    {
        this.course.add(course);
    }
    @Override
    public String toString()
    {
        return "\nFaculty's Name: "+facultyName
        +"\nFaculty's Designation: "+facultyDesignation
        +"\nFaculty's Contact: "+facultyContact
        +"\nFaculty's Email: "+facultyEmail
        +"\nFaculty's ID: "+facultyId
        +"\nFaculty's Salary: "+facultySalary
        +"\nFaculty's course(s): "+course;
                
    }
    
}
