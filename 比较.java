/*
��������32λ����a��b�������һ���㷨����a��b�нϴ�ġ����ǲ������καȽ��жϡ���������ͬ����������һ����
������������a��b���뷵�ؽϴ������
����������
1,2
���أ�2
*/
//�ύʱ�䣺2017-01-12 ���ԣ�Java ����ʱ�䣺 31 ms ռ���ڴ棺646K ״̬������ȷ
import java.util.*;
 
public class Compare {
    public int getMax(int a, int b) {
        int c=a-b;
        int as=sign(a); //a�ķ��ţ�1Ϊ�Ǹ���0Ϊ��
        int bs=sign(b);
        int cs=sign(a-b);
         
        int difab=as^bs;    //��ʾa��b�Ƿ���Ų���ͬ������ͬΪ1����ͬΪ0
        int sameab=flip(difab);     //��ʾa��b�Ƿ������ͬ����ͬΪ1������ͬΪ0
         
        int returnA=difab*as+sameab*cs;
        int returnB=flip(returnA);
        return a*returnA+b*returnB;
    }
     
    public static int flip(int n){
        return n^1;
    }
     
    public static int sign(int n){
        return flip(n>>31&1);
    }
}