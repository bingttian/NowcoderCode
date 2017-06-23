/*
输入一个N*N的矩阵，将其转置后输出。
要求：不得使用任何数组(就地逆置)。
*/
//提交时间：2016-12-06 语言：Java 运行时间： 420 ms 占用内存：4611K 状态：答案正确
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
     while (input.hasNextInt()) {
        int n=input.nextInt();
        int[][] a=new int[n][n];
        int[][] b=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=input.nextInt();   
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                b[j][i]=a[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==n-1)
                    System.out.println(b[i][j]);
                else System.out.print(b[i][j]+" ");
            }
        }
     }
   }                               
}