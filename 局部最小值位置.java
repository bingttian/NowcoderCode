/*
����ֲ���С�ĸ��
arr����Ϊ1ʱ��arr[0]�Ǿֲ���С��
arr�ĳ���ΪN(N>1)ʱ�����arr[0]<arr[1]����ôarr[0]�Ǿֲ���С��
���arr[N-1]<arr[N-2]����ôarr[N-1]�Ǿֲ���С��
���0<i<N-1������arr[i]<arr[i-1]����arr[i]<arr[i+1]����ôarr[i]�Ǿֲ���С�� 
������������arr����֪arr�������������ڵ���������ȣ�
дһ��������ֻ�践��arr������һ���ֲ���С���ֵ�λ�ü��ɡ�
*/
//�ύʱ�䣺2016-12-07 ���ԣ�Java ����ʱ�䣺 46 ms ռ���ڴ棺755K ״̬������ȷ
public class Solution {
    public int getLessIndex(int[] arr) {
        if(arr == null || arr.length == 0)
            return -1;
        if(arr.length == 1 || arr[0] < arr[1]) {
            return 0;
        }
        if(arr[arr.length - 1] < arr[arr.length - 2]) {
            return arr.length - 1;
        }
        int left=1;
        int right=arr.length-2;
        int mid=0;
        while(left<right){
            mid=left+(right-left)/2;
            if(arr[mid-1]<arr[mid]){
                right=mid-1;
            }else if(arr[mid+1]<arr[mid]){
                left=mid+1;
            }else{
                return mid;
            }
             
        }
        return right;
    }
}
