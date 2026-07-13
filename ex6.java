import java.util.Scanner;
class google{
    public static void main (String args[])
    {
        Scanner Input = new Scanner(System.in);
        String Meghana=Input.nextLine();
        if (Meghana.equals("dead")){
            System.out.print("Surya Meets Ramya");
        }
        else{
            System.out.print("Surya Weds Meghana");
        }
    }
}