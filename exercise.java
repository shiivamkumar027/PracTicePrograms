import java.util.Scanner;
public class exercise {
public static void main(String[] args) {
int arr[][]={{2,3,5},{2,3,5}};
int arr2[][]={{2,2,4},{2,3,5}};
   int result[][]={{0,0,0},{0,0,0}};
for(int i=0;i<arr.length;i++){
   for(int j=0;j<arr.length;j++){
      System.out.format(i,j);
      result[i][j]=arr[i][j]+arr[i][j];
}
}


   }
}