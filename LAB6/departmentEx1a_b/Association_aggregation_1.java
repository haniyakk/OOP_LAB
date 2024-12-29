package department;
public class Association_aggregation_1 {
    public static void main(String[] args){
        
        // Create 2 Course objects
        Course course1 = new Course("CS101", "Introduction to Computer Science", "3");
        Course course2 = new Course("CS201", "Data Structures and Algorithms", "3");

        // Create 3 Faculty objects
        Faculty faculty1 = new Faculty("John Doe", "Assistant Professor", "john@example.com", "123-456-7890", 50000, 101);
        Faculty faculty2 = new Faculty("Jane Smith", "Associate Professor", "jane@example.com", "987-654-3210", 60000, 102);
        Faculty faculty3 = new Faculty("Peter Parker", "Professor", "peter@example.com", "111-222-3333", 70000, 103);

        // Create 3 Department objects
        Department department1 = new Department("Computer Science");
        Department department2 = new Department("Electrical Engineering");
        Department department3 = new Department("Mechanical Engineering");

        // Assign courses to faculties
        faculty1.assignCourse(course1);
        faculty2.assignCourse(course2);
        faculty3.assignCourse(course1);
        faculty3.assignCourse(course2);

        // Add faculties to departments
        department1.facultyList(faculty1);
        department1.facultyList(faculty2);
        department2.facultyList(faculty3);

        // Display information
        System.out.println("Department Information:");
        System.out.println(department1.toString());
        System.out.print(course1.toString());
        System.out.println(department2.toString());
        System.out.print(course2.toString());
        System.out.println(department3.toString());
        
        System.out.println("Faculties:");
        System.out.println(faculty1.toString());
        System.out.println(faculty2.toString());
        System.out.println(faculty3.toString());
        
        System.out.println();
        }
}
