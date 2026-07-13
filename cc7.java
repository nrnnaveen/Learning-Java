// Get Input For Five Subject Marks .Add All Of It ,And Find Average 
// If Average mark is Less Than 35 ,Print Additional Class Required
// else you are good to go 

import java.util.Scanner;
class hello {
    public static void main (String args[])
    {
        Scanner Input = new Scanner(System.in);
        int sub1 = Input.nextInt();
        int sub2 = Input.nextInt();
        int sub3 = Input.nextInt();
        int sub4 = Input.nextInt();
        int sub5 = Input.nextInt();
        int average = (sub1+sub2+sub3+sub4+sub5)/5 ;
        if (average <= 35){
            System.out.print("Your Average Score IS : "+average+" So,Additional Class Required");
        }
        else {
            System.out.print("Your Average Score IS : "+average+" You Are Good To Go !!!");
        }
    }
}