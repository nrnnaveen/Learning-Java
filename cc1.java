//Get Input For Varriable Mark. 
// If Mark > 35 Print Pass ,Else Print Fail

import java.util.Scanner;
class hello {
    public static void main (String args[])
    {
        Scanner Input = new Scanner(System.in);
        int Mark = Input.nextInt();
        if (Mark > 35){
            System.out.print("Pass");
        }
        else{
            System.out.print("Fail");
        }
    }
    
}