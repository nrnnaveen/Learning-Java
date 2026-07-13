// count the odd numbers from 1 to 10 using for loop

import java.util.Scanner;
class hello{
    public static void main (String args[])
    {
        int count= 0;
        for(int i=1;i<=10;i=i+1){
            if (i%2==0){
                //System.out.println(i);
            }
            else{
                count=count +1;
                //System.out.println(count);
            }

        }
        System.out.println("Total Odd Count :"+count);

    }
}