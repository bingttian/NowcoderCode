/*
һֻ����һ�ο�������1��̨�ף�Ҳ��������2����
�����������һ��n����̨���ܹ��ж�����������
*/
//�ύʱ�䣺2017-01-16 ���ԣ�Java ����ʱ�䣺 28 ms ռ���ڴ棺629K ״̬������ȷ
public class Solution {
    public int JumpFloor(int target) {
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