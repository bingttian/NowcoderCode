/*
һ�������Ϲ���N���㣬��һ����������Ƕȶ�������λ�ã���N-1�����Ƕȶ��ܵļҡ�
��������Ҫ���εĴ�0�������ߵ�N-1�����ꡣ
���ǳ���0�������N-1�����꣬�������������N-2��������ѡ��һ���㣬
��ֱ�ӽ��������Ե����ʶȶ��ܻؼ������߶��پ��룿
*/
//�ύʱ�䣺2017-06-22 ���ԣ�Java ����ʱ�䣺 40 ms ռ���ڴ棺9176K ״̬������ȷ
import java.util.Scanner;
  
public class Main {
  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] data = new int[num];
        for (int i = 0; i < num; i++) {
            data[i] = input.nextInt();
        }
        System.out.println(result(num, data));
    }
  
    public static int result(int num, int[] data) {
        int[] dis = new int[num - 2];
        for (int i = 0; i < num - 2; i++) {
            dis[i] = Math.abs(data[i + 1] - data[i]) + Math.abs(data[i + 2] - data[i + 1]);
        }
        int max = 0;
        int flag = -1;
        for (int i = 0; i < num - 2; i++) {
            if (dis[i] > max) {
                flag = i;
                max = dis[i];
            }
        }
        data[flag + 1] = data[flag];
        int res = 0;
        for (int i = 0; i < num - 1; i++) {
            res += Math.abs(data[i + 1] - data[i]);
        }
        return res;
    }
}