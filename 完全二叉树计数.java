/*
给定一棵完全二叉树的根节点root，返回这棵树的节点个数。
如果完全二叉树的节点数为N，请实现时间复杂度低于O(N)的解法。
给定树的根结点root，请返回树的大小。
*/
//提交时间：2017-01-03 语言：Java 运行时间： 85 ms 占用内存：2730K 状态：答案正确
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
public class CountNodes {
    public int count(TreeNode root) {
       int res=0;
        res=countFullTree(root, res);
        return res-1;
    }
     
    public static int countFullTree(TreeNode root,int res){
        if(root==null){
            return res;
        }
        int lhigh=get_high(root);
        int rhigh=get_high(root.right)+1;
        if(lhigh==rhigh){
            res+=Math.pow(2, lhigh)-1;      //满二叉树有“2的n次方减一”个结点
            res++;                          //单独算上头结点
            res=countFullTree(root.right, res);
        }else{
            res+=Math.pow(2,rhigh)-1;
            res++;
            res=countFullTree(root.left, res);
        }
        return res;
    }
     
    public static int get_high(TreeNode root){
        int high=0;
        while(root!=null&&root.left!=null){
            high++;
            root=root.left;
        }
        return high;
    }
}