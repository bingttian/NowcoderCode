/*
一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
求该青蛙跳上一个n级的台阶总共有多少种跳法。
*/
//提交时间：2016-12-06 语言：Java 运行时间： 31 ms 占用内存：629K 状态：答案正确
public class Solution {
    public int JumpFloorII(int target) {
        int sum=1;
        for(int i=1;i<target;i++){
            sum=2*sum;
        }
             return sum;
    }
}