/*
����һ��int���飬���дһ�����������㷨��������Ԫ������
����һ��int����A������Ĵ�Сn���뷵�����������顣
����������
[1,2,3,5,2,3],6
[1,2,2,3,3,5]
*/
//�ύʱ�䣺2016-12-13 ���ԣ�Java ����ʱ�䣺 82 ms ռ���ڴ棺1213K ״̬������ȷ
import java.util.*;
 
public class CountingSort {
   public static int[] countingSort(int[] A, int n){
        int min=A[0];
        int max=A[0];
        for(int i=1;i<n-1;i++){
            if(A[i]<min)
                min=A[i];
            if(A[i]>max)
                max=A[i];
        }
        int bucketlength=max-min+1;
        int[] bucket=new int[bucketlength];
        for(int i=0;i<n;i++){
            bucket[A[i]-min]++;
        }
        int index=0;
        for(int i=0;i<bucketlength;i++){
            //System.out.println(bucket[i]);
            for(int j=0;j<bucket[i];j++){
                A[index++]=i+min;
            }
        }
        return A;
    }
}