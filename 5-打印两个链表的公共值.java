/*
�����������������������о����ظ�Ԫ�ء�
�����һ����Ч���㷨����ӡ��������Ĺ���ֵ���֡�
�������������ͷָ��headA��headB���뷵��һ��vector��
Ԫ��Ϊ��������Ĺ������֡��뱣֤�������������
���������Ԫ�ظ�����С�ڵ���500����֤һ���й���ֵ
����������
{1,2,3,4,5,6,7},{2,4,6,8,10}
���أ�[2.4.6]
*/
//�ύʱ�䣺2016-12-27 ���ԣ�Java ����ʱ�䣺 108 ms ռ���ڴ棺1746K ״̬������ȷ
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