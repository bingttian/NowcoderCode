/*
输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点）。
*/
//提交时间：2016-12-28 语言：Java 运行时间： 33 ms 占用内存：566K 状态：答案正确
/*
public class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;
 
    RandomListNode(int label) {
        this.label = label;
    }
}
*/
public class Solution {
    public RandomListNode Clone(RandomListNode pHead){
        if (pHead == null) {
            return null;
        }
        RandomListNode now = pHead;
        RandomListNode next = null;
        while (now != null) {
            next=now.next;
            now.next=new RandomListNode(now.label);
            now.next.next=next;
            now=next;
        }
        now=pHead;
        RandomListNode copy=null;
        while(now!=null){
            next=now.next.next;
            copy=now.next;
            copy.random=now.random!=null?now.random.next:null;
            now=next;
        }
        RandomListNode res=pHead.next;
        now=pHead;
        while(now!=null){
            next=now.next.next;
            copy=now.next;
            now.next=next;
            copy.next=next!=null?next.next:null;
            now=next;
        }
        return res;
    }
}