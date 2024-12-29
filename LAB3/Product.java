package product;
import java.util.Scanner;

public class Product {
    static int num;
    public static int product(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else if(n<0){
            System.out.println("Invalid only positive numbers ");
            return -1;
        }
        else{
            return n*product(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter a number: ");
        num=sc.nextInt();
        int pro=product(num);
        System.out.println(pro);

    }
    
}
