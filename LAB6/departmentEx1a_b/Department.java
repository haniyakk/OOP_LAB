package department;
import java.util.ArrayList;
public class Department {
    private String departmentName;
    private ArrayList <Faculty> departmentFaculty;
    private ArrayList <Course> offeredCourse;
    public Department (String departmentName)
    {this.departmentName=departmentName;
     this.departmentFaculty=new ArrayList<>();
     this.offeredCourse=new ArrayList<>();
    }
    public String getDepartName(){return departmentName;}
    public void facultyList(Faculty faculty) {
        departmentFaculty.add(faculty);
    }
    public void courseList(Course course) {
        offeredCourse.add(course);
    }
    public String getDeptName(){return departmentName;}
    public ArrayList<Faculty> getFacList(){
    return departmentFaculty;
    }
    public ArrayList<Course> getCourseList(){
    return offeredCourse;
    }
    @Override
    public String toString()
    {
        return "\nDepartment Name: "+departmentName;
    }
}