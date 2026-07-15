// create an int array get input for 5 numbers
// and add all of them (sum)

import java.util.Scanner;
class hello{
    public static void main (String args[])
    {
        Scanner Input = new Scanner(System.in);
        int[] Sum = new int[5];
        Sum[0]=Input.nextInt();
        System.out.println("Sum[0] : "+Sum[0]);
        Sum[1]=Input.nextInt();
        System.out.println("Sum[1] : "+Sum[1]);
        Sum[2]=Input.nextInt();
        System.out.println("Sum[2] : "+Sum[2]);
        Sum[3]=Input.nextInt();
        System.out.println("Sum[3] : "+Sum[3]);
        Sum[4]=Input.nextInt();
        System.out.println("Sum[4] : "+Sum[4]);
        int Total = Sum[1] + Sum[2] + Sum[3] + Sum[4] ;
        System.out.print("Total: "+Total);        
    }
}