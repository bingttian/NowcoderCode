/*
����һ������������Ҫ��һ���ض���ֵ��ɶ����ķֻ���
ʹ��С�ڵ������ֵ�Ľ���Ƶ�ǰ�棬���ڸ�ֵ�Ľ���ں��棬ͬʱ��֤�������ڲ���λ�ù�ϵ���䡣
����һ�������ͷ���head��ͬʱ������ֵval���뷵��һ������ʹС�ڵ������Ľ����ǰ�����ڵ��������ں󣬱�֤���ֵ���ظ���
����������
{1,4,2,5},3
{1,2,4,5}
*/
�ύʱ�䣺2016-12-26 ���ԣ�Java ����ʱ�䣺 295 ms ռ���ڴ棺4012K ״̬������ȷ
import java.util.*;
 
/*
public class ListNode {
    int val;
    ListNode next = null;
 
    ListNode(int val) {
        this.val = val;
    }
}*/
public class Divide {
    public ListNode listDivide(ListNode head, int val) {
    ListNode sh = null; // small head
        ListNode st = null; // small tail
        ListNode bh = null; // big head
        ListNode bt = null; // big tail
        ListNode next = null; // save next node
        while (head != null) {
            next = head.next;
            head.next = null;
            if (head.val <= val) {
                if (sh == null) {
                    sh = head;
                    st = head;
                } else {
                    st.next = head;
                    st = head;
                }
            } else {
                if (bh == null) {
                    bh = head;
                    bt = head;
                } else {
                    bt.next = head;
                    bt = head;
                }
            }
            head = next;
        }
        if (st != null) {
            st.next = bh;
        }
        return sh != null ? sh : bh;
    }
}