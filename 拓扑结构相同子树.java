/*
�������ñ˴˶����Ķ�����A��B�����дһ����Ч�㷨��
���A���Ƿ����һ��������B�������˽ṹ��ȫ��ͬ��
�������ö�������ͷ���A��B���뷵��һ��boolֵ��
����A���Ƿ����һ��ͬ����B��������
*/
//�ύʱ�䣺2016-12-19 ���ԣ�Java ����ʱ�䣺 37 ms ռ���ڴ棺772K ״̬������ȷ
import java.util.*;
 
/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}*/
public class IdenticalTree {
    public static boolean chkIdentical(TreeNode A, TreeNode B) {
        String t1Str = treetostring(A);
        String t2Str = treetostring(B);
        //System.out.println(t1Str.toString());
        //System.out.println(t2Str.toString());
        return t1Str.contains(t2Str);
    }
     
    //��tree���string
    public static String treetostring(TreeNode head){
         if(head == null){
                return "#!";
            }
               
            String res = head.val + "!";
            res += treetostring(head.left);
            res += treetostring(head.right);
        return res;
    }
}