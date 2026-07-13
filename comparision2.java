// for comaparing two integers we use == 
// ,Its Same For
//  All Primitive Data Types 
// ,But For Heaps ,its differ because for strings
//  we mention == it check for both string address 
// or same ,not compare the value for comparing 
// two stings we use .equls()
class hello{
    public static void main (String args[])
    {
        String a = "Hello";
        String b = "Hello";
        String c=b;
        System.out.print(a.equals(c));

    }
}

class hello{
    public static void main (String args[])
    {
        String a = "Hello"; //imagine its adress abc
        String b = "Hello"; // abc
        String c=b;
        System.out.print(a==c); // abc==abc

    }
}