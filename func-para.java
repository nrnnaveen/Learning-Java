// parameterized function is a function
//  that accept input values (parameters)
//  to perform its task or computation

class calc{
    void add(int a,int b){
        int c = a+b;
        System.out.print("Sum of A : "+ a +" , B :"+ b +" Is : "+c) ;
    }
    public static void main (String args[]){
        calc obj = new calc();
        obj.add(10,20);

    }
}