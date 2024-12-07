import java.util.*;
public class cgpa {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first subject marks");
        float i=sc.nextFloat();
        System.out.println("Enter second subject marks");
        float j=sc.nextFloat();
        System.out.println("Enter third subject marks");
        float k=sc.nextFloat();

        float cgpa=(i+j+k)/30;
        System.out.println("Your cgpa is :="+cgpa);
        System.out.println(cgpa);

    }
    
}
