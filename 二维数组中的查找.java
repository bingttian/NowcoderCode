/*
��һ����ά�����У�ÿһ�ж����մ����ҵ�����˳������ÿһ�ж����մ��ϵ��µ�����˳������
�����һ������������������һ����ά�����һ���������ж��������Ƿ��и�������
*/
//�ύʱ�䣺2017-02-22 ���ԣ�Java ����ʱ�䣺 139 ms ռ���ڴ棺5147K ״̬������ȷ
public class Solution {
    public boolean Find(int target, int [][] array) {
int i=array.length-1;
        int j=0;
        while(i>=0 && j<array[0].length){
            if(array[i][j]<target){
                j++;
            }else if(array[i][j]>target){
                i--;
            }else{
                return true;
            }
        }
        return false;
    }
}