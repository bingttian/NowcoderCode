/*
���õݹ鷽ʽʵ�ֶ���������������ͺ���ı�����ӡ��
����һ���������ĸ����root��
�����η��ض���������������ͺ�������(��ά�������ʽ)��
*/
//�ύʱ�䣺2017-01-04 ���ԣ�Java ����ʱ�䣺 225 ms ռ���ڴ棺5962K ״̬������ȷ
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
public class TreeToSequence {
    public int[][] convert(TreeNode root) {
       LinkedList<TreeNode> qian_list=new LinkedList<TreeNode>();
        LinkedList<TreeNode> zhong_list=new LinkedList<TreeNode>();
        LinkedList<TreeNode> hou_list=new LinkedList<TreeNode>();
        qian_fun(root,qian_list);
        zhong_fun(root,zhong_list);
        hou_fun(root,hou_list);
        int[][] res=new int[3][qian_list.size()];
        print(qian_list, res, 0);
        print(zhong_list, res, 1);
        print(hou_list, res, 2);
        return res;
    }
     
    public static void qian_fun(TreeNode root,LinkedList<TreeNode> list){
        if(root==null){
            return;
        }
        list.add(root);
        qian_fun(root.left, list);
        qian_fun(root.right, list);
    }
     
    public static void zhong_fun(TreeNode root,LinkedList<TreeNode> list){
        if(root==null){
            return;
        }
        zhong_fun(root.left, list);
        list.add(root);
        zhong_fun(root.right, list);
    }
     
    public static void hou_fun(TreeNode root,LinkedList<TreeNode> list){
        if(root==null){
            return;
        }
        hou_fun(root.left, list);
        hou_fun(root.right, list);
        list.add(root);
    }
     
    public static void print(LinkedList<TreeNode> list,int[][] res,int num){
        int i=0;
        while(!list.isEmpty()){
            res[num][i++]=list.poll().val;
        }
    }
}