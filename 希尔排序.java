/*
����һ��int���飬���дһ��ϣ�������㷨��������Ԫ������
����һ��int����A������Ĵ�Сn���뷵�����������顣��֤Ԫ��С�ڵ���2000��
����������
[1,2,3,5,2,3],6
[1,2,2,3,3,5]
*/
//�ύʱ�䣺2016-12-14 ���ԣ�Java ����ʱ�䣺 102 ms ռ���ڴ棺1232K ״̬������ȷ
import java.util.*;
 
public class ShellSort {
    public static int[] shellSort(int[] A, int n) {
        int feet=n/2;
        while(feet>0){
            for(int i=feet;i<n;i++){
                int temp=A[i],j=0;
                for(j=i;j>0&&temp<A[j-1];j--){
                    //System.out.println("hi");
                    A[j]=A[j-1];
                }
                A[j]=temp;
            }
            feet=feet/2;
        }
        return A;
    }
     
    void swap(int[] A,int m,int n){
        int temp = A[m];
        A[m] = A[n];
        A[n] = temp;
    }
}