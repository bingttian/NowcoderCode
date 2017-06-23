/*
牛牛手里有一个字符串A，羊羊的手里有一个字符串B，B的长度大于等于A，
所以牛牛想把A串变得和B串一样长，这样羊羊就愿意和牛牛一起玩了。
而且A的长度增加到和B串一样长的时候，对应的每一位相等的越多，
羊羊就越喜欢。比如"abc"和"abd"对应相等的位数为2，为前两位。
牛牛可以在A的开头或者结尾添加任意字符，使得长度和B一样。
现在问牛牛对A串添加完字符之后，不相等的位数最少有多少位？
*/
//提交时间：2017-06-07 语言：Java 运行时间： 22 ms 占用内存：276K 状态：答案正确
import java.util.Scanner;
  
public class Main {
  
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String A=input.nextLine();
        String B=input.nextLine();
        System.out.println(same(A,B));
    }
      
    public static int same(String A,String B){
        int result=A.length();
        for(int i=0;i<B.length()-A.length()+1;i++){
            int temp=0;
            for(int j=0;j<A.length();j++){
                if(A.charAt(j)!=B.charAt(j+i)){
                    temp++;
                }
            }
            result=Math.min(result, temp);
        }
        return result;
    }
}