/*
���ǿ�����2*1��С���κ��Ż�������ȥ���Ǹ���ľ��Ρ�
������n��2*1��С�������ص��ظ���һ��2*n�Ĵ���Σ��ܹ��ж����ַ�����
*/
//�ύʱ�䣺2017-01-16 ���ԣ�Java ����ʱ�䣺 34 ms ռ���ڴ棺629K ״̬������ȷ
public class Solution {
    public int RectCover(int target) {
int f1=1,f2=2,f3=0,i=3;
        if(target==1){
            return 1;
            }
        if(target==2){
            return 2;
            }
        while(i<=target){
            f3=f1+f2;
            f1=f2;
            f2=f3;
            i++;
        }
        return f3;
    }
 
}