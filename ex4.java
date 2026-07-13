// check Whether Both num1,num2 are same
import java.util.Scanner;

class demo {
    public static void main (String args[])

    {
        Scanner Input = new Scanner(System.in);
        int num1= Input.nextInt();
        int num2 = Input.nextInt();
        if (num1==num2){
            System.out.print(num1+" And "+num2+" Both Are Eqal");
        }
        else{
            System.out.print(num1+" And "+num2+" Both Are Not Eqal");
        }
    }
}