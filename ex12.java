// print * pattern 
// *
// **
// *** 
class demo{
    public static void main (String args[])
    {
        for (int i = 1; i<=3;i=i+1)
        {
            for (int a=1;a<=i;a=a+1){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}