/*
ţţ��������������Ϊһ��������һ��������������,��������������Ƿǵ������߷ǵݼ�����ġ�
ţţ��һ������Ϊn����������A,��������һ�������ǰ�����A��Ϊ���ɶ�����������,
ţţ��֪�������ٿ��԰���������Ϊ��������������.
��������ʾ,ţţ���԰�����A����Ϊ[1,2,3]��[2,2,1]��������������,
������Ҫ����Ϊ2������������,�������2
*/
//�ύʱ�䣺2017-06-07 ���ԣ�Java ����ʱ�䣺 333 ms ռ���ڴ棺5912K ״̬������ȷ
import java.util.Scanner;
  
public class Main {
  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = input.nextInt();
        }
        System.out.println(result(data));
    }
  
    public static int result(int[] data) {
        if (data.length == 1 || data.length == 2) {
            return 1;
        }
        int num = 1;
        int i = 0;
        int flag = 0;
        while (data[i] == data[i + 1]) {
            i++;
        }
        while (i < data.length - 1) {
            if (data[i] < data[i + 1]) {
                if (flag == 2) {
                    num++;
                    flag = 0;
                }else{
                    flag = 1;
                }
            } else if (data[i] > data[i + 1]) {
                if (flag == 1) {
                    num++;
                    flag = 0;
                }else{
                    flag = 2;
                }
            }
            i++;
        }
        return num;
    }
}