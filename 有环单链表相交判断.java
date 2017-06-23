/*
如何判断两个有环单链表是否相交？
相交的话返回第一个相交的节点，不想交的话返回空。
如果两个链表长度分别为N和M，
请做到时间复杂度O(N+M)，额外空间复杂度O(1)。
给定两个链表的头结点head1和head2
(注意，另外两个参数adjust0和adjust1用于调整数据,与本题求解无关)。
请返回一个bool值代表它们是否相交。
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