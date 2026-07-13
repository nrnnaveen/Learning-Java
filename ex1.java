import java.util.Scanner;

class hello {
    public static void main (String args[])
    {
         Scanner Input = new Scanner(System.in);
         String Name = Input.nextLine();
         int Age = Input.nextInt(); 
         Input.nextLine();
         String Address = Input.nextLine(); 
         System.out.println("Your Name Is:"+Name);
         System.out.println("Your Age Is:"+Age);
         System.out.print("Your Address Is:"+Address);
    }
    
}

