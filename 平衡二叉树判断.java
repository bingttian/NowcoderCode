/*
��һ�ö������������һ���㷨�ж���ö������Ƿ�Ϊƽ���������
�����������ĸ����root���뷵��һ��boolֵ������������Ƿ�Ϊƽ���������
*/
//�ύʱ�䣺2017-01-06 ���ԣ�Java ����ʱ�䣺 87 ms ռ���ڴ棺1373K ״̬������ȷ
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
            return -1;//������������Ȳ��1ʱ ����-1
        }
        return r>l?r+1:l+1;
    }
}