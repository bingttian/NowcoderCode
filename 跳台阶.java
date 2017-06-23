/*
一只青蛙一次可以跳上1级台阶，也可以跳上2级。
求该青蛙跳上一个n级的台阶总共有多少种跳法。
*/
//提交时间：2017-01-16 语言：Java 运行时间： 28 ms 占用内存：629K 状态：答案正确
public class Solution {
    public int JumpFloor(int target) {
      int f1=1,f2=2,f3=0,i=3;
        if(target==1){
            return 1;
            }
        if(target==2){
            return 2;
            }
        while(i<=target){
            f3=f1+f2;
            f1=f2;
            f2=f3;
            i++;
        }
        return f3;
    }
}