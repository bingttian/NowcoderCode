/*
����һ��int���飬���дһ��ѡ�������㷨��������Ԫ������
����һ��int����A������Ĵ�Сn���뷵�����������顣
����������
[1,2,3,5,2,3],6
[1,2,2,3,3,5]
*/
//�ύʱ�䣺2016-12-11 ���ԣ�Java ����ʱ�䣺 81 ms ռ���ڴ棺1214K ״̬������ȷ
import java.util.*;
 
public class SelectionSort {
    public int[] selectionSort(int[] A, int n) {
        int t=0;
        for(int i=0;i<n;i++){
            t=i;
            for(int j=i+1;j<n;j++){
                if(A[j]<A[t]){
                    t=j;
                }
            }
            int temp=A[i];
            A[i]=A[t];
            A[t]=temp;
            //System.out.println(Arrays.toString(A));
        }
        return A;
    }
}