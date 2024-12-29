package department;

public class Course {
    private String courseName, courseCode,courseCH;
    private int marks;
    Course(String courseName, String courseCode,String courseCH){
        this.courseName=courseName;
        this.courseCode=courseCode;
        this.courseCH=courseCH;
        }
    
    public String getCourseCode(){
        return courseCode;
        }
    public String getCourseName(){
        return courseName;
        }
    public String getCourseCH(){
        return courseCH;
        }
    public String toString(){return "Course  name: "+ courseName+"course code: "+courseCode+" course credit hours: "+courseCH;}
    
}  
