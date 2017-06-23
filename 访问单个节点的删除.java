/*
实现一个算法，删除单向链表中间的某个结点，假定你只能访问该结点。
给定带删除的节点，请执行删除操作，若该节点为尾节点，返回false，否则返回true
*/
//提交时间：2016-12-26 语言：Java 运行时间： 32 ms 占用内存：583K 状态：答案正确
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