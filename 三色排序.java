/*
��һ��ֻ��0��1��2����Ԫ�ع��ɵ��������飬
��ʹ�ý�����ԭ�����������ʹ�ü�����������
����һ��ֻ��0��1��2����������A�����Ĵ�С���뷵�����������顣
��֤�����СС�ڵ���500��
����������
[0,1,1,0,2,2],6
���أ�[0,0,1,1,2,2]
*/
//�ύʱ�䣺2016-12-16 ���ԣ�Java ����ʱ�䣺 161 ms ռ���ڴ棺1906K ״̬������ȷ
import java.util.*;
 
public class ThreeColor {
    public int[] sortThreeColor(int[] A, int n) {
    int right=n-1;
        int left=0;
        for(int i=0;i<=right;i++){
            if(A[i]==0){
                swap(A, i, left);
                left++;
                //System.out.println(i);
                //System.out.println(Arrays.toString(A));
            }
            if(A[i]==2){
                System.out.println(i);
                swap(A, i, right);
                right--;
                i--;
                //System.out.println(Arrays.toString(A));
            }
        }
        return A;
    }
     
    static void swap(int[] A, int m, int n) {
        int temp = A[m];
        A[m] = A[n];
        A[n] = temp;
    }
}