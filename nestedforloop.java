// Nested For Loop
// teacher 1 ; asked to write the word
// john on the board 5 times
// teacher 2 ; asked to write the word
// john on the board 5 times

// Satisfy Teacher 1 and 2 Request simply using Nested for loop 
class demo{
    public static void main (String args[])
    {
        for (int teacher = 1;teacher<=2;teacher=teacher+1)
        {
            for (int a = 1; a<=5;a=a+1){
                System.out.println("John");
            }
        }
    }
}