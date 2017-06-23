/*
如果更快的求一个整数k的n次方。
如果两个整数相乘并得到结果的时间复杂度为O(1)，
得到整数k的N次方的过程请实现时间复杂度为O(logN)的方法。
给定k和n，请返回k的n次方，
为了防止溢出，请返回结果Mod 1000000007的值。
测试样例：
2,3
返回：8
*/
//提交时间：2017-01-04 语言：Java 运行时间： 37 ms 占用内存：729K 状态：答案正确
import java.util.*;
 
public class QuickPower {
    public int getPower(int k, int N) {
       if(k==0)
            return 0;
         
        long res=1;
        long modNum=1000000007;
        long temp=k;
         
        while(N>0){
            if(N%2==1){
                res*=temp;
            }
            temp=(temp*temp)%modNum;
            res=res%modNum;
            N=N/2;
        }
        return (int)res;
    }
}