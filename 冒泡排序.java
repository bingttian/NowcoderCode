/*
对于一个int数组，请编写一个冒泡排序算法，对数组元素排序。
给定一个int数组A及数组的大小n，请返回排序后的数组。 
测试样例：
[1,2,3,5,2,3],6
[1,2,2,3,3,5]
*/
//提交时间：2016-12-11 语言：Java 运行时间： 86 ms 占用内存：1214K 状态：答案正确
import java.util.*;
 
public class BubbleSort {
    public int[] bubbleSort(int[] A, int n) {
        int temp=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                if(A[j]>A[j+1]){
                    temp=A[j+1];
                    A[j+1]=A[j];
                    A[j]=temp;
                }
            }
        }
        return A;
    }
}