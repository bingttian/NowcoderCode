/*
����һ����������arr�������������������������Σ�����������������ż���Σ��ҵ�����������
Ҫ��ʱ�临�Ӷ�ΪO(N)������ռ临�Ӷ�ΪO(1)��
����һ����������arr�����Ĵ�Сn���뷵��һ�����飬
��������Ԫ��Ϊ���������������ε�Ԫ��,�뽫���ǰ���С�������С�
����������
[1,2,4,4,2,1,3,5],8
���أ�[3,5]
*/
//�ύʱ�䣺2017-01-12 ���ԣ�Java ����ʱ�䣺 70 ms ռ���ڴ棺1378K ״̬������ȷ
import java.util.*;
 
public class OddAppearance {
    public int[] findOdds(int[] arr, int n) {
       int[] res=new int[2];
        for(int i=0;i<n;i++){
            res[0]^=arr[i];
        }
        int pos=0;
        while(((res[0]>>pos) & 1) !=1){
            pos++;
        }
        for(int i=0;i<n;i++){
            if(((arr[i]>>pos)&1)!=1){
                res[1]^=arr[i];
            }
        }
        res[0]=res[0]^res[1];
        if(res[0]>res[1]){
            res[0]=res[0]^res[1];
            res[1]=res[0]^res[1];
            res[0]=res[0]^res[1];
        }
        return res;
    }
 
}