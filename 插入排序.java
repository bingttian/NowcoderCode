/*
����һ��int���飬���дһ�����������㷨��������Ԫ������
����һ��int����A������Ĵ�Сn���뷵�����������顣
����������
[1,2,3,5,2,3],6
[1,2,2,3,3,5]
*/
//�ύʱ�䣺2017-01-05 ���ԣ�Java ����ʱ�䣺 96 ms ռ���ڴ棺1087K ״̬������ȷ
import java.util.*;
 
public class InsertionSort {
    public int[] insertionSort(int[] A, int n) {
        for(int after=1;after<n;after++){
            int temp=A[after];
            for(int before=after -1;before>=0;before--){
                if(A[before]>A[after]){
                    A[after]=A[before];
                    A[before]=temp;
                    after--;
                }
            }
        }
        return A;
    }
}