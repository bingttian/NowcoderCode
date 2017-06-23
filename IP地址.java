/*
输入一个ip地址串，判断是否合法。
*/
//提交时间：2016-12-09 语言：Java 运行时间： 132 ms 占用内存：1258K 状态：答案正确
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        while(n>0){
            String ip=input.next();
            if(isIP(ip)){
                System.out.println("Yes!");
            }else{
                System.out.println("No!");
            }
            n--;
        }
    }
     
    public static boolean isIP(String ip){
        String[] s=ip.split("\\.");
        if(s.length==4){
            for(int i=0;i<4;i++){
                //转成数字
                int a = Integer.parseInt(s[i]);
                if(a>255||a<0){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}