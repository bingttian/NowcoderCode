/*
ţţ�ٰ���һ�α�̱���,�μӱ�������3*n��ѡ��,ÿ��ѡ�ֶ���һ��ˮƽֵa_i.
����Ҫ����Щѡ�ֽ������,һ�����n������,��ÿ������3��.ţţ���ֶ����ˮƽֵ���ڸö����Ա�еڶ���ˮƽֵ��
����:
һ������������Ա��ˮƽֵ�ֱ���3,3,3.��ô�����ˮƽֵ��3
һ������������Ա��ˮƽֵ�ֱ���3,2,3.��ô�����ˮƽֵ��3
һ������������Ա��ˮƽֵ�ֱ���1,5,2.��ô�����ˮƽֵ��2
Ϊ���ñ������п���,ţţ�밲�Ŷ���ʹ���ж����ˮƽֵ�ܺ����
��������ʾ:
���ţţ��6����Ա���ֵ���������
�������Ϊ:
team1:{1,2,5}, team2:{5,5,8}, ��ʱ��ˮƽֵ�ܺ�Ϊ7.
���������Ϊ:
team1:{2,5,8}, team2:{1,5,5}, ��ʱ��ˮƽֵ�ܺ�Ϊ10.
û�б��ܺ�Ϊ10����ķ���,�������10.
*/
//�ύʱ�䣺2017-06-07 ���ԣ�Java ����ʱ�䣺 407 ms ռ���ڴ棺5271K ״̬������ȷ
import java.util.Arrays;
import java.util.Scanner;
  
public class Main {
  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] data = new int[3*n];
        for (int i = 0; i < 3*n; i++) {
            data[i] = input.nextInt();
        }
        System.out.println(result(n,data));
    }
  
    public static long result(int n,int[] data) {
        Arrays.sort(data);
        long result=0;
        for(int i=1;i<n+1;i++){
            result+=data[3*n-2*i];
        }
        return result;
    }
}