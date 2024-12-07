import java.util.*;
public class Arrays {
    public static void main(String[] args) {
    int matrix[][]={{1,2,3},
                    {4,5,6}};
    int matrix1[][]={{3,2,1},
                    {6,5,4}};
    int result[][]={{0,0,0},
                    {0,0,0}};
 for(int i=0;i<matrix.length;i++){
    for(int j=0;j<matrix[i].length;j++){
        result[i][j]=matrix[i][j]+matrix1[i][j];
 System.out.print(result[i][j]+" ");
    }
System.out.println(" ");
}
                }
}
