// do while
// Get Input Fo A Input Number It Should Be
//  Greater Than 10 ,Otherwise It Not 
// Greater Than 10 Ask The User To Re Enter
//  Until he types the right input 
import java.util.Scanner;
class demo{
    public static void main (String args[])
    {
        Scanner Input = new Scanner(System.in);
        int i =0;
        do {
            System.out.print("Enter The Number > 10 : ");
            i =Input.nextInt();
        }while(i<=10);
    }
}