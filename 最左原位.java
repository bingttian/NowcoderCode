/*
有一个有序数组arr，其中不含有重复元素，
请找到满足arr[i]==i条件的最左的位置。
如果所有位置上的数都不满足条件，返回-1。
给定有序数组arr及它的大小n，请返回所求值。
测试样例：
[-1,0,2,3],4
返回：2
*/
//提交时间：2017-01-03 语言：Java 运行时间： 51 ms 占用内存：964K 状态：答案正确
import java.util.*;
 
public class Find {
    public int findPos(int[] arr, int n) {
       if(arr[n-1]<0||arr[0]>n-1){
            return -1;
        }
        int res=-1;
        int left=0;
        int right=n-1;
        int mid=left+(right-left)/2;
        while(left<=right){
            if(arr[mid]==mid){
                res=mid;
                right=mid-1;
                mid=left+(mid-left)/2;
            }else if(arr[mid]<mid){
                left=mid+1;
                mid=left+(right-left)/2;
            }else if(arr[mid]>mid){
                right=mid-1;
                mid=left+(right-left)/2;
            }
        }
        return res;
    }
}