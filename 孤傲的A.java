/*
A(AҲ�����ı��)��һ���°����ˣ���һ��n����(���б������Ϊ1��n)�Ķ����У�
�������еı��Ϊb�ͱ��c���˶���ì�ܣ����������������վ�����ڵ�λ�á�
������������A��Ҫ��Ķ����ж����֣�
��������n�������˵ı��A,b��c���뷵������𰸣���֤����С�ڵ���11�Ҵ��ڵ���3��
����������
6,1,2,3
288
*/
//�ύʱ�䣺2017-02-17 ���ԣ�Java ����ʱ�䣺 36 ms ռ���ڴ棺728K ״̬������ȷ
import java.util.*;
 
public class LonelyA {
    public int getWays(int n, int A, int b, int c) {
        int res=cal(n)-cal(n-1)*4+cal(n-2)*2;
        return res;
    }
     
    public static int cal(int n){
        int res=1;
        for(int i=1;i<n+1;i++){
            res*=i;
        }
        return res;
    }
}