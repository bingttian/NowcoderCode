/*
已知一个几乎有序的数组，几乎有序是指，如果把数组排好顺序的话，每个元素移动的距离可以不超过k，并且k相对于数组来说比较小。请选择一个合适的排序算法针对这个数据进行排序。
给定一个int数组A，同时给定A的大小n和题意中的k，请返回排序后的数组。
测试样例：
[2,1,4,3,6,5,8,7,10,9],10,2
返回：[1,2,3,4,5,6,7,8,9,10]
*/
//提交时间：2016-12-15 语言：Java 运行时间： 558 ms 占用内存：4941K 状态：答案正确
import java.util.*;
 
public class ScaleSort {
    public static int[] sortElement(int[] A, int n, int k) {
        /*
         * 给定一个排列堆的区间(从i到k+i)，在里面找到min 然后i++，区间向后移动1，直到i=n
         */
        for (int i = 0; i < n; i++) {
            //System.out.println("i="+i);
            if(k+i-1>=n){
                //System.out.println("hi");
                k--;
            }
            if(i!=n-2){
                adjust(A, i, k + i - 1,k);
            }  
            //System.out.println(Arrays.toString(A));
        }
        return A;
    }
 
    public static void adjust(int[] A, int start, int end,int len) {
        //System.out.println("start="+start+",end="+end);
        //System.out.println("len="+len);
        int index = (len - 1)/ 2;
        for (; index >= 0; index--) {
            int lchild = index * 2 ;
            int rchild = index * 2+1;
            if (rchild <len && A[rchild+start] < A[index+start]) {
                swap(A, rchild+start, index+start);
            }
            //System.out.println(lchild+start);
            if (A[lchild+start] < A[index+start]) {
                //System.out.println("temp[index]="+temp[index]+",temp[lchild]="+temp[lchild]);
                swap(A, lchild+start, index+start);
            }
            //System.out.println(Arrays.toString(A));
        }
        //System.out.println(Arrays.toString(A));
    }
 
    static void swap(int[] A, int m, int n) {
        int temp = A[m];
        A[m] = A[n];
        A[n] = temp;
    }
}