/*
有一棵二叉树,请设计一个算法判断它是否是完全二叉树。
给定二叉树的根结点root，请返回一个bool值代表它是否为完全二叉树。
树的结点个数小于等于500。
*/
//提交时间：2017-01-06 语言：Java 运行时间： 81 ms 占用内存：1359K 状态：答案正确
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
public class CheckCompletion {
    public boolean chk(TreeNode root) {
        LinkedList<TreeNode> queue=new LinkedList<TreeNode>();
        queue.push(root);
        boolean flag=true;
        TreeNode cur=null;
        while(!queue.isEmpty()){
            cur=queue.pollLast();
            if(cur.right!=null&&cur.left==null){
                return false;
            }
            if(!flag&&(cur.left!=null||cur.right!=null)){
                return false;
            }
            if(cur.left!=null){
                queue.push(cur.left);
            }else{
                flag=false;
            }
            if(cur.right!=null){
                queue.push(cur.right);
            }else{
                flag=false;
            }
        }
        return true;
    }
}