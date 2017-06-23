/*
用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
*/
//提交时间：2017-06-07 语言：Java 运行时间： 32 ms 占用内存：629K 状态：答案正确
import java.util.Stack;
 
public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
     
   public void push(int node) {
            stack1.push(node);
        }
 
        public int pop() {
            while(!stack1.empty()){
                stack2.push(stack1.pop());
            }
            int temp=stack2.pop();
            while(!stack2.empty()){
                stack1.push(stack2.pop());
            }
            return temp;
        }
}