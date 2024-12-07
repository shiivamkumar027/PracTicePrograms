public class methods {
  static  int Logic(int x,int y) {
    int z;
    if(x>y){
      z=x+y;
 }else{
    z=(x+y)*5;
 }
    return z; 

} 
public static void main(String[]args){
    int a=4;
    int b=5;
    int c;
   c=Logic(a,b);
System.out.println("Your output will be: "+Logic(a,b));
}
}