/*
����һ��int���飬���дһ�����������㷨��������Ԫ������
����һ��int����A������Ĵ�Сn���뷵�����������顣
��֤Ԫ�ؾ�С�ڵ���2000��
����������
[1,2,3,5,2,3],6
[1,2,2,3,3,5]
*/
//�ύʱ�䣺2016-12-15 ���ԣ�Java ����ʱ�䣺 100 ms ռ���ڴ棺1485K ״̬������ȷ
import java.util.*;
 
public class RadixSort {
    public static int[] radixSort(int[] A, int n) {
        for (int k = 1; k <= 100; k *= 10) {
            int[][] bucket = new int[10][n];
            int[] index = new int[10];
            for (int i = 0; i < n; i++) {
                // System.out.println("k="+k+",A[i]="+A[i]);
                // System.out.println((A[i]/k)%10+" "+index[(A[i]/k)%10]);
                bucket[(A[i] / k) % 10][index[(A[i] / k) % 10]++] = A[i];
                // System.out.println(Arrays.deepToString(bucket));
            }
            //System.out.println(Arrays.toString(index));
            //System.out.println(Arrays.deepToString(bucket));
            int temp = 0;
            for (int i = 0; i < 10; i++) {
                if (index[i] != 0) {
                    for (int j = 0; j < index[i]; j++) {
                        // if(index[j]>0){
                        // System.out.println("bucket[i][j]="+bucket[i][j]);
                        A[temp++] = bucket[i][j];
                        // }
                    }
                }
            }
            //System.out.println(Arrays.toString(A));
            // System.out.println("=============");
        }
        // System.out.println(Arrays.deepToString(bucket));
        return A;
    }
 
}