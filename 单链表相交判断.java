/*
���������������ͷ�ڵ�head1��head2������ж����������Ƿ��ཻ��
�ཻ�Ļ�����true�����뽻�Ļ�����false��
�������������ͷ���head1��head2
(ע�⣬������������adjust0��adjust1���ڵ�������,�뱾������޹�)��
�뷵��һ��boolֵ���������Ƿ��ཻ��
*/
//�ύʱ�䣺2016-12-22 ���ԣ�Java ����ʱ�䣺 69 ms ռ���ڴ棺1511K ״̬������ȷ
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
            return chkIntersectNoLoop(head1, head2);//����������û�л�ʱ��ִ��chkIntersectNoLoop�����޻������Ƿ��ཻ
        if (enter1 == null || enter2 == null)
            return false;//��������һ���л���һ��û�л���ֱ���жϲ��ཻ
        return chkIntersectLoop(head1, head2);//���������л���ֱ�ӽ�����ֱ�õ�ÿ��������뻷�ڵ�node1��node2��Ȼ������л��������ж��Ƿ��ཻ
    }
 
    // �ж������޻��������Ƿ��ཻ
    // �ȸ��Ա���һ�Σ��ֱ�õ���������ĳ��Ȳ�ֵdiff��Ȼ���ó�����������diff����֮����ͨ���Ƚ��ж϶����Ƿ��ཻ
    public static boolean chkIntersectNoLoop(ListNode headA, ListNode headB) {
        if (headA == null || headB == null)
            return false;
        // �õ���������ĳ��ȣ�����ò�ֵ
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
        // ������������
        while (diff-- > 0) {
            if (lenA > lenB)
                headA = headA.next;
            else
                headB = headB.next;
        }
        // ͬʱ��
        while (headA != null && headB != null) {
            if (headA == headB)
                return true;//����ֵΪboolean �˴�Ϊtrue
            headA = headA.next;
            headB = headB.next;
        }
        return false;//����ֵΪboolean �˴�Ϊfalse
    }
    // �ж������л��������Ƿ��ཻ
    // ͨ���Ƚ�����������뻷�ڵ�node1, node2, �����������������
    // (1)node1==node2,�뻷ǰ���Ѿ��ཻ
    // (2)node1!=node2 && node1�ڻ���������node2, ���߲��ཻ
    // (3)node1!=node2 && node1�ڻ��ڿ�������node2�������ཻ
    public static boolean chkIntersectLoop(ListNode head1, ListNode head2) {
        ListNode enter1 = singleloop(head1);
        ListNode enter2 = singleloop(head2);
        if (enter1 == enter2)
            return true;//����ֵΪbooleanʱ������ֵΪtrue
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
    //�ж��Ƿ��л����У����� ������ڽڵ㣬�޻��򷵻�null
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
            return null;// �޻�
        fast = head;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return fast;// �������
    }
 
}