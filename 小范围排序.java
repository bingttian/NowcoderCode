/*
��֪һ��������������飬����������ָ������������ź�˳��Ļ���ÿ��Ԫ���ƶ��ľ�����Բ�����k������k�����������˵�Ƚ�С����ѡ��һ�����ʵ������㷨���������ݽ�������
����һ��int����A��ͬʱ����A�Ĵ�Сn�������е�k���뷵�����������顣
����������
[2,1,4,3,6,5,8,7,10,9],10,2
���أ�[1,2,3,4,5,6,7,8,9,10]
*/
//�ύʱ�䣺2016-12-15 ���ԣ�Java ����ʱ�䣺 558 ms ռ���ڴ棺4941K ״̬������ȷ
import java.util.*;
 
public class ScaleSort {
    public static int[] sortElement(int[] A, int n, int k) {
        /*
         * ����һ�����жѵ�����(��i��k+i)���������ҵ�min Ȼ��i++����������ƶ�1��ֱ��i=n
         */
        for (int i = 0; i < n; i++) {
            //System.out.println("i="+i);
            if(k+i-1>=n){
                //System.out.println("hi");
                k--;
            }
            if(i!=n-2){
                adjust(A, i, k + i - 1,k);
            }  
            //System.out.println(Arrays.toString(A));
        }
        return A;
    }
 
    public static void adjust(int[] A, int start, int end,int len) {
        //System.out.println("start="+start+",end="+end);
        //System.out.println("len="+len);
        int index = (len - 1)/ 2;
        for (; index >= 0; index--) {
            int lchild = index * 2 ;
            int rchild = index * 2+1;
            if (rchild <len && A[rchild+start] < A[index+start]) {
                swap(A, rchild+start, index+start);
            }
            //System.out.println(lchild+start);
            if (A[lchild+start] < A[index+start]) {
                //System.out.println("temp[index]="+temp[index]+",temp[lchild]="+temp[lchild]);
                swap(A, lchild+start, index+start);
            }
            //System.out.println(Arrays.toString(A));
        }
        //System.out.println(Arrays.toString(A));
    }
 
    static void swap(int[] A, int m, int n) {
        int temp = A[m];
        A[m] = A[n];
        A[n] = temp;
    }
}