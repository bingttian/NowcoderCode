/*
������һ��������������ÿ���ڵ㱣��һ��������
�ٸ���һ��ֵval�������е���val�Ľڵ�ɾ����
����һ���������ͷ���head��ͬʱ����һ��ֵval��
�뷵�������������ͷ��㣬��֤�������в����ڸ�ֵ������ֵ��
�뱣֤����Ԫ�ص����˳��
����������
{1,2,3,4,3,2,1},2
{1,3,4,3,1}
*/
//�ύʱ�䣺2016-12-28 ���ԣ�Java ����ʱ�䣺 199 ms ռ���ڴ棺3040K ״̬������ȷ
import java.util.*;
 
/*
public class ListNode {
    int val;
    ListNode next = null;
 
    ListNode(int val) {
        this.val = val;
    }
}*/
public class ClearValue {
    public ListNode clear(ListNode head, int val) {
       ListNode res=head;
        ListNode now=res;
        while(head!=null){
            if(head.val==val){
                head=head.next;
                now.next=now.next.next;
            }else{
                now.val=head.val;
                now=now.next;
                head=head.next;
            }
        }
         
        return res;
    }
}