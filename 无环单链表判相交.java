/*
现在有两个无环单链表，若两个链表的长度分别为m和n，
请设计一个时间复杂度为O(n + m)，额外空间复杂度为O(1)的算法，
判断这两个链表是否相交。
给定两个链表的头结点headA和headB，请返回一个bool值，
代表这两个链表是否相交。保证两个链表长度小于等于500。
*/
//提交时间：2016-12-30 语言：Java 运行时间： 65 ms 占用内存：1763K 状态：答案正确
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