/*
对于一个int数组，请编写一个计数排序算法，对数组元素排序。
给定一个int数组A及数组的大小n，请返回排序后的数组。
测试样例：
[1,2,3,5,2,3],6
[1,2,2,3,3,5]
*/
//提交时间：2016-12-13 语言：Java 运行时间： 82 ms 占用内存：1213K 状态：答案正确
import java.util.*;
 
public class CountingSort {
   public static int[] countingSort(int[] A, int n){
        int min=A[0];
        int max=A[0];
        for(int i=1;i<n-1;i++){
            if(A[i]<min)
                min=A[i];
            if(A[i]>max)
                max=A[i];
        }
        int bucketlength=max-min+1;
        int[] bucket=new int[bucketlength];
        for(int i=0;i<n;i++){
            bucket[A[i]-min]++;
        }
        int index=0;
        for(int i=0;i<bucketlength;i++){
            //System.out.println(bucket[i]);
            for(int j=0;j<bucket[i];j++){
                A[index++]=i+min;
            }
        }
        return A;
    }
}