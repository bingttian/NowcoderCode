/*
����һ�����飬�����һ����Ч�㷨������Ҫ��������������ĳ��ȡ�
����һ��int����A������Ĵ�Сn���뷵��һ����Ԫ�飬�����������еĳ��ȡ�
(ԭ����λ�ô�0��ʼ���,��ԭ�������򣬷���0)����֤A��Ԫ�ؾ�Ϊ��������
����������
[1,4,6,5,9,10],6
���أ�2
*/
�ύʱ�䣺2016-12-16 ���ԣ�Java ����ʱ�䣺 40 ms ռ���ڴ棺603K ״̬������ȷ
import java.util.*;
 
public class Subsequence {
    public int shortestSubsequence(int[] A, int n) {
        int len=0;
        int max=A[0];
        int min=A[n-1];
        int templ=0,tempr=0;
        for(int i=0;i<n;i++){
            if(max<A[i]){
                max=A[i];
            }else if(max>A[i]){
                templ=i;
            }
        }
        for(int i=n-1;i>=0;i--){
            if(min>A[i]){
                min=A[i];
            }else if(min<A[i]){
                tempr=i;
            }
        }
        //System.out.println(templ+" "+tempr);
        if(templ==0&&tempr==0){
            return 0;
        }
        len=templ-tempr+1;
        return len;
    }
}