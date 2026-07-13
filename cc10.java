//get input for varriable
// a and b and print numbers between  a and b
import java.util.Scanner;
class demo{
    public static void main (String args[])
    {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter A:");
        int a = Input.nextInt();
        System.out.print("Enter B:");
        int b= Input.nextInt();
        for (int i = a;i<=b ;i=i+1){
            System.out.println(i);
        }
        
    }
}