/*
输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
*/
//提交时间：2017-01-16 语言：Java 运行时间： 34 ms 占用内存：528K 状态：答案正确
public class Solution {
    public int NumberOf1(int n) {
         int t=0;
         char[] a=Integer.toBinaryString(n).toCharArray();
         for(int i=0;i<a.length;i++){
             if(a[i]=='1'){
                 t++;
             }
         }
         return t;
        }
}

