// create a class called School with main function
// create a function called passorfail 
// which should return the string pass or fail
// inside main function get 
// integer input from total mark 
// pass that input to the passorfail
//  function and let the function 
// decide whether student pass or fail
import java.util.Scanner;
class School{
    String passorfail(int mark){
        if (mark<35 ){
            return "Fail";
        }
        else{
            return "Pass";
        }

    }
    public static void main (String args[])
    {
        Scanner Input = new Scanner(System.in);
        School O1 = new School();
        System.out.print("Enter Your Mark : ");
        int mark = Input.nextInt();
        O1.passorfail(mark);
        System.out.print(O1.passorfail(mark));
    }
}