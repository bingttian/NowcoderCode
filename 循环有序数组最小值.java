/*
����һ������ѭ������arr������arr�е���Сֵ��
����ѭ��������ָ����������������ⳤ�ȵĲ��ַŵ��ұ�ȥ��
�ұߵĲ����õ����������������[1,2,3,3,4]��������ѭ�����飬[4,1,2,3,3]Ҳ�ǡ�
��������arr�����Ĵ�Сn���뷵����Сֵ��
����������
[4,1,2,3,3],5
���أ�1
*/
//�ύʱ�䣺2016-12-07 ���ԣ�Java ����ʱ�䣺 56 ms ռ���ڴ棺969K ״̬������ȷ
import java.util.*;
 
public class MinValue {
      public int getMin(int[] arr, int n) {
        if(n==0||arr== null)
            return -1;
        int left = 0;
        int right = n-1;
        int mid = (left+right)/2;
        if(arr[left]<arr[right]){
            return arr[left];
        }
          
        while(left < right){
                mid = (left+right)/2;
                if(arr[left]>arr[mid])
                    right =mid;
                else if(arr[mid]>arr[left])
                    left = mid;
                else {
                    mid++;
                    break;
                }
        }
              
      
        return arr[mid];
    }
}