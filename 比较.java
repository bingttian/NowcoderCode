/*
对于两个32位整数a和b，请设计一个算法返回a和b中较大的。但是不能用任何比较判断。若两数相同，返回任意一个。
给定两个整数a和b，请返回较大的数。
测试样例：
1,2
返回：2
*/
//提交时间：2017-01-12 语言：Java 运行时间： 31 ms 占用内存：646K 状态：答案正确
import java.util.*;
 
public class Compare {
    public int getMax(int a, int b) {
        int c=a-b;
        int as=sign(a); //a的符号，1为非负，0为负
        int bs=sign(b);
        int cs=sign(a-b);
         
        int difab=as^bs;    //表示a和b是否符号不相同，不相同为1，相同为0
        int sameab=flip(difab);     //表示a和b是否符号相同，相同为1，不相同为0
         
        int returnA=difab*as+sameab*cs;
        int returnB=flip(returnA);
        return a*returnA+b*returnB;
    }
     
    public static int flip(int n){
        return n^1;
    }
     
    public static int sign(int n){
        return flip(n>>31&1);
    }
}