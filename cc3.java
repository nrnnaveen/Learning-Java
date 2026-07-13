import java.util.Scanner;
class hello {
    public static void main (String args[])
    {
        Scanner Input = new Scanner(System.in);
        int N = Input.nextInt();
        if(N%3==0 && N%5==0){
            System.out.println(N+" Yes it is Divisible By Both 5 And 3");

        }
        else{
            System.out.print(N+" It's Not Divisible By Both 5 And 3");
        }
    }
}