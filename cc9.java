//get input for salary and age
//if salry >= 20k or age <=25, ask input for loan amount
// otherwise you are not eligibele fo loan
// on loan amount input if loan amount is <= 50k print you are eligible for laon
// greate than 50k print max laon amt is 50k only

import java.util.Scanner;
class hello {
    public static void main (String args[])
    {
        Scanner Input = new Scanner(System.in);
        System.out.println("Welcome To The Loan Portal");
        System.out.print("Enter Your Salary: ");
        int salary = Input.nextInt();
        System.out.print("Enter Your Age :");
        int age = Input.nextInt();
        if (salary >=  20000 || age <= 25){
            System.out.print("Enter Required Loan Amount : :");
            int amt = Input.nextInt();
            if (amt <= 50000){
                System.out.print("You Are Eligible For Loan");
            }
            else{
                System.out.print("Maximum Loan Amount IS 50k , Try Again !!!");
            }
        }
        else{
            System.out.print("You Are Not eligible For Loan");
        }
 }
}