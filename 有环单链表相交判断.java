/*
����ж������л��������Ƿ��ཻ��
�ཻ�Ļ����ص�һ���ཻ�Ľڵ㣬���뽻�Ļ����ؿա�
������������ȷֱ�ΪN��M��
������ʱ�临�Ӷ�O(N+M)������ռ临�Ӷ�O(1)��
�������������ͷ���head1��head2
(ע�⣬������������adjust0��adjust1���ڵ�������,�뱾������޹�)��
�뷵��һ��boolֵ���������Ƿ��ཻ��
*/
import java.util.*;
 
/*
public class ListNode {
    int val;
    ListNode next = null;
 
    ListNode(int val) {
        this.val = val;
    }
}*/
public class ChkIntersection {
    public boolean chkInter(ListNode head1, ListNode head2, int adjust0, int adjust1) {
       ListNode p1=find(head1);
        ListNode p2=find(head2);
        if(p1==p2){
            return true;
        }
        ListNode now=p1.next;
        while(p1!=now){
            if(now==p2){
                return true;
            }
            now=now.next;
        }
        return false;
    }
     
    public static ListNode find(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null&&fast.next!=null){
            
            fast = fast.next.next;
            slow = slow.next;
              if(fast==slow)break;
        }
        if(fast==null||fast.next==null)return null;
        fast = head;
        while(fast!=slow){
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }
}