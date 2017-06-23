/*
请设计一个高效算法，判断数组中是否有重复值。必须保证额外空间复杂度为O(1)。
给定一个int数组A及它的大小n，请返回它是否有重复值。
测试样例：
[1,2,3,4,5,5,6],7
返回：true
*/
//提交时间：2016-12-16 语言：Java 运行时间： 702 ms 占用内存：3900K 状态：答案正确
import java.util.*;
 
public class Checker {
    public boolean checkDuplicate(int[] a, int n) {
       for (int i = n / 2; i >= 0; i--) {
            heapSort(a, i);
        }
        for (int i = n - 1; i > 0; i--) {
            // System.out.println(Arrays.toString(a));
            swap(a, 0, i);
            heapSort(a, i);
            //System.out.println(Arrays.toString(a));
        }
        for (int i = 0; i < n - 1; i++) {
            if (a[i] == a[i + 1]) {
                return true;
            }
        }
        return false;
    }
 
    public static void heapSort(int[] A, int n) {
 
            int index = (n - 1) / 2;
            for (; index >= 0; index--) {
                int lchild = index * 2;
                int rchild = index * 2 + 1;
                if (rchild < n && A[rchild] > A[index]) {
                    swap(A, rchild, index);
                }
                if (A[lchild] > A[index]) {
                    swap(A, lchild, index);
                }
            }
        }
     
 
    static void swap(int[] A, int m, int n) {
        int temp = A[m];
        A[m] = A[n];
        A[n] = temp;
    }
}