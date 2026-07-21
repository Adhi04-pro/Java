import java.util.*;

public class Main {
    public static void main(String[] args) {
       int [] marks={50,60,70,80,90};
       String []subject={"tamil","english","maths","science","social"};
       for(int i=0;i<marks.length;i++)
       {
           System.out.println(subject[i]+"="+marks[i]);
       }
    }
}
