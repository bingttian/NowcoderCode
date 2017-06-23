/*
����������һ������k��n�η���
�������������˲��õ������ʱ�临�Ӷ�ΪO(1)��
�õ�����k��N�η��Ĺ�����ʵ��ʱ�临�Ӷ�ΪO(logN)�ķ�����
����k��n���뷵��k��n�η���
Ϊ�˷�ֹ������뷵�ؽ��Mod 1000000007��ֵ��
����������
2,3
���أ�8
*/
//�ύʱ�䣺2017-01-04 ���ԣ�Java ����ʱ�䣺 37 ms ռ���ڴ棺729K ״̬������ȷ
import java.util.*;
 
public class QuickPower {
    public int getPower(int k, int N) {
       if(k==0)
            return 0;
         
        long res=1;
        long modNum=1000000007;
        long temp=k;
         
        while(N>0){
            if(N%2==1){
                res*=temp;
            }
            temp=(temp*temp)%modNum;
            res=res%modNum;
            N=N/2;
        }
        return (int)res;
    }
}