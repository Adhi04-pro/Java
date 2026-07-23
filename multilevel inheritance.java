
class grandpa{
      void display(){
    System.out.println("my grandfather is a farmer");
    }
}
class daddy extends grandpa{
    void show(){
        System.out.println("my father is a businessman");
    }
}
class me extends daddy
{
    void display1()
    {
        System.out.println("iam a player");
    }
}
 public class Main {
    public static void main(String[] args){
        me obj=new me();
        obj.display();
        obj.show();
        obj.display1();
    }
}
