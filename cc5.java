// using if elseif elif 
import java.util.Scanner;
class hello {
    public static void main (String args[])
    {
        Scanner Input= new Scanner(System.in);
        int score = Input.nextInt();
        if(score > 35 && score < 60 ){
            System.out.print("I Can Get Video Game ");
        }
        else if(score > 60 && score < 90){
            System.out.print("I Can Get Iphone");
        }
        else if(score > 90 ){
            System.out.print("I Can Get Macbook Pro");
        }
        else{
            System.out.print("I Failed Nothing");
        }
    }
}