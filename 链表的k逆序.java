/*
��һ�������������һ���㷨��ʹ��ÿK���ڵ�֮������
�����󲻹�K���ڵ�һ�飬�򲻵�����󼸸��ڵ㡣
��������1->2->3->4->5->6->7->8->null��K=3������ӡ�
������Ϊ��3->2->1->6->5->4->7->8->null��
��ΪK==3������ÿ�����ڵ�֮�����򣬵����е�7��8��������
��Ϊֻ�������ڵ㲻��һ�顣
����һ���������ͷָ��head,ͬʱ����Kֵ�����������������ͷָ�롣
*/
//�ύʱ�䣺2016-12-27 ���ԣ�Java ����ʱ�䣺 352 ms ռ���ڴ棺5388K ״̬������ȷ
import java.util.*;
 
/*
public class ListNode {
    int val;
    ListNode next = null;
 
    ListNode(int val) {
        this.val = val;
    }
}*/
public class KInverse {
    public ListNode inverse(ListNode head, int k) {
        if(head==null||k<2){
            return head;
        }
        ListNode node=head;
        ListNode temp=head;
        int[] num=new int[k];
        int flag=0;
        while(head!=null){
            for(int i=0;i<k;i++){
                if(head==null){
                    flag=1;
                    break;
                }else{
                    num[i]=head.val;
                    head=head.next;
                }
            }
            System.out.println(Arrays.toString(num));
            if(flag==1){
                break;
            }
//          System.out.println(Arrays.toString(num));
            for(int i=k;i>0;i--){
//              System.out.println(i);
                temp.val=num[i-1];
                temp=temp.next;
            }
            temp=head;
        }
        return node;
    }
}