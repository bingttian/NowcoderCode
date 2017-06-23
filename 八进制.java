/*
输入一个整数，将其转换成八进制数输出。
*/
//提交时间：2016-12-06 语言：Java 运行时间： 115 ms 占用内存：1980K 状态：答案正确
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
            ChangetoEight(input.nextInt());
        }
    }
      
    public static void ChangetoEight(int n){
        String s = "";
        while(n>0){
            s = n%8+s;
            n = n/8;
        }
        System.out.println(s);
    }
}