/*
�����һ����Ч�㷨���ж��������Ƿ����ظ�ֵ�����뱣֤����ռ临�Ӷ�ΪO(1)��
����һ��int����A�����Ĵ�Сn���뷵�����Ƿ����ظ�ֵ��
����������
[1,2,3,4,5,5,6],7
���أ�true
*/
//�ύʱ�䣺2016-12-16 ���ԣ�Java ����ʱ�䣺 702 ms ռ���ڴ棺3900K ״̬������ȷ
import java.util.*;
 
public class Checker {
    public boolean checkDuplicate(int[] a, int n) {
       for (int i = n / 2; i >= 0; i--) {
            heapSort(a, i);
        }
        for (int i = n - 1; i > 0; i--) {
            // System.out.println(Arrays.toString(a));
            swap(a, 0, i);
            heapSort(a, i);
            //System.out.println(Arrays.toString(a));
        }
        for (int i = 0; i < n - 1; i++) {
            if (a[i] == a[i + 1]) {
                return true;
            }
        }
        return false;
    }
 
    public static void heapSort(int[] A, int n) {
 
            int index = (n - 1) / 2;
            for (; index >= 0; index--) {
                int lchild = index * 2;
                int rchild = index * 2 + 1;
                if (rchild < n && A[rchild] > A[index]) {
                    swap(A, rchild, index);
                }
                if (A[lchild] > A[index]) {
                    swap(A, lchild, index);
                }
            }
        }
     
 
    static void swap(int[] A, int m, int n) {
        int temp = A[m];
        A[m] = A[n];
        A[n] = temp;
    }
}