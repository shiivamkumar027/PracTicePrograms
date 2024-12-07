import java.util.*;
public class chapter4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       int marks1=300;
       System.out.println("Enter your Sub1 marks");
       int a=sc.nextInt();
       System.out.println("Enter your sub2 marks");
       int b=sc.nextInt();
       System.out.println("Enter your sub3 marks");
       int c=sc.nextInt();

       int percentage=(a+b+c)*100/marks1;
       System.out.println("Your percentage is: "+percentage);
       if(a>=33 && b>=33 && c>=33 && percentage>=40){
           System.out.println("Final result:Pass");
        }else{
            System.out.println("Final result:fail");
        }
       }


    
    }

