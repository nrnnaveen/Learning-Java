// Functions In Java

// like if we want to call any person we call 
// them by their name like that in functions 
// we call functios by their name

// We Can directly Call One Satic Funtion in another Static Function ,
// Not Able To  directly Call Non Static Function 
// Similiarly We  We Can directly Call One Non Satic Funtion in Another Non Static Function ,
// Not Able To directly Call  the Static Function

// ex 14 , ex 15 , ex 16

public class demo {
    static void greeting() {

        System.out.println("Welcome");
        // dummy();

    }
    void dummy(){
        System.out.println("Iam Dummy");
    }

    public static void main (String args []){

        demo obj1 = new demo();
        greeting();
        obj1.dummy();

    }



    

}

// we cant able to call static to non static
//  function directly so we create objects and 
// use them  to call them