/*
��һ�ö�����,�����һ���㷨�ж����Ƿ�����ȫ��������
�����������ĸ����root���뷵��һ��boolֵ�������Ƿ�Ϊ��ȫ��������
���Ľ�����С�ڵ���500��
*/
//�ύʱ�䣺2017-01-06 ���ԣ�Java ����ʱ�䣺 81 ms ռ���ڴ棺1359K ״̬������ȷ
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