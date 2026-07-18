class demo {
    String getname(){
        String Name = "Naveen";
        return Name ;
    }
    double getphone(){
        double num = 63.81412880 ;
        return num;
    }
    public static void main (String args[])
    {
        demo obj1 = new demo();
        double a=obj1.getphone();
        String b=obj1.getname();
        System.out.println(b);
        System.out.println(a);
    }
}