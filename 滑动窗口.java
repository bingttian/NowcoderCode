/*
��һ���������� arr ��һ����СΪ w �Ĵ��ڴ����������߻������ұ�,����ÿ�����ұ߻�һ��λ�á�
 ����һ������Ϊn-w+1������res��res[i]��ʾÿһ�ִ���״̬�µ����ֵ�� 
������Ϊ[4,3,5,4,3,3,6,7]��w=3Ϊ����
��Ϊ��һ������[4,3,5]�����ֵΪ5���ڶ�������[3,5,4]�����ֵΪ5��
����������[5,4,3]�����ֵΪ5�����ĸ�����[4,3,3]�����ֵΪ4��
���������[3,3,6]�����ֵΪ6������������[3,6,7]�����ֵΪ7��
�������շ���[5,5,5,4,6,7]��
������������arr�����Ĵ�Сn��ͬʱ����w���뷵��res���顣
��֤wС�ڵ���n��ͬʱ��֤�����СС�ڵ���500��
����������
[4,3,5,4,3,3,6,7],8,3
���أ�[5,5,5,4,6,7]
*/
//�ύʱ�䣺2016-12-23 ���ԣ�Java ����ʱ�䣺 108 ms ռ���ڴ棺1729K ״̬������ȷ
import java.util.*;
 
public class SlideWindow {
public static int[] slide(int[] arr, int n, int w) {
        LinkedList<Integer> qmax=new LinkedList<Integer>();
        int[] res=new int[n-w+1];
        int index=0;
        for(int i=0;i<n;i++){
            while(!qmax.isEmpty() && arr[qmax.peekLast()]<=arr[i]){
                qmax.pollLast();
            }
            qmax.addLast(i);
            if(i-w==qmax.peekFirst()){
                qmax.pollFirst();
            }
            if(i>=w-1){
                res[index++]=arr[qmax.peekFirst()];
            }
        }
        return res;
    }
}