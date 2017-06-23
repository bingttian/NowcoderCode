/*
����һ��int���飬���дһ�����������㷨��������Ԫ������
����һ��int����A������Ĵ�Сn���뷵�����������顣
����������
[1,2,3,5,2,3],6
[1,2,2,3,3,5]
*/
//�ύʱ�䣺2016-12-14 ���ԣ�Java ����ʱ�䣺 95 ms ռ���ڴ棺1213K ״̬������ȷ
import java.util.*;
 
public class QuickSort {
    public int[] quickSort(int[] A, int n) {
        process(A, 0, n-1);
        return A;
    }
     
    public static void process(int[] A,int left,int right){
        if(left<right){
            int mid=sort(A, left, right);
            process(A, left, mid);
            process(A, mid+1, right);
        }
    }
 
    public static int sort(int[] A,int left,int right){
        int key=A[left];
        int i=left;
        int j=right;
        while(i<j){
            while(i<j){
                if(A[j]<key){
                    int temp=A[i];
                    A[i]=A[j];
                    A[j]=temp;
                    i++;
                    break;
                }else{
                    j--;
                }
            }
            while(i<j){
                if(A[i]>key){
                    int temp=A[i];
                    A[i]=A[j];
                    A[j]=temp;
                    j--;
                    break;
                }else{
                    i++;
                }
            }
        }
        return i;
    }
}