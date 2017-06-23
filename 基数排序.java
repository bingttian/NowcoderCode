/*
对于一个int数组，请编写一个基数排序算法，对数组元素排序。
给定一个int数组A及数组的大小n，请返回排序后的数组。
保证元素均小于等于2000。
测试样例：
[1,2,3,5,2,3],6
[1,2,2,3,3,5]
*/
//提交时间：2016-12-15 语言：Java 运行时间： 100 ms 占用内存：1485K 状态：答案正确
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