// pass parameters threw the constructors
// its like same as function like we can create many 
// constructors but parameters must varry 
// this is constructor overloading same as method overloading


class hello{
    hello(int a,int b){         //
        System.out.println(a+b);

    }
    public static void main (String args[])
    {
        hello obj1 = new hello(20,10); //
    }

}