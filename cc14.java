// Print The Number Which Are Divisible By Both 3 and 3
// range 1 to 100
class demo{
    public static void main(String args[])
    {
        for (int i=1;i<=100;i=i+1){
            if (i%3==0 && i%5==0){
                System.out.println(i);
            }
        }
    }
}