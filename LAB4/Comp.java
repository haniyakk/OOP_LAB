package comp;

import java.util.Scanner;


public class Comp {
    
String name, type, processor, moBo,opDrive;
int hardDisk, ram;
Comp(){
    name="UNKNOWN";
    type="UNKNOWN";
    moBo="UNKNOWN";
    opDrive="UNKNOWN";
    processor="UNKNOWN";
    hardDisk=0;
    ram=0;
}
public void getInput(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Please enter computer's name: ");
    name=sc.nextLine();
    System.out.print("Please enter computer's type: ");
    type=sc.nextLine();
    System.out.print("Please enter computer's processor: ");
    processor=sc.nextLine();
    sc.nextLine();
    System.out.print("Please enter computer's ram: ");
    ram=sc.nextInt();
    sc.nextLine();
    System.out.print("Please enter computer's hard disk: ");
    hardDisk=sc.nextInt();
    System.out.print("Please enter computer's mother board: ");
    moBo=sc.nextLine();
    System.out.print("Please enter computer's Optical devices drive: ");
    opDrive=sc.nextLine();
    }
    public void display(){
        System.out.println("Computer's name is: "+ name);
        System.out.println("Computer's type is: "+ type);
        System.out.println("Computer's processor is: "+ processor);
        System.out.println("Computer's ram is: "+ ram+" GB");
        System.out.println("Computer's hard disk is: "+ hardDisk+" GB");
        System.out.println("Computer's mother board is: "+ moBo);
        System.out.println("Computer's optical device drive is: "+ opDrive);
    }
    public void change(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Do you want to make any changes: ");
        String decision;
        decision= sc.next();
        if(decision.equalsIgnoreCase("yes")){
            System.out.print("Please select whatever you want to edit: ");
            System.out.println("1.NAME\n2. TYPE\n3.PROCESSOR\n4.RAM\n5.HARD DISK\n6.MOTHER BOARD\n7.OPTICAL DEVICE");
            int choice = sc.nextInt();
            switch(choice){
            case 1:
                System.out.print("Please enter computer's new Name: ");
                String name=sc.nextLine();
                break;
            
            case 2:
                System.out.print("Please enter computer's new Type: ");
                String type=sc.nextLine();
                break;
            case 3:
                System.out.print("Please enter computer's new processor: ");
                int processor=sc.nextInt();
                break;
            case 4:
                System.out.print("Please enter computer's new ram: ");
                int ram=sc.nextInt();
                break;
            case 5:
                sc.nextLine();
                System.out.print("Please enter computer's new Motherboard: ");
                String moBo=sc.nextLine();
                break;
                case 6:
                System.out.print("Please enter computer's new Optical Device Drivers: ");
                String opDrives=sc.nextLine();
                break;
                case 7:
                sc.nextLine();
                System.out.print("Please enter computer's new Hard Disks: ");
                String hdd=sc.nextLine();
                break;
                default:
                    System.out.println("Invalid choice!!!");
            }
            System.out.println("Your data was successfully updated");
        }
    }
    public static void main(String[] args){
    Comp obj=new Comp();
    Scanner sc= new Scanner(System.in);
    obj.getInput();
    obj.display();
    obj.change();
    System.out.println("Do you want to display data again: ");
    String choice=sc.nextLine();
    if(choice.equalsIgnoreCase("yes")){
        obj.display();
        }
    }
}