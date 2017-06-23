/*
给定两个单链表的头节点head1和head2，如何判断两个链表是否相交？
相交的话返回true，不想交的话返回false。
给定两个链表的头结点head1和head2
(注意，另外两个参数adjust0和adjust1用于调整数据,与本题求解无关)。
请返回一个bool值代表它们是否相交。
*/
//提交时间：2016-12-22 语言：Java 运行时间： 69 ms 占用内存：1511K 状态：答案正确
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
    public static boolean chkInter(ListNode head1, ListNode head2, int adjust0,
            int adjust1) {
        ListNode enter1 = singleloop(head1);
        ListNode enter2 = singleloop(head2);
 
        if (enter1 == null && enter2 == null)
            return chkIntersectNoLoop(head1, head2);//当两个链表都没有环时，执行chkIntersectNoLoop，看无环链表是否相交
        if (enter1 == null || enter2 == null)
            return false;//两个链表一个有环，一个没有环，直接判断不相交
        return chkIntersectLoop(head1, head2);//两个链表都有环，直接进入则分别得到每个链表的入环节点node1，node2，然后进行有环单链表判断是否相交
    }
 
    // 判断两个无环单链表是否相交
    // 先各自遍历一次，分别得到两个链表的长度差值diff，然后让长的链表先走diff步，之后再通过比较判断二者是否相交
    public static boolean chkIntersectNoLoop(ListNode headA, ListNode headB) {
        if (headA == null || headB == null)
            return false;
        // 得到两个链表的长度，并求得差值
        int lenA = 0;
        int lenB = 0;
        int diff = 0;
        ListNode cur = headA;
        while (cur != null) {
            lenA++;
            cur = cur.next;
        }
        cur = headB;
        while (cur != null) {
            lenB++;
            cur = cur.next;
        }
        diff = Math.abs(lenA - lenB);
        // 长的链表先走
        while (diff-- > 0) {
            if (lenA > lenB)
                headA = headA.next;
            else
                headB = headB.next;
        }
        // 同时走
        while (headA != null && headB != null) {
            if (headA == headB)
                return true;//返回值为boolean 此处为true
            headA = headA.next;
            headB = headB.next;
        }
        return false;//返回值为boolean 此处为false
    }
    // 判断两个有环单链表是否相交
    // 通过比较两个链表的入环节点node1, node2, 考虑以下三种情况：
    // (1)node1==node2,入环前就已经相交
    // (2)node1!=node2 && node1在环内遇不到node2, 两者不相交
    // (3)node1!=node2 && node1在环内可以遇到node2，两者相交
    public static boolean chkIntersectLoop(ListNode head1, ListNode head2) {
        ListNode enter1 = singleloop(head1);
        ListNode enter2 = singleloop(head2);
        if (enter1 == enter2)
            return true;//返回值为boolean时，返回值为true
        else {
            ListNode cur = enter1.next;
            while (cur != enter1) {
                if (cur == enter2)
                    return true;//true
                cur = cur.next;
            }
            return false;//false
        }
    }
    //判断是否有环吗？有，返回 环的入口节点，无环则返回null
    public static ListNode singleloop(ListNode head) {
        if (head == null || head.next == null)
            return null;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                break;
        }
        if (slow != fast)
            return null;// 无环
        fast = head;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return fast;// 环的入口
    }
 
}