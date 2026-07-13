import java.util.Scanner;
class hello{
    public static void main (String args[])
    {
        Scanner Input = new Scanner(System.in);
        String Name = Input.nextLine();
        double Score=Input.nextDouble();
        double C_Score= Score/10;
        Input.nextLine();
        String Department = Input.nextLine();
        System.out.println("Name Is:"+Name);
        System.out.println("Score is :"+C_Score +"/10");
        System.out.print("Department Is :"+Department);
    }
}