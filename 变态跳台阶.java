/*
һֻ����һ�ο�������1��̨�ף�Ҳ��������2��������Ҳ��������n����
�����������һ��n����̨���ܹ��ж�����������
*/
//�ύʱ�䣺2016-12-06 ���ԣ�Java ����ʱ�䣺 31 ms ռ���ڴ棺629K ״̬������ȷ
public class Solution {
    public int JumpFloorII(int target) {
        int sum=1;
        for(int i=1;i<target;i++){
            sum=2*sum;
        }
             return sum;
    }
}