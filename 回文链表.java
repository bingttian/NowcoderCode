/*
���дһ����������������Ƿ�Ϊ���ġ�
����һ������ListNode* pHead���뷵��һ��bool�����������Ƿ�Ϊ���ġ�
����������
{1,2,3,2,1}
���أ�true
{1,2,3,2,3}
���أ�false
*/
//�ύʱ�䣺2016-12-28 ���ԣ�Java ����ʱ�䣺 44 ms ռ���ڴ棺835K ״̬������ȷ
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