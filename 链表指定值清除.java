/*
现在有一个单链表。链表中每个节点保存一个整数，
再给定一个值val，把所有等于val的节点删掉。
给定一个单链表的头结点head，同时给定一个值val，
请返回清除后的链表的头结点，保证链表中有不等于该值的其它值。
请保证其他元素的相对顺序。
测试样例：
{1,2,3,4,3,2,1},2
{1,3,4,3,1}
*/
//提交时间：2016-12-28 语言：Java 运行时间： 199 ms 占用内存：3040K 状态：答案正确
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