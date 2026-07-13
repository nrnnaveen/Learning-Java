import java.util.Scanner;
class demo {
    public static void main (String args[])
    {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter A : ");
        int a = Input.nextInt();
        System.out.print("Enter B : ");
        int b = Input.nextInt();
        String c = a>b? "A is Greater Than B": "B Is Greater Than A";
        System.out.print(c);
        
    }
}    