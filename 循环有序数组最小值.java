/*
对于一个有序循环数组arr，返回arr中的最小值。
有序循环数组是指，有序数组左边任意长度的部分放到右边去，
右边的部分拿到左边来。比如数组[1,2,3,3,4]，是有序循环数组，[4,1,2,3,3]也是。
给定数组arr及它的大小n，请返回最小值。
测试样例：
[4,1,2,3,3],5
返回：1
*/
//提交时间：2016-12-07 语言：Java 运行时间： 56 ms 占用内存：969K 状态：答案正确
import java.util.*;
 
public class MinValue {
      public int getMin(int[] arr, int n) {
        if(n==0||arr== null)
            return -1;
        int left = 0;
        int right = n-1;
        int mid = (left+right)/2;
        if(arr[left]<arr[right]){
            return arr[left];
        }
          
        while(left < right){
                mid = (left+right)/2;
                if(arr[left]>arr[mid])
                    right =mid;
                else if(arr[mid]>arr[left])
                    left = mid;
                else {
                    mid++;
                    break;
                }
        }
              
      
        return arr[mid];
    }
}