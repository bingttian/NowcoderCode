/*
����һ��int���飬���дһ���鲢�����㷨��������Ԫ������
����һ��int����A������Ĵ�Сn���뷵�����������顣
����������
[1,2,3,5,2,3],6
[1,2,2,3,3,5]
*/
//�ύʱ�䣺2016-12-12 ���ԣ�Java ����ʱ�䣺 96 ms ռ���ڴ棺1233K ״̬������ȷ
import java.util.*;
  
public class MergeSort {
    public int[] mergeSort(int[] A, int n) {
            sort(A, 0, n - 1);
        return A;
    }
 
    public static void sort(int[] A, int left, int right) {
        if (left < right) {
            int mid = (right + left) / 2;
            sort(A, left, mid);
            sort(A, mid + 1, right);
            merge(A, left, mid, right);
        }
    }
 
    public static void merge(int[] A, int left, int mid, int right) {
        //System.out.println(Arrays.toString(A));
        int[] tempArr = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int temp = 0;
        while (i <= mid && j <= right) {
            if (A[i] < A[j]) {
                tempArr[temp++] = A[i++];
            } else {
                tempArr[temp++] = A[j++];
            }
        }
        while (i <= mid) {
            tempArr[temp++] = A[i++];
        }
        while (j <= right) {
            tempArr[temp++] = A[j++];
        }
        int num = 0;
        //System.out.println(Arrays.toString(tempArr));
        while ((num + left) <= right) {
            A[num + left] = tempArr[num++];
        }
 
    }
}