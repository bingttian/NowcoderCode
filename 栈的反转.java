/*
实现一个栈的逆序，但是只能用递归函数和这个栈本身的pop操作来实现，而不能自己申请另外的数据结构。
给定一个整数数组A即为给定的栈，同时给定它的大小n，请返回逆序后的栈。
测试样例：
[4,3,2,1],4
返回：[1,2,3,4]
*/
//提交时间：2016-12-22 语言：Java 运行时间： 124 ms 占用内存：1781K 状态：答案正确
import java.util.*;
 
public class StackReverse {
   public static int[] reverseStack(int[] A, int n) {
        Stack<Integer> s=new Stack<Integer>();
        for(Integer a:A){
            s.push(a);
        }
        for(int i=0;i<n;i++){
            A[i]=s.pop();
        }
        return A;
    }
     
}