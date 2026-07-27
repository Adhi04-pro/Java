abstract class payment{
    protected double amount;
    payment(double amount){
        this.amount=amount;
    }
//abstract Method
abstract void pay();
//normal Method
void receipt(){
    System.out.println("receipt generated");
    System.out.println("amount paid:"+amount);
}
//normal Method
void showpaymentstatus(){
    System.out.print("payment successful");
}
}
class upipayment extends payment{
    private String upiid;
    upipayment(double amount,String upiid){
        super(amount);
        this.upiid=upiid;
    }
    @Override
    void pay(){
        System.out.println("processing upipayment....");
        System.out.println("upiid:"+upiid);
    }
}
    class cardpayment extends payment{
        private String cardnumber;
        cardpayment (double amount,String cardnumber){
            super(amount);
            this.cardnumber=cardnumber;
        }
        @Override
        void pay(){
            System.out.println("processing cardpayment");
            System.out.println("cardnumber:**** **** ****"+cardnumber.substring(cardnumber.length()-4));
    }
    }
    public class Main{
        public static void main(String[]args){
     payment p1=new upipayment(550.75,"adhi@oksbi");
     payment p2=new cardpayment(1250.50,"1234567812345678");
     p1.pay();
     p2.receipt();
     p1.showpaymentstatus();
     System.out.println();
     p2.pay();
     p2.receipt();
     p2.showpaymentstatus();
        }
        }

