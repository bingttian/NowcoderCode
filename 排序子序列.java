/*
牛牛定义排序子序列为一个数组中一段连续的子序列,并且这段子序列是非递增或者非递减排序的。
牛牛有一个长度为n的整数数组A,他现在有一个任务是把数组A分为若干段排序子序列,
牛牛想知道他最少可以把这个数组分为几段排序子序列.
如样例所示,牛牛可以把数组A划分为[1,2,3]和[2,2,1]两个排序子序列,
至少需要划分为2个排序子序列,所以输出2
*/
//提交时间：2017-06-07 语言：Java 运行时间： 333 ms 占用内存：5912K 状态：答案正确
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