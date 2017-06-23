/*
编一个程序，读入用户输入的，以“.”结尾的一行文字，
统计一共有多少个单词，并分别输出每个单词含有多少个字符。 
（凡是以一个或多个空格隔开的部分就为一个单词）
*/
//提交时间：2016-12-07 语言：Java 运行时间： 45 ms 占用内存：782K 状态：答案正确
import java.util.Scanner;
 
public class Main{
 
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while (input.hasNext()) {
            String s=input.nextLine();
            word(s);
        }
    }
 
    private static void word(String s) {
        char w = 0;
        int i=0,sum=0;
        while(w!='.'){
            w=s.charAt(i);
            i++;
            if(w==' '){
                if(s.charAt(i-2)!=' '){
                System.out.print(sum+" ");
                sum=0;
                }
            }
            if(w!=' ')
            sum++;
        }
        System.out.println(sum-1);
    }
}