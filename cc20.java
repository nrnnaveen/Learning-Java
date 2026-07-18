// create a class called find with  a main 
// and evenorodd function with int num parameter
//  on that class inside a main function 
// get integer input from user 
// Pass That input to the evenorodd function 
// and let the function decide whether the 
// number is even or odd
import java.util.Scanner;
class find{
    void evenorodd(int num){
        if (num%2==0){
            System.out.println(num+" Is Even");
        }
        else{
            System.out.println(num+" Is Odd");
        }
    }
    public static void main(String args[]){
        Scanner Input = new Scanner(System.in);
        find obj1 = new find();
        System.out.print("Enter Number: ");
        int num = Input.nextInt();
        obj1.evenorodd(num);
    }
}