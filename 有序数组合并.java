/*
��������С���������Ժ������A��B������A��ĩ�����㹻�Ļ��������B��
���дһ����������B�ϲ���A������
������������int����A��B��A�еĻ������0��䣬
ͬʱ����A��B����ʵ��Сint n��int m���뷵�غϲ�������顣
*/
//�ύʱ�䣺2016-12-16 ���ԣ�Java ����ʱ�䣺 157 ms ռ���ڴ棺2414K ״̬������ȷ
import java.util.*;
 
public class Merge {
    public int[] mergeAB(int[] A, int[] B, int n, int m) {
       int a=n-1;
        int b=m-1;
        int i=n+m-1;
        while(a>=0&&b>=0){
            if(A[a]>B[b]){
                A[i--]=A[a--];
            }else{
                A[i--]=B[b--];
            }
        }
        //System.out.println("a="+a+",b="+b);
        while(a>=0){
            A[i--]=A[a--];
        }
        while(b>=0){
            A[i--]=B[b--];
        }
        return A;
    }
}