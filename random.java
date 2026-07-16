// generate random number  3:55
import java.util.Random;
class demo{
    public static void main (String args[])
    {
        Random rand = new Random(10);
        int newnum=rand.nextInt();
        System.out.println(newnum);
    }
}