/*
有一个单链表，请设计一个算法，使得每K个节点之间逆序，
如果最后不够K个节点一组，则不调整最后几个节点。
例如链表1->2->3->4->5->6->7->8->null，K=3这个例子。
调整后为，3->2->1->6->5->4->7->8->null。
因为K==3，所以每三个节点之间逆序，但其中的7，8不调整，
因为只有两个节点不够一组。
给定一个单链表的头指针head,同时给定K值，返回逆序后的链表的头指针。
*/
//提交时间：2016-12-27 语言：Java 运行时间： 352 ms 占用内存：5388K 状态：答案正确
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