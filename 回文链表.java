/*
请编写一个函数，检查链表是否为回文。
给定一个链表ListNode* pHead，请返回一个bool，代表链表是否为回文。
测试样例：
{1,2,3,2,1}
返回：true
{1,2,3,2,3}
返回：false
*/
//提交时间：2016-12-28 语言：Java 运行时间： 44 ms 占用内存：835K 状态：答案正确
import java.util.*;
 
/*
public class ListNode {
    int val;
    ListNode next = null;
 
    ListNode(int val) {
        this.val = val;
    }
}*/
public class Palindrome {
    public boolean isPalindrome(ListNode pHead) {
   Stack<Integer> stack=new Stack<Integer>();
        ListNode head=pHead;
        while(pHead!=null){
            stack.push(pHead.val);
            pHead=pHead.next;
        }
        while(head!=null){
            if(head.val!=stack.pop()){
                return false;
            }
            head=head.next;
        }
        return true;
    }
}