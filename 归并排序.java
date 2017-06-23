/*
对于一个int数组，请编写一个归并排序算法，对数组元素排序。
给定一个int数组A及数组的大小n，请返回排序后的数组。
测试样例：
[1,2,3,5,2,3],6
[1,2,2,3,3,5]
*/
//提交时间：2016-12-12 语言：Java 运行时间： 96 ms 占用内存：1233K 状态：答案正确
import java.util.*;
  
public class MergeSort {
    public int[] mergeSort(int[] A, int n) {
            sort(A, 0, n - 1);
        return A;
    }
 
    public static void sort(int[] A, int left, int right) {
        if (left < right) {
            int mid = (right + left) / 2;
            sort(A, left, mid);
            sort(A, mid + 1, right);
            merge(A, left, mid, right);
        }
    }
 
    public static void merge(int[] A, int left, int mid, int right) {
        //System.out.println(Arrays.toString(A));
        int[] tempArr = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int temp = 0;
        while (i <= mid && j <= right) {
            if (A[i] < A[j]) {
                tempArr[temp++] = A[i++];
            } else {
                tempArr[temp++] = A[j++];
            }
        }
        while (i <= mid) {
            tempArr[temp++] = A[i++];
        }
        while (j <= right) {
            tempArr[temp++] = A[j++];
        }
        int num = 0;
        //System.out.println(Arrays.toString(tempArr));
        while ((num + left) <= right) {
            A[num + left] = tempArr[num++];
        }
 
    }
}