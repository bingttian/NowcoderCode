/*
�����������޻�����������������ĳ��ȷֱ�Ϊm��n��
�����һ��ʱ�临�Ӷ�ΪO(n + m)������ռ临�Ӷ�ΪO(1)���㷨��
�ж������������Ƿ��ཻ��
�������������ͷ���headA��headB���뷵��һ��boolֵ��
���������������Ƿ��ཻ����֤����������С�ڵ���500��
*/
//�ύʱ�䣺2016-12-30 ���ԣ�Java ����ʱ�䣺 65 ms ռ���ڴ棺1763K ״̬������ȷ
import java.util.*;
 
/*
public class ListNode {
    int val;
    ListNode next = null;
 
    ListNode(int val) {
        this.val = val;
    }
}*/
public class CheckIntersect {
    public boolean chkIntersect(ListNode headA, ListNode headB) {
    if(headA==null||headB==null)
            return false;
        ListNode now1=headA;
        ListNode now2=headB;
        int long1=1;
        int long2=1;
        while(now1.next!=null){
            now1=now1.next;
            long1++;
        }
        while(now2.next!=null){
            now2=now2.next;
            long2++;
        }
        if(long1>=long2){
            for(int i=0;i<(long1-long2);i++){
                headA=headA.next;
            }
            while(headA.next!=null){
                if(headA==headB){
                    return true;
                }
                headA=headA.next;
                headB=headB.next;
            }
        }else{
            for(int i=0;i<(long2-long1);i++){
                headB=headB.next;
            }
            while(headB.next!=null){
                if(headA==headB){
                    return true;
                }
                headA=headA.next;
                headB=headB.next;
            }
        }
        return false;
    }
}