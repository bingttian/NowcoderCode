/*
ʵ��һ��ջ�����򣬵���ֻ���õݹ麯�������ջ�����pop������ʵ�֣��������Լ�������������ݽṹ��
����һ����������A��Ϊ������ջ��ͬʱ�������Ĵ�Сn���뷵��������ջ��
����������
[4,3,2,1],4
���أ�[1,2,3,4]
*/
//�ύʱ�䣺2016-12-22 ���ԣ�Java ����ʱ�䣺 124 ms ռ���ڴ棺1781K ״̬������ȷ
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