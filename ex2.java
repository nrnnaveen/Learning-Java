import java.util.Scanner;

class hello{
    public static void main (String args[])
    {
        Scanner Input = new Scanner(System.in);
        int a=Input.nextInt();
        int b=Input.nextInt();
        int c=Input.nextInt();
        int d = a*b*c;
        int e = a+b+c;
        System.out.print("Output Is:"+(d/e));

    }
}