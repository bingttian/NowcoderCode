/*
给出一个区间[a, b]，计算区间内“神奇数”的个数。
神奇数的定义：存在不同位置的两个数位，组成一个两位数（且不含前导0），且这个两位数为质数。
比如：153，可以使用数字3和数字1组成13，13是质数，满足神奇数。
同样153可以找到31和53也为质数，只要找到一个质数即满足神奇数。
*/
//提交时间：2017-06-07 语言：Java 运行时间： 108 ms 占用内存：4881K 状态：答案正确
import java.util.ArrayList;
import java.util.Scanner;
  
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min = input.nextInt();
        int max = input.nextInt();
        System.out.println(result(min,max));
    }
  
    public static int result(int min,int max) {
        int num=0;
        for(int i=min;i<=max;i++){
            if(flag(i)){
                num++;
            }
        }
        return num;
    }
      
    public static boolean flag(int index){
        ArrayList<Integer> num = new ArrayList<Integer>();
        while(index>0){
            num.add(index%10);
            index/=10;
        }
        while(num.size()>1){
            for (int j = 1; j < num.size(); j++) {
                String temp = num.get(0).toString() + num.get(j).toString();
                if (num.get(0) != 0 && iszhi(temp)) {
                    return true;
                }
                temp = num.get(j).toString() + num.get(0).toString();
                if (num.get(j) != 0 && iszhi(temp)) {
                    return true;
                }
            }
            num.remove(0);
        }
        return false;
    }
      
    public static boolean iszhi(String num){
        if(Integer.valueOf(num)==2){
            return false;
        }
        for(int i=2;i<Integer.valueOf(num);i++){
            if(Integer.valueOf(num)%i ==0){
                return false;
            }
        }
        return true;
    }
}