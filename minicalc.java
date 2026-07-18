import java.util.Scanner;
class calc{
    void add(int a,int b){
        System.out.println("Addition of "+a+" + "+b+" = "+(a+b));
        System.out.println("");
      
    }
    void sub(int a,int b){
        System.out.println("Substraction  of "+a+" - "+b+" = "+(a+b));
        System.out.println("");
        
    }
    void mul(int a,int b){
        System.out.println("Multiplication of "+a+" * "+b+" = "+(a+b));
        System.out.println("");
        
    }
    void div(int a,int b){
        System.out.println("Divition of "+a+" / "+b+" = "+(a+b));
        System.out.println("");
        
    }

    public static void main (String args[]){
        Scanner Input = new Scanner(System.in);
        calc a = new calc();
        int choice = -1 ;
        while (choice != 0){
            System.out.println(" Mini Calculator");
            System.out.println("1.Add(+)");
            System.out.println("2.Sub(-)");
            System.out.println("3.Mul(*)");
            System.out.println("4.Div(/)");
            System.out.print("Enter Your Choice : ");
            choice = Input.nextInt();
            if (choice == 1){
                System.out.print("Enter n1 : ");
                int n1 =Input.nextInt();
                System.out.print("Enter n2 : ");
                int n2 = Input.nextInt();
                a.add(n1,n2);
            }
            else if (choice == 2){
                System.out.print("Enter n1 : ");
                int n1 =Input.nextInt();
                System.out.print("Enter n2 : ");
                int n2 = Input.nextInt();
                a.sub(n1,n2);
            }
            else if (choice == 3){
                System.out.print("Enter n1 : ");
                int n1 =Input.nextInt();
                System.out.print("Enter n2 : ");
                int n2 = Input.nextInt();
                a.mul(n1,n2);
            }
            else if (choice == 4){
                System.out.print("Enter n1 : ");
                int n1 =Input.nextInt();
                System.out.print("Enter n2 : ");
                int n2 = Input.nextInt();
                a.div(n1,n2);
            }
            else if (choice == 0){
                System.out.print("Exiting... Bye !!!");
            }
            else{
                System.out.println("Invalid Choice Try Again");
            }
        }
        
    }
}