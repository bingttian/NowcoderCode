/*
����һ����������ÿ���ڵ����нڵ�ֵ���Լ�����ָ�룬һ��ָ����һ���ڵ㣬��һ������ָ��ָ������һ���ڵ㣩��
*/
//�ύʱ�䣺2016-12-28 ���ԣ�Java ����ʱ�䣺 33 ms ռ���ڴ棺566K ״̬������ȷ
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