import java.util.*;
public class condition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
       int age=sc.nextInt();
       if(age>18){
            System.out.println("You can apply for the licsence");
         }
          else {
              System.out.println("You can't apply for lisence");
          }            
        }
    }

