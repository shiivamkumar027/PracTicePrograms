import java.util.*;
public class multtable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number =");
       int n=sc.nextInt();
       int sum=0;
        for(int i=1;i<=10;i++){
    sum +=n*i;
        }
        System.out.println("the Total sum is = "+sum);   
}
}