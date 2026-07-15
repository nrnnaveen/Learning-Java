// get input for 5 numbers 
// using array and forloop

import java.util.Scanner;
class arr {
    public static void main (String args[])
    {
        Scanner Input= new Scanner(System.in);
        int[] Score = new int[5];
        for (int i = 0; i<=4;i=i+1){
            Score[i]=Input.nextInt();
            System.out.println(i+" Element :"+Score[i]);

        }
    }
}