// generate random number
import java.util.Random;
class demo{
    public static void main (String args[])
    {
        Random rand = new Random();
        int newnum = 0;
        while (newnum!=5) {
            
            newnum=rand.nextInt(100);
            System.out.println(newnum);
        }
    }
}