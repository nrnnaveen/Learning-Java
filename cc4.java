// Get Input For a Number And Find It Is Even Or Odd

import java.util.Scanner;
class hello{
    public static void main (String args[])
    {
        Scanner Input = new Scanner(System.in);
        int num = Input.nextInt();
        if (num%2==0){
            System.out.print(num+" Is Even");
        }
        else{
            System.out.print(num+" Is Odd");
        }
    }
}