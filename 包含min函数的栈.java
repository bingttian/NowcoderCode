/*
定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
*/
//提交时间：2016-12-22 语言：Java 运行时间： 33 ms 占用内存：503K 状态：答案正确
import java.util.Stack;
 
public class Solution {
 
    static Stack<Integer> stackData=new Stack<Integer>();
    static Stack<Integer> stackMin=new Stack<Integer>();
    public static void push(int node) {
        stackData.push(node);
        if(stackMin.isEmpty()){
            stackMin.push(node);
        }else{
            stackMin.push(Math.min(stackMin.peek(), node));
        }
    }
 
    public static void pop() {
        stackData.pop();
        stackMin.pop();
    }
 
    public static int top() {
        return stackData.peek();
    }
 
    public static int min() {
        return stackMin.peek();
    }
 
}