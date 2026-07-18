// constructor in java 
// a constructor in java is a special method
//  that is used to initilize objects

// the constructor is called when
//  an object of a class is called / created

// like how many objects we creted like we create 3 objects
//  it execute / run three times(Constructor)

// Constructor is defined by name of the class

// see para constructor.java file

class hello {
    int num;    // i didt initilize these
                // but i print these using object 
    String Name; // it executes withou error it initilze it

    hello(){
        System.out.println("Hello World");

    }
    public static void main (String args [])
    {
        hello obj1 = new hello();
        System.out.println(obj1.num);
        System.out.println(obj1.Name);

    }
}

