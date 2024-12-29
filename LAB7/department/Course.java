package lab7ex1;

public class Course {
    private String courseCode, courseName, courseCH;
    public Course(String courseCode, String courseName,String courseCH){
        this.courseCode=courseCode;
        this.courseCH=courseCH;
        this.courseName=courseName;
    
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
}
