// return keyword 
// void function didnt return anything 
// ex 17


class hello {
    int sum(){
        int a= 10;
        int b=20;
        int c = a+b;  // if we create an function like this in int method that must return an integer value
        return c ;
    }
    public static void main( String args[])
    {
        hello a = new hello();
        int tot = a.sum();
        System.out.print(tot);

    }
}