/*
����һ����������arr���ٸ���һ������num��
����arr���ҵ�num��������ֵ�����ߵ�λ�á�
����һ������arr�����Ĵ�Сn��ͬʱ����num��
�뷵������λ�á�����Ԫ����������δ���֣��뷵��-1��
����������
[1,2,3,3,4],5,3
���أ�2
*/
//�ύʱ�䣺2016-12-07 ���ԣ�Java ����ʱ�䣺 54 ms ռ���ڴ棺1009K ״̬������ȷ
import java.util.*;
 
public class LeftMostAppearance {
    public static int findPos(int[] arr, int n, int num) {
        int left=1;
        int right=n;
        int mid=0;
        int res=-1;
        if(arr[n-1]==num)
            return n-1;
        if(arr[0]==num)
            return 0;
        while(left<=right){
            mid=left+(right-left)/2;
            if(arr[mid-1]<=num){
                if(arr[mid-1]==num){
                    res=mid-1;
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }else{
                right=mid-1;
            }
        }
        return res;
   }
}