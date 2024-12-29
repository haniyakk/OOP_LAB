package condb;
import java.util.Scanner;
import java.sql.SQLException;
public class ConDB {
    static final String PASSWORD = "admin444";
    public static void main(String[] args) throws ClassNotFoundException, SQLException 
    {
        Scanner sc = new Scanner(System.in);
        //connections can be established in constructor as well
        StudentsDBF sdb = new StudentsDBF();
        String decision;
        System.out.print("Please enter your password: ");
        String password = sc.nextLine();
        if(password.equals(PASSWORD))
        {
            do{
                System.out.println("1-Add\n2-Update\n3-Delete\n4-Display");
                System.out.print("Please enter your choice: ");
                int menu = sc.nextInt();
                sc.nextLine();

                switch(menu)
                {
                    case 1:
                        System.out.print("Please enter the registration number: ");
                        int reg =  sc.nextInt();
                        sc.nextLine();
                        System.out.print("Please enter the name: ");
                        String name =  sc.nextLine();
                        System.out.print("Please enter the department: ");
                        String depart =  sc.nextLine();
                        sdb.add(reg, name, depart);
                        break;
                    case 2:
                        System.out.print("Please enter the registration number of the record you want to update: ");
                        int toUpdate =  sc.nextInt();
                        sc.nextLine();
                        System.out.print("Please enter the new name: ");
                        String newName =  sc.nextLine();
                        System.out.print("Please enter the new department: ");
                        String newDepart =  sc.nextLine();
                        sdb.update(toUpdate, newName, newDepart);
                        break;
                    case 3:
                        System.out.print("Please enter the registration number of the record you want to delete: ");
                        int toDelete =  sc.nextInt();
                        sc.nextLine();
                        sdb.delete(toDelete);
                        break;
                    case 4: 
                        sdb.displayAll();
                        break;
                    default:System.out.println("INVALID MENU NUMBER");
                }
                System.out.print("Do you want to go back to the main menu: ");
                decision =  sc.nextLine();
            }
            while(decision.equalsIgnoreCase("yes"));
            }
        else
        {
            System.err.println("INCORRECT PASSWORD! Access Denied");
        }
    }
}
