/*
��һ������val������ڽڵ�ֵ����Ļ��������в���һ���ڵ�ֵΪval�Ľڵ㣬
���ұ�֤������ε�������Ȼ����
�����������Ϣ����Ԫ�ص�ֵA����Ӧ��nxtָ���Ԫ�ر��ͬʱ����val��
�빹���������������������ֵ��
����������
[1,3,4,5,7],[1,2,3,4,0],2
���أ�{1,2,3,4,5,7}
*/
//�ύʱ�䣺2016-12-25 ���ԣ�Java ����ʱ�䣺 334 ms ռ���ڴ棺4255K ״̬������ȷ
import java.util.*;
 
/*
public class ListNode {
    int val;
    ListNode next = null;
 
    ListNode(int val) {
        this.val = val;
    }
}*/
public class InsertValue {
   public static ListNode insert(int[] A, int[] nxt, int val) {
        ListNode node = new ListNode(val);
        if(A==null||A.length<=0){
          //  node.next=node;
            return node;
        }
        ListNode head=new ListNode(A[0]);
        ListNode tmp=head;
        for(int i=0;i<A.length-1;i++){
            ListNode newNode=  new ListNode(A[nxt[i]]);
                tmp.next=newNode;
                tmp=newNode;
        }
        //tmp.next=head;
        if(val<head.val){
            tmp.next=node;
            node.next=head;
            return node;
        }
        
        ListNode pre=head;
        ListNode cur=pre.next;
        while(cur!=null){
            if(pre.val<=val&&val<=cur.val)
                break;
            pre=cur;
            cur=cur.next;
        }
        node.next=cur;
        pre.next=node;
        return head;
        }
}