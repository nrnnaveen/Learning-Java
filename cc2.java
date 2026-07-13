import java.util.Scanner;
class hello {
    public static void main (String args[])
    {
        Scanner Input = new Scanner(System.in);
        System.out.println("Welcome To The Scholorship Portal");
        int Income = Input.nextInt();
        if(Income>7000){
            System.out.println("You Are Not Eligible For The Scholorship");

        }
        else{
            System.out.print("You Are Eligible For The Scholorship");
        }
    }
}