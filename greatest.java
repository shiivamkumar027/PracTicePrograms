import java.util.*;

public class greatest {
public static void main(String arg[])
{
    Scanner sc=new Scanner(System.in);
    System.out.print("Input numbers");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    if(a>b&a>c)
    {
        System.out.println("a is greator");
    }
    else if(b>a&b>c)
{
    System.out.println("b is greator");

}else if (c>a&c>b)
{
    System.out.println("c is greator");
}else
{
    System.out.println("equal values");
}
    
}
    }
    
