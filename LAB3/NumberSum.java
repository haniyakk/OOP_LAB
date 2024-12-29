package numbersum;
import java.util.Scanner;
public class NumberSum {
    int num1,num2;
    public int sum(int n1,int n2){
        if(n1==n2){
            return n1;
        }
        if (n1 > n2) {
            return sum(n2, n1); //swap the values for normal recursion 
        }
        else{
            return n1+sum(n1+1,n2);
        }
    }
    public static void main(String[] args) {
        NumberSum obj = new NumberSum();
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter any number: ");
        obj.num1=sc.nextInt();
        System.out.print("Please enter any number: ");
        obj.num2=sc.nextInt();
        
        obj.sum(obj.num1,obj.num2);
        int answer=obj.sum(obj.num1,obj.num2);
        System.out.println("The sum of the numbers in between this range is: "+answer);

    }
}
