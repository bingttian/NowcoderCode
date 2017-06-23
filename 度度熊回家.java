/*
一个数轴上共有N个点，第一个点的坐标是度度熊现在位置，第N-1个点是度度熊的家。
现在他需要依次的从0号坐标走到N-1号坐标。
但是除了0号坐标和N-1号坐标，他可以在其余的N-2个坐标中选出一个点，
并直接将这个点忽略掉，问度度熊回家至少走多少距离？
*/
//提交时间：2017-06-22 语言：Java 运行时间： 40 ms 占用内存：9176K 状态：答案正确
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