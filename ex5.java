import java.util.Scanner;
class hello{
    public static void main (String args[])
    {
        Scanner Input = new Scanner(System.in);
        String RCB = Input.nextLine();
        if (RCB.equals("Win")){
            System.out.print("Esale Cup Namdu");
        }
        else{
            System.out.print(" Cup Illa");
        }
       

    }
}