// create an class callled Addition
// this class should have two varriable
// a=10,b=20
// create a function callled sum which should 
// add a and b and print the total output.
// call that sum function in main method

class Addition {
    int a = 10;
    int b = 20;
    void Sum (){
        int C = a+b;
        System.out.println(" Total : "+C);
    }
    public static void main (String args[]){
        Addition obj = new Addition();
        obj.Sum();
    }
}