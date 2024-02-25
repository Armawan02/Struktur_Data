package Armawan;
import java.util.Arrays;
public class ArrayExample {
    public static void main(String[] args) {
        System.out.println("1. Type Data Primitif 1 Dimensi");
      int a [] = {1,2,3,4,5};
            System.out.println(Arrays.toString(a));
        System.out.println("2. Type Data Non Primitif 1 Dimensi");
        String b []= {"Armawan","Mawan","Awan"};
          System.out.println(Arrays.toString(b));  
        System.out.println("3. Type Data Primitif 2 Dimensi");
        int[][] c = {
            {2,4},
            {224,2004}
        };
        for(int i = 0; i < c.length ;i++){
            for(int j = 0; j < c.length;j++){
            System.out.print(c[i][j]+" ");
            }
        }  
        
    }
}
