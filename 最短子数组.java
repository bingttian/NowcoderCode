/*
对于一个数组，请设计一个高效算法计算需要排序的最短子数组的长度。
给定一个int数组A和数组的大小n，请返回一个二元组，代表所求序列的长度。
(原序列位置从0开始标号,若原序列有序，返回0)。保证A中元素均为正整数。
测试样例：
[1,4,6,5,9,10],6
返回：2
*/
提交时间：2016-12-16 语言：Java 运行时间： 40 ms 占用内存：603K 状态：答案正确
import java.util.*;
 
public class Subsequence {
    public int shortestSubsequence(int[] A, int n) {
        int len=0;
        int max=A[0];
        int min=A[n-1];
        int templ=0,tempr=0;
        for(int i=0;i<n;i++){
            if(max<A[i]){
                max=A[i];
            }else if(max>A[i]){
                templ=i;
            }
        }
        for(int i=n-1;i>=0;i--){
            if(min>A[i]){
                min=A[i];
            }else if(min<A[i]){
                tempr=i;
            }
        }
        //System.out.println(templ+" "+tempr);
        if(templ==0&&tempr==0){
            return 0;
        }
        len=templ-tempr+1;
        return len;
    }
}