import java.util.Scanner;
class demo {

    public static void main(String args[])
    {
        Scanner Input = new Scanner(System.in);
        
        String Name=Input.nextLine();
        int Age = Input.nextInt();
        if (Age > 18){
            System.out.println("Congratulations ! ,You Are Eligible To Vote");
        }

        else{
            System.out.println("Sorry,You Are Not Eligible to Vote");
        }
    }
}
