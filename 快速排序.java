/*
对于一个int数组，请编写一个快速排序算法，对数组元素排序。
给定一个int数组A及数组的大小n，请返回排序后的数组。
测试样例：
[1,2,3,5,2,3],6
[1,2,2,3,3,5]
*/
//提交时间：2016-12-14 语言：Java 运行时间： 95 ms 占用内存：1213K 状态：答案正确
import java.util.*;
 
public class QuickSort {
    public int[] quickSort(int[] A, int n) {
        process(A, 0, n-1);
        return A;
    }
     
    public static void process(int[] A,int left,int right){
        if(left<right){
            int mid=sort(A, left, right);
            process(A, left, mid);
            process(A, mid+1, right);
        }
    }
 
    public static int sort(int[] A,int left,int right){
        int key=A[left];
        int i=left;
        int j=right;
        while(i<j){
            while(i<j){
                if(A[j]<key){
                    int temp=A[i];
                    A[i]=A[j];
                    A[j]=temp;
                    i++;
                    break;
                }else{
                    j--;
                }
            }
            while(i<j){
                if(A[i]>key){
                    int temp=A[i];
                    A[i]=A[j];
                    A[j]=temp;
                    j--;
                    break;
                }else{
                    i++;
                }
            }
        }
        return i;
    }
}