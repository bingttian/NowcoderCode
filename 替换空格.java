/*
请实现一个函数，将一个字符串中的空格替换成“%20”。
例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
*/
//提交时间：2017-02-22 语言：Java 运行时间： 33 ms 占用内存：688K 状态：答案正确
public class Solution {
    public String replaceSpace(StringBuffer str) {
        String s="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                s+="%20";
            }else{
                s+=str.charAt(i);
            }
        }
        return s;
    }
}