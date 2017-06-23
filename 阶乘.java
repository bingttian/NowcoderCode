/*
输入n， 求y1=1!+3!+...m!(m是小于等于n的最大奇数） 
y2=2!+4!+...p!(p是小于等于n的最大偶数)。
*/
//提交时间：2016-12-06 语言：Java 运行时间： 25 ms 占用内存：277K 状态：答案正确
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            int n=input.nextInt();
            System.out.println(num1(n)+" "+num2(n));
        }
    }
     
    private static int sum(int n) {
        int a=1;
        for(int i=1;i<=n;i++){
            a=i*a;
        }
        return a;
    }
     
    private static int num1(int n) {
        int y1=0;
        for(int i=1;i<=n;i=i+2){
            y1 +=sum(i);
        }
        return y1;
    }
     
    private static int num2(int n) {
        int y2=0;
        for(int i=2;i<=n;i=i+2){
            y2 +=sum(i);
        }
        return y2;
    }
}