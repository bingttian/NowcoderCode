/*
����һ��int���飬���дһ��ð�������㷨��������Ԫ������
����һ��int����A������Ĵ�Сn���뷵�����������顣 
����������
[1,2,3,5,2,3],6
[1,2,2,3,3,5]
*/
//�ύʱ�䣺2016-12-11 ���ԣ�Java ����ʱ�䣺 86 ms ռ���ڴ棺1214K ״̬������ȷ
import java.util.*;
 
public class BubbleSort {
    public int[] bubbleSort(int[] A, int n) {
        int temp=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                if(A[j]>A[j+1]){
                    temp=A[j+1];
                    A[j+1]=A[j];
                    A[j]=temp;
                }
            }
        }
        return A;
    }
}