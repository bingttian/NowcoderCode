/*
����ж�һ���������Ƿ��л���
�л��Ļ����ؽ��뻷�ĵ�һ���ڵ��ֵ���޻��Ļ�����-1��
�������ĳ���ΪN��������ʱ�临�Ӷ�O(N)������ռ临�Ӷ�O(1)��
����һ���������ͷ���head
��ע����һ������adjustΪ���ܺ�����ݵ��������������������ã��뱾������޹�)���뷵������ֵ��
*/
//�ύʱ�䣺2016-12-30 ���ԣ�Java ����ʱ�䣺 67 ms ռ���ڴ棺1155K ״̬������ȷ
import java.util.*;
 
/*
public class ListNode {
    int val;
    ListNode next = null;
 
    ListNode(int val) {
        this.val = val;
    }
}*/
public class ChkLoop {
    public int chkLoop(ListNode head, int adjust) {
    if(head.next==head){
            return head.val;
        }
        ListNode fast=head.next.next;
        ListNode slow=head.next;
        while(fast.next!=null&&fast.next.next!=null&&fast!=slow){
            fast=fast.next.next;
            slow=slow.next;
        }
         
        if(fast==slow){
            fast=head;
            while(fast!=slow){
                fast=fast.next;
                slow=slow.next;
            }
            return fast.val;
        }
        return -1;
    }
}