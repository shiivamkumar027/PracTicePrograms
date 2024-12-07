import java.util.*;
public class reversearray {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        boolean isSorted=true||false;
   int data[]={16,12,13,14,15};
   for(int i=0;i<data.length;i++){
     if(data[i]<data[i+1]){
    isSorted=true;
    break;
     }
    if(data[i]>data[i+1]){
        isSorted=false;
    break;
    }  
}    
    if(isSorted){
        System.out.println("Array is sorted");
    }else{
        System.out.println("Array is not sorted");
    }
    

    }
}
