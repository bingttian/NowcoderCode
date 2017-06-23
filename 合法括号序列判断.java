/*
对于一个字符串，请设计一个算法，判断其是否为一个合法的括号串。
给定一个字符串A和它的长度n，
请返回一个bool值代表它是否为一个合法的括号串。
测试样例：
"(()())",6
返回：true
测试样例：
"()a()()",7
返回：false
测试样例：
"()(()()",7
返回：false
*/
//提交时间：2016-12-21 语言：Java 运行时间： 33 ms 占用内存：583K 状态：答案正确
import java.util.*;
 
public class Parenthesis {
    public static boolean chkParenthesis(String A, int n) {
        char[] str=A.toCharArray();
        int count=0;
        for(int i=0;i<n;i++){
            if(str[i]=='('){
                count++;
            }else if(str[i]==')'){
                if(count<0){
                    return false;
                }else{
                    count--;
                }
            }else{
                if(count<0){
                    return false;
                }
            }
        }
        if(count==0){
            return true;
        }
        return false;
    }
}