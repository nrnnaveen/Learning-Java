
class Laptop {           // class
    String Name = "";
    String Proc = "";
    int ram = 0;           // use this blue print to create many laptops
    int Price = 0;


    public static void main (String args[])
    {
        Laptop lap1 = new Laptop();
        lap1.Name = "HP";
        lap1.Proc="i3";
        lap1.ram = 6;        // obj 1
        lap1.Price = 40000;

        Laptop lap2 = new Laptop();
        lap2.Name = "Lenova";  // obj 2
        lap2.Proc="i5";
        lap2.ram = 8;
        lap2.Price = 90000;

        Laptop lap2 = new Laptop();
        lap3.Price = 12,          // obj 3 these are copy of the classes like we use these object to modify class

        System.out.println(lap1.Price);
        System.out.println(lap2.Price);
        System.out.println(lap3.Price);

        

    }
}