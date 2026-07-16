// Get Input For Size On Array ,
// Get Input For Each Element In AN Array
// Find And Print Middle Element In An Array

import java.util.Scanner;
class arr{
    public static void main (String args[]){
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter Size Of An Array : ");
        int n = Input.nextInt();
        int[] Scores = new int[n];
        for (int i = 0; i<=n-1;i=i+1){
            Scores[i]=Input.nextInt();
            
            
        }
        int a = n-1/2;
        System.out.print("Mid Element : "+ Scores[a]);
        
    }
}