/*
��һ����������arr�����в������ظ�Ԫ�أ�
���ҵ�����arr[i]==i�����������λ�á�
�������λ���ϵ���������������������-1��
������������arr�����Ĵ�Сn���뷵������ֵ��
����������
[-1,0,2,3],4
���أ�2
*/
//�ύʱ�䣺2017-01-03 ���ԣ�Java ����ʱ�䣺 51 ms ռ���ڴ棺964K ״̬������ȷ
import java.util.*;
 
public class Find {
    public int findPos(int[] arr, int n) {
       if(arr[n-1]<0||arr[0]>n-1){
            return -1;
        }
        int res=-1;
        int left=0;
        int right=n-1;
        int mid=left+(right-left)/2;
        while(left<=right){
            if(arr[mid]==mid){
                res=mid;
                right=mid-1;
                mid=left+(mid-left)/2;
            }else if(arr[mid]<mid){
                left=mid+1;
                mid=left+(right-left)/2;
            }else if(arr[mid]>mid){
                right=mid-1;
                mid=left+(right-left)/2;
            }
        }
        return res;
    }
}