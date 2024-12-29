package lab7ex1;

public class Lab7Ex1 {

    public static void main(String[] args) {
       Course c1=new Course("CSC-210","OOP","3");
       Course c2=new Course("CSC-110","DDL","3");
       Course c3=new Course("CSC-310","FE","3");
       Faculty f1=new Faculty("8:30AM -5:30PM ","FATIMA AQSA","SENIOR LECTURER","CS","FATIMAAQSA@GMAIL.COM","0300-324234325",001,150000);
       Faculty f2=new Faculty("8:30AM -12:30PM ","TARIQ HUSSAIN","SENIOR LECTURER","PHYSICS","TARIQHUSSAIN@GMAIL.COM","0300-24233535",002,150000);
       f1.assignCourse(c1);
       f2.assignCourse(c2);
       
       System.out.println("_______________");
       System.out.println("Faculty details");
       System.out.println("_______________");
       System.out.println(f1);
       System.out.println(f2);
       
       
       Staff s1 = new Staff("9 AM - 5 PM", "Jane Smith", "Admin", "Administration", 
                                "jane.smith@example.com", "0987654321", 003, 200000);
       Staff s2 = new Staff("9 AM - 5 PM", "Jane Smith", "Student Advisor", "Administration", 
                                "jane.smith@example.com", "0987654321", 004, 100000);
       
       System.out.println("_______________");
       System.out.println("Staff details");
       System.out.println("_______________");
       System.out.println(s1);
       
    }
    
}
