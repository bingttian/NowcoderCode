/*
有一个只由0，1，2三种元素构成的整数数组，
请使用交换、原地排序而不是使用计数进行排序。
给定一个只含0，1，2的整数数组A及它的大小，请返回排序后的数组。
保证数组大小小于等于500。
测试样例：
[0,1,1,0,2,2],6
返回：[0,0,1,1,2,2]
*/
//提交时间：2016-12-16 语言：Java 运行时间： 161 ms 占用内存：1906K 状态：答案正确
import java.util.*;
 
public class ThreeColor {
    public int[] sortThreeColor(int[] A, int n) {
    int right=n-1;
        int left=0;
        for(int i=0;i<=right;i++){
            if(A[i]==0){
                swap(A, i, left);
                left++;
                //System.out.println(i);
                //System.out.println(Arrays.toString(A));
            }
            if(A[i]==2){
                System.out.println(i);
                swap(A, i, right);
                right--;
                i--;
                //System.out.println(Arrays.toString(A));
            }
        }
        return A;
    }
     
    static void swap(int[] A, int m, int n) {
        int temp = A[m];
        A[m] = A[n];
        A[n] = temp;
    }
}