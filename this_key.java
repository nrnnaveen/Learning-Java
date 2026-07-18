// This Key Word In Java

// the this keyword reffers to the 
// current object in a method or constructor.

// the most common use of the this keyword 
// is to eliminate the confusion between class 
// atributes and parameters with the same name.



class hello{
    String name;

    void display(String name){
        this.name=name;

    }
    public static void main (String args[])
    {
        hello obj1 = new hello();
        System.out.println(obj1.name)
    }
}

// like we print the name in the constructor 
// using object ,we didnt assign any value so 
// it value will be default null  we print 
// that using object so it prints null 
// after assign the same name in another func 
// so for that we use this keyword 
