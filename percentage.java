import java.util.*;

public class percentage {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter First subject Marks");
        float a=sc.nextFloat();
        System.out.println("Enter second subject Marks");
        float b=sc.nextFloat();
        System.out.println("Enter Third subject Marks");
        float c=sc.nextFloat();
        System.out.println("Enter Fourth subject Marks");
        float d=sc.nextFloat();
        System.out.println("Enter fifth subject Marks");
        float e=sc.nextFloat();
        float percentage =(a+b+c+d+e)*(100)/(500);
        //where 500 is totl marks
        System.out.println("Percentage Marks");
        System.out.println(percentage);

    }
    
}
