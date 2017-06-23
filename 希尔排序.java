/*
对于一个int数组，请编写一个希尔排序算法，对数组元素排序。
给定一个int数组A及数组的大小n，请返回排序后的数组。保证元素小于等于2000。
测试样例：
[1,2,3,5,2,3],6
[1,2,2,3,3,5]
*/
//提交时间：2016-12-14 语言：Java 运行时间： 102 ms 占用内存：1232K 状态：答案正确
import java.util.*;
 
public class ShellSort {
    public static int[] shellSort(int[] A, int n) {
        int feet=n/2;
        while(feet>0){
            for(int i=feet;i<n;i++){
                int temp=A[i],j=0;
                for(j=i;j>0&&temp<A[j-1];j--){
                    //System.out.println("hi");
                    A[j]=A[j-1];
                }
                A[j]=temp;
            }
            feet=feet/2;
        }
        return A;
    }
     
    void swap(int[] A,int m,int n){
        int temp = A[m];
        A[m] = A[n];
        A[n] = temp;
    }
}