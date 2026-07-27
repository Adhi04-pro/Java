 public class Main{
        public static void main(String[]args){
        abstract class payment{
    abstract void pay();
    void receipt(){
        System.out.println("receipt generated");
    }
} 
class upi extends payment{
    void pay(){
System.out.println("paid using upi");
            
    }
}
class card extends payment{
    void pay(){
        System.out.println("paid using card");
        
    }
}
}
