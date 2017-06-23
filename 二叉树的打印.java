/*
��һ�ö������������һ���㷨�����ղ�δ�ӡ��ö�������
�����������ĸ����root���뷵�ش�ӡ�����
�������ÿһ��һ��������д��棬���������˳���ղ����������£�
��ÿһ���������Ԫ�ذ��մ����������С���֤�����С�ڵ���500��
*/
//�ύʱ�䣺2016-12-11 ���ԣ�Java ����ʱ�䣺 33 ms ռ���ڴ棺709K ״̬������ȷ
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
public class TreePrinter {
    public int[][] printTree(TreeNode root) {
       if(root==null)
            return null;
        LinkedList<TreeNode> queue=new LinkedList<TreeNode>();
        ArrayList<Integer> arr=new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> layer=new ArrayList<ArrayList<Integer>>();
        TreeNode last=root;
        TreeNode nlast=null;
        TreeNode temp=null;
        queue.add(root);
        while(!queue.isEmpty()){
            temp=queue.poll();
            arr.add(temp.val);
            if(temp.left!=null){
                queue.add(temp.left);
                nlast=temp.left;
            }
            if(temp.right!=null){
                queue.add(temp.right);
                nlast=temp.right;
            }
            if(temp==last){
                layer.add(arr);
                arr=new ArrayList<Integer>();
                last=nlast;
            }
        }
         
        int[][] a=new int[layer.size()][];
        for(int i=0;i<layer.size();i++){
            a[i]=new int[layer.get(i).size()];
            for(int j=0;j<layer.get(i).size();j++){
                a[i][j]=layer.get(i).get(j);
            }
        }
         
        return a;
    }
}