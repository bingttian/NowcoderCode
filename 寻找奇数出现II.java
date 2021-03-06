/*
给定一个整型数组arr，其中有两个数出现了奇数次，其他的数都出现了偶数次，找到这两个数。
要求时间复杂度为O(N)，额外空间复杂度为O(1)。
给定一个整形数组arr及它的大小n，请返回一个数组，
其中两个元素为两个出现了奇数次的元素,请将他们按从小到大排列。
测试样例：
[1,2,4,4,2,1,3,5],8
返回：[3,5]
*/
//提交时间：2017-01-12 语言：Java 运行时间： 70 ms 占用内存：1378K 状态：答案正确
import java.util.*;
 
public class OddAppearance {
    public int[] findOdds(int[] arr, int n) {
       int[] res=new int[2];
        for(int i=0;i<n;i++){
            res[0]^=arr[i];
        }
        int pos=0;
        while(((res[0]>>pos) & 1) !=1){
            pos++;
        }
        for(int i=0;i<n;i++){
            if(((arr[i]>>pos)&1)!=1){
                res[1]^=arr[i];
            }
        }
        res[0]=res[0]^res[1];
        if(res[0]>res[1]){
            res[0]=res[0]^res[1];
            res[1]=res[0]^res[1];
            res[0]=res[0]^res[1];
        }
        return res;
    }
 
}