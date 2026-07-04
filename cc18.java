// Multiplication Table 
import java.util.Scanner;
class hello{
    public static void main (String args[])
    {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter Multipliction Table (No):");
        int n = Input.nextInt();
        for (int i =1;i<=n;i=i+1)
        {
            System.out.println(i+" * "+n+" = "+(i*n));
        }
    }
}