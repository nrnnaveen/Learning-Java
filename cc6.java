// What Is Thew Score In A game 
//if the score is less than 50 , you need to improve
//if the score is between 50 and 70 , good job
//if the score is greater than 50,print "Excellent Performance"

import java.util.Scanner;
class hello {
    public static void main (String args[])
    {
        Scanner Input = new Scanner(System.in);
        int Score = Input.nextInt();
        if(Score < 50){
            System.out.print("You Need To Improve");
        }
        else if(Score >= 50 && Score <= 70){
            System.out.print("Good Job");
        }
        else if (Score > 70){
            System.out.print("Excellent Performance");
        }
    }
}