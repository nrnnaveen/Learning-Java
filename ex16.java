// create a class called garden 
// this class shpould have two varriables
// aaple-price=20
//apple-counr=5
// create a function called total-money
//  which should multiply the count with
//  price and display the total ammount

class garden {
    int apple_price = 20;
    int apple_count = 5;
    void total_money (){
        int total = apple_price*apple_count;
        System.out.println(" Total Ammount : "+total);
    }
    public static void main (String args[]){
        garden obj = new garden();
        obj.total_money();
    }
}