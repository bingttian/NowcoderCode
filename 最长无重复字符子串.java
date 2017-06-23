/*
对于一个字符串,请设计一个高效算法，找到字符串的最长无重复字符的子串长度。
给定一个字符串A及它的长度n，请返回它的最长无重复字符子串长度。
保证A中字符全部为小写英文字符，且长度小于等于500。
测试样例：
"aabcb",5
返回：3
*/
//提交时间：2016-12-21 语言：Java 运行时间： 42 ms 占用内存：647K 状态：答案正确
import java.util.*;
 
public class DistinctSubstring {
    public static int longestSubstring(String A, int n) {
        char[] str=A.toCharArray();
        int[] map=new int[256];
        for (int i = 0; i < 256; i++) {
            map[i] = -1;
        }
        int pre=-1;
        int len=0;
        int cur=0;
        for(int i=0;i<n;i++){
            pre=Math.max(pre, map[str[i]]);
            cur=i-pre;
            len=Math.max(cur, len);
            map[str[i]]=i;
        }
        return len;
    }
}