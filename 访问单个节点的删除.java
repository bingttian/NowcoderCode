/*
ʵ��һ���㷨��ɾ�����������м��ĳ����㣬�ٶ���ֻ�ܷ��ʸý�㡣
������ɾ���Ľڵ㣬��ִ��ɾ�����������ýڵ�Ϊβ�ڵ㣬����false�����򷵻�true
*/
//�ύʱ�䣺2016-12-26 ���ԣ�Java ����ʱ�䣺 32 ms ռ���ڴ棺583K ״̬������ȷ
import java.util.*;
 
/*
public class ListNode {
    int val;
    ListNode next = null;
 
    ListNode(int val) {
        this.val = val;
    }
}*/
public class Remove {
    public boolean removeNode(ListNode pNode) {
    ListNode next=pNode.next;
        if(next==null){
            return false;
        }
        pNode.val=next.val;
        pNode.next=next.next;
        return true;
    }
}