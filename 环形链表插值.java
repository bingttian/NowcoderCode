/*
有一个整数val，如何在节点值有序的环形链表中插入一个节点值为val的节点，
并且保证这个环形单链表依然有序。
给定链表的信息，及元素的值A及对应的nxt指向的元素编号同时给定val，
请构造出这个环形链表，并插入该值。
测试样例：
[1,3,4,5,7],[1,2,3,4,0],2
返回：{1,2,3,4,5,7}
*/
//提交时间：2016-12-25 语言：Java 运行时间： 334 ms 占用内存：4255K 状态：答案正确
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