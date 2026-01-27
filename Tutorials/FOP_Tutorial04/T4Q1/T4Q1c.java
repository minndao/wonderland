package T4Q1;
import java.util.Random;
public class T4Q1c {
    public static void main(String[] args) {
       Random rd = new Random();
       int a = 4;
       int b = 5;
       int[][] matrix = new int[a][b];

       
       for (int i = 0; i < a; i++){
        for (int j = 0; j < b; j++){
            matrix[i][j] = rd.nextInt(101);

        }
       } 
       for (int i  = 0; i <4; i++){
        for (int j = 0; j <5; j++){
            System.out.printf("%-4d",matrix[i][j]);
        }
       
System.out.println();



    }}}