import java.util.*;

public class positive {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Input Number:");
        int input = sc.nextInt();
        if(input>0)
        {
            System.out.println("Number is positive");
          } 
          else if(input<0)
          {
            System.out.println("Number is negative");
          }
          else
          {
            System.out.println("Number is zero");
          }
        }
    }

