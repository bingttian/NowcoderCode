/*
n����վ�ӣ����ǵı�����δ�1��n��Ҫ����Ϊa���˱����ڱ��Ϊb���˵���ߣ�����Ҫ��һ�����ڣ�
���ʹ��ж������ŷ����ڶ������Ҫ��a������b����ߣ�����һ��Ҫ���ڣ�����һ���ж������ŷ���
��������n�������˵ı��a��b���뷵��һ������Ԫ�ص����飬��������Ԫ������Ϊ��������Ĵ𰸡�
��֤����С�ڵ���10��
����������
7,1,2
���أ�[2520,720]
*/
//�ύʱ�䣺2017-02-17 ���ԣ�Java ����ʱ�䣺 34 ms ռ���ڴ棺729K ״̬������ȷ
import java.util.*;
 
public class StandInLine {
    public int[] getWays(int n, int a, int b) {
       int[] res=new int[2];
        res[0]=cal(n)/2;
        res[1]=cal(n-1);
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