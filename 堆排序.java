/*
����һ��int���飬���дһ���������㷨��������Ԫ������
����һ��int����A������Ĵ�Сn���뷵�����������顣
����������
[1,2,3,5,2,3],6
[1,2,2,3,3,5]
*/
//�ύʱ�䣺2017-01-04 ���ԣ�Java ����ʱ�䣺 105 ms ռ���ڴ棺1232K ״̬������ȷ
import java.util.*;
 
public class HeapSort {
    public int[] heapSort(int[] A, int n) {
        for(int i=n/2;i>=0;i--){
            heapAdjust(A,i,n);
        }
        for(int i=n-1;i>0;i--){
            swap(A,0,i);
            heapAdjust(A,0,i);
        }
        return A;
    }
    private static void swap(int[] A, int i, int j) {
        int temp=A[i];
        A[i]=A[j];
        A[j]=temp;
    }
    private  static void heapAdjust(int[] heap, int parent, int len) {
        int child = 2*parent+1;
           while(child<len){
               //��� if �ж�ע��һ�£�������Ԫ�ز���Խ��
               if((child+1)<len && heap[child]<heap[child+1]){
                   child = child+1;
               }
                  
               if(heap[parent]>heap[child]){
                   break;
               }else{
                   swap(heap, parent, child);
               }
               parent = child;
             child = 2*parent+1;
           }
    }
}