/*
对于一个int数组，请编写一个插入排序算法，对数组元素排序。
给定一个int数组A及数组的大小n，请返回排序后的数组。
测试样例：
[1,2,3,5,2,3],6
[1,2,2,3,3,5]
*/
//提交时间：2017-01-05 语言：Java 运行时间： 96 ms 占用内存：1087K 状态：答案正确
import java.util.*;
 
public class InsertionSort {
    public int[] insertionSort(int[] A, int n) {
        for(int after=1;after<n;after++){
            int temp=A[after];
            for(int before=after -1;before>=0;before--){
                if(A[before]>A[after]){
                    A[after]=A[before];
                    A[before]=temp;
                    after--;
                }
            }
        }
        return A;
    }
}