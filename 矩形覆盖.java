/*
我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
*/
//提交时间：2017-01-16 语言：Java 运行时间： 34 ms 占用内存：629K 状态：答案正确
public class Solution {
    public int RectCover(int target) {
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