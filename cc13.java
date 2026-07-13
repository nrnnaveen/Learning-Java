// print the total count of even numbers between 1 to 100

class demo {
    public static void main (String args[])
    {
            int evencount= 0;
            for(int i = 1; i<=100;i=i+1){
                if (i%2==0){
                    evencount+=1;

                }

            }
            System.out.print("Total Even Counts:"+evencount);

    }

}