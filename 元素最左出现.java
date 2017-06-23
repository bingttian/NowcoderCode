/*
对于一个有序数组arr，再给定一个整数num，
请在arr中找到num这个数出现的最左边的位置。
给定一个数组arr及它的大小n，同时给定num。
请返回所求位置。若该元素在数组中未出现，请返回-1。
测试样例：
[1,2,3,3,4],5,3
返回：2
*/
//提交时间：2016-12-07 语言：Java 运行时间： 54 ms 占用内存：1009K 状态：答案正确
import java.util.*;
 
public class LeftMostAppearance {
    public static int findPos(int[] arr, int n, int num) {
        int left=1;
        int right=n;
        int mid=0;
        int res=-1;
        if(arr[n-1]==num)
            return n-1;
        if(arr[0]==num)
            return 0;
        while(left<=right){
            mid=left+(right-left)/2;
            if(arr[mid-1]<=num){
                if(arr[mid-1]==num){
                    res=mid-1;
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }else{
                right=mid-1;
            }
        }
        return res;
   }
}