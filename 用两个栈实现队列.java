/*
������ջ��ʵ��һ�����У���ɶ��е�Push��Pop������ �����е�Ԫ��Ϊint���͡�
*/
//�ύʱ�䣺2017-06-07 ���ԣ�Java ����ʱ�䣺 32 ms ռ���ڴ棺629K ״̬������ȷ
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