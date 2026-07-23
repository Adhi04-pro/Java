class parent{
      void display(){
    System.out.println("this is the parent class");
    }
}
class child extends parent
{
    void show()
    {
        System.out.println("this is child class");
    }
}
 public class Main {
    public static void main(String[] args){
        child obj=new child();
        obj.display();
        obj.show();
    }
}
