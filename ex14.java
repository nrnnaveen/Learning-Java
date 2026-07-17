// mobile class , phone functiones 
 class Mobile{
    void iphone(){
        System.out.println("This Is Iphone");
        
    }
    void Android() {
        System.out.println("This Is Android");
        Realme();
    }
    void Realme() {
        System.out.println("Its Me Realme");

    }
     public static void main (String args[])
    {
        Mobile obj1 = new Mobile();
        obj1.iphone();
        obj1.Android();
    }

}