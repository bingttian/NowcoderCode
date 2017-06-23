/*
请编写一个程序，按升序对栈进行排序（即最大元素位于栈顶），要求最多只能使用一个额外的栈存放临时数据，但不得将元素复制到别的数据结构中。
给定一个int[] numbers(C++中为vector&ltint>)，其中第一个元素为栈顶，请返回排序后的栈。请注意这是一个栈，意味着排序过程中你只能访问到第一个元素。
测试样例：
[1,2,3,4,5]
返回：[5,4,3,2,1]
*/
//提交时间：2016-12-22 语言：Java 运行时间： 185 ms 占用内存：3197K 状态：答案正确
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
     
    //不用递归，help里都是有序进栈的，所以把stack取出来的数放入temp里，把比temp小的数全都放到stack里
    //temp放入help后，对新的stack继续pop，肯定会先把原来help里pop出来的数按原顺序放回help里。
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