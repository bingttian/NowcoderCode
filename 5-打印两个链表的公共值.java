/*
现有两个升序链表，且链表中均无重复元素。
请设计一个高效的算法，打印两个链表的公共值部分。
给定两个链表的头指针headA和headB，请返回一个vector，
元素为两个链表的公共部分。请保证返回数组的升序。
两个链表的元素个数均小于等于500。保证一定有公共值
测试样例：
{1,2,3,4,5,6,7},{2,4,6,8,10}
返回：[2.4.6]
*/
//提交时间：2016-12-27 语言：Java 运行时间： 108 ms 占用内存：1746K 状态：答案正确
import java.util.*;
 
/*
public class ListNode {
    int val;
    ListNode next = null;
 
    ListNode(int val) {
        this.val = val;
    }
}*/
public class Common {
    public int[] findCommonParts(ListNode headA, ListNode headB) {
    LinkedList<Integer> list = new LinkedList<Integer>();
        if(headA==null||headB==null){
            return null;
        }
        while(headA!=null&&headB!=null){
            if(headA.val==headB.val){
                list.add(headA.val);
                headA=headA.next;
                headB=headB.next;
            }else if(headA.val>headB.val){
                headB=headB.next;
            }else{
                headA=headA.next;
            }
        }
        int[] res=new int[list.size()];
        int index = 0;
        while (!list.isEmpty()) {
            res[index++] = list.pollFirst();
        }
        return res;
    }
}