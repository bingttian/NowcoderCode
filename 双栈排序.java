/*
���дһ�����򣬰������ջ�������򣨼����Ԫ��λ��ջ������Ҫ�����ֻ��ʹ��һ�������ջ�����ʱ���ݣ������ý�Ԫ�ظ��Ƶ�������ݽṹ�С�
����һ��int[] numbers(C++��Ϊvector&ltint>)�����е�һ��Ԫ��Ϊջ�����뷵��������ջ����ע������һ��ջ����ζ�������������ֻ�ܷ��ʵ���һ��Ԫ�ء�
����������
[1,2,3,4,5]
���أ�[5,4,3,2,1]
*/
//�ύʱ�䣺2016-12-22 ���ԣ�Java ����ʱ�䣺 185 ms ռ���ڴ棺3197K ״̬������ȷ
import java.util.*;
 
public class TwoStacks {
    static Stack<Integer> help=new Stack<Integer>();
    public static ArrayList<Integer> twoStacksSort(int[] numbers) {
        ArrayList<Integer> res=new ArrayList<Integer>();
        Stack<Integer> stack=new Stack<Integer>();
        for(int i=0;i<numbers.length;i++){
            stack.push(numbers[i]);
        }
        sort(stack);
        for(int i=0;i<numbers.length;i++){
            res.add(help.pop());
        }
        return res;
    }
     
    //���õݹ飬help�ﶼ�������ջ�ģ����԰�stackȡ������������temp��ѱ�tempС����ȫ���ŵ�stack��
    //temp����help�󣬶��µ�stack����pop���϶����Ȱ�ԭ��help��pop����������ԭ˳��Ż�help�
    public static void sort(Stack<Integer> stack){
        while(!stack.isEmpty()){
            int temp=stack.pop();
            while(!help.isEmpty()&&help.peek()>temp){
                stack.push(help.pop());
            }
            help.push(temp);
        }
    }
}