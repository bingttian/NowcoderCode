/*
定义局部最小的概念。
arr长度为1时，arr[0]是局部最小。
arr的长度为N(N>1)时，如果arr[0]<arr[1]，那么arr[0]是局部最小；
如果arr[N-1]<arr[N-2]，那么arr[N-1]是局部最小；
如果0<i<N-1，既有arr[i]<arr[i-1]又有arr[i]<arr[i+1]，那么arr[i]是局部最小。 
给定无序数组arr，已知arr中任意两个相邻的数都不相等，
写一个函数，只需返回arr中任意一个局部最小出现的位置即可。
*/
//提交时间：2016-12-07 语言：Java 运行时间： 46 ms 占用内存：755K 状态：答案正确
public class Solution {
    public int getLessIndex(int[] arr) {
        if(arr == null || arr.length == 0)
            return -1;
        if(arr.length == 1 || arr[0] < arr[1]) {
            return 0;
        }
        if(arr[arr.length - 1] < arr[arr.length - 2]) {
            return arr.length - 1;
        }
        int left=1;
        int right=arr.length-2;
        int mid=0;
        while(left<right){
            mid=left+(right-left)/2;
            if(arr[mid-1]<arr[mid]){
                right=mid-1;
            }else if(arr[mid+1]<arr[mid]){
                left=mid+1;
            }else{
                return mid;
            }
             
        }
        return right;
    }
}
