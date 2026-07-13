// Question : What is The Colour
//  Of The Traffic Light
// if answer is red stop, if yello 
// ,get ready, if green go 
import java.util.Scanner;
class demo {
    public static void main (String args[])
    {
        Scanner Input = new Scanner(System.in);
        System.out.println("Question : What is The Colour Of The Traffic Light ?");
        String ans = Input.nextLine();
        if (ans.equals("red")){
            System.out.print("Stop !!!");
        }
        else if (ans.equals("yellow")){
            System.out.print("Get Ready !!!");
        }
        else if (ans.equals("green")){
            System.out.print("GO !!!");
        }
        else{
            System.out.print("Invalid Answer , Try Again !!!");
        }
    }
}