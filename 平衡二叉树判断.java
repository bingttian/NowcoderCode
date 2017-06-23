/*
有一棵二叉树，请设计一个算法判断这棵二叉树是否为平衡二叉树。
给定二叉树的根结点root，请返回一个bool值，代表这棵树是否为平衡二叉树。
*/
//提交时间：2017-01-06 语言：Java 运行时间： 87 ms 占用内存：1373K 状态：答案正确
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
public class CheckBalance {
    public boolean check(TreeNode root) {
    return getHeight(root)>=0;
    }
     
    public static int getHeight(TreeNode root){
        if(root==null){
            return 0;
        }
        int l=getHeight(root.left);
        int r=getHeight(root.right);
        if(l<0||r<0){
            return -1;
        }
        if ((Math.abs(r-l)>1)){
            return -1;//当左右两边深度差超过1时 返回-1
        }
        return r>l?r+1:l+1;
    }
}