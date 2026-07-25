class college {
    void dept(){
      System.out.println("welcome to excel engineering college");
    }
}
class cse extends college{
    void dept(){
    System.out.println("welcome to computer science dept");
    }
}
class ece extends college{
    void dept(){
 System.out.println("welcome to electronic and communication");
    }
}
class ai_ds extends college{
    void dept(){
    System.out.println("welcome to ai and data science dept");
    }
}
public class Main {
    public static void main(String[] args){
        college c=new cse();
        c.dept();
        college d=new ece();
        d.dept();
        college e=new ai_ds();
        e.dept();
    }
}
