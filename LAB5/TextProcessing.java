package textprocessing;
import java.util.Scanner;

public class TextProcessing {
    String s;
    public void rev(){
        char[] arr;
        arr = s.toCharArray();
        int size=s.length();
        char[] revArr= new char[size];
    System.out.print("The reversed word structure is: ");
        for(int i=0;i<size;i++){
            revArr[i]=arr[size-1-i];
            System.out.print(revArr[i]);
        }
        System.out.println("\n");
    }
    public static void main(String[] args) {
        TextProcessing obj=new TextProcessing();
        System.out.print("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        obj.s=sc.nextLine();
        obj.rev();
    }
}
