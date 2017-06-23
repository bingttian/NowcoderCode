/*
编写一个类,只能用两个栈结构实现队列,支持队列的基本操作(push，pop)。
给定一个操作序列ope及它的长度n，其中元素为正数代表push操作，
为0代表pop操作，保证操作序列合法且一定含pop操作，请返回pop的结果序列。
测试样例：
[1,2,3,0,4,0],6
返回：[1,2]
*/
//提交时间：2016-12-22 语言：Java 运行时间： 88 ms 占用内存：1285K 状态：答案正确
import java.util.*;
 
public class TwoStack {
  static Stack<Integer> stackpush=new Stack<Integer>();
    static Stack<Integer> stackpop=new Stack<Integer>();
     
    public static int[] twoStack(int[] ope, int n) {
        int index=0;
        for(int i=0;i<n;i++){
            if(ope[i]==0){
                index++;
            }else{
                stackpush.push(ope[i]);
            }
        }
        int[] res=new int[index];
        int num=0;
        for(;index>0;index--){
            res[num++]=pop();
        }
        return res;
    }
     
    public static int pop(){
        while(!stackpush.isEmpty()){
            stackpop.push(stackpush.pop());
        }
        return stackpop.pop();
    }
}