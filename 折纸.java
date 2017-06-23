/*
请把纸条竖着放在桌?上，然后从纸条的下边向上?对折，压出折痕后再展开。
此时有1条折痕，突起的?向指向纸条的背?，这条折痕叫做“下”折痕 ；
突起的?向指向纸条正?的折痕叫做“上”折痕。
如果每次都从下边向上? 对折，对折N次。请从上到下计算出所有折痕的?向。
给定折的次数n,请返回从上到下的折痕的数组，
若为下折痕则对应元素为"down",若为上折痕则为"up".
测试样例：
1
返回：["down"]
*/
//提交时间：2017-01-07 语言：Java 运行时间： 154 ms 占用内存：1845K 状态：答案正确
import java.util.*;
 
public class FoldPaper {
    public String[] foldPaper(int n) {
        LinkedList<String> list = new LinkedList<String>();
        fold(1, n, true, list);
        String[] res = new String[list.size()];
        int len = list.size();
        for (int i = 0; i < len; i++) {
            res[i] = list.poll();
        }
        return res;
    }
 
    public static void fold(int i, int n, boolean flag, LinkedList<String> list) {
        if (i > n) {
            return;
        }
        fold(i + 1, n, true, list);
        list.add(flag ? "down" : "up");
        fold(i + 1, n, false, list);
    }
}