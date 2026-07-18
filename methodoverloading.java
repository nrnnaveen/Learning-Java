// method overloading

// functions name can be same
// but parameter must be differ

class demo{
    void display(){
        System.out.print("Hello World");
    }
    void display(int a){
        System.out.print("World");
    }
    public static void main (String args[]){
        demo obj = new demo();
        obj.display(10);
    }
}


