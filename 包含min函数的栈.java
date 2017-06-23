/*
����ջ�����ݽṹ�����ڸ�������ʵ��һ���ܹ��õ�ջ��СԪ�ص�min������
*/
//�ύʱ�䣺2016-12-22 ���ԣ�Java ����ʱ�䣺 33 ms ռ���ڴ棺503K ״̬������ȷ
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