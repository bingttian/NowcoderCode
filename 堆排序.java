/*
对于一个int数组，请编写一个堆排序算法，对数组元素排序。
给定一个int数组A及数组的大小n，请返回排序后的数组。
测试样例：
[1,2,3,5,2,3],6
[1,2,2,3,3,5]
*/
//提交时间：2017-01-04 语言：Java 运行时间： 105 ms 占用内存：1232K 状态：答案正确
import java.util.*;
 
public class HeapSort {
    public int[] heapSort(int[] A, int n) {
        for(int i=n/2;i>=0;i--){
            heapAdjust(A,i,n);
        }
        for(int i=n-1;i>0;i--){
            swap(A,0,i);
            heapAdjust(A,0,i);
        }
        return A;
    }
    private static void swap(int[] A, int i, int j) {
        int temp=A[i];
        A[i]=A[j];
        A[j]=temp;
    }
    private  static void heapAdjust(int[] heap, int parent, int len) {
        int child = 2*parent+1;
           while(child<len){
               //这个 if 判断注意一下，首先子元素不能越界
               if((child+1)<len && heap[child]<heap[child+1]){
                   child = child+1;
               }
                  
               if(heap[parent]>heap[child]){
                   break;
               }else{
                   swap(heap, parent, child);
               }
               parent = child;
             child = 2*parent+1;
           }
    }
}