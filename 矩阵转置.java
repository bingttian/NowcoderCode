/*
����һ��N*N�ľ��󣬽���ת�ú������
Ҫ�󣺲���ʹ���κ�����(�͵�����)��
*/
//�ύʱ�䣺2016-12-06 ���ԣ�Java ����ʱ�䣺 420 ms ռ���ڴ棺4611K ״̬������ȷ
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