/*
һ�ö�����ԭ�������������������������������ڵ������λ�ã�
ʹ����ö��������������������������ҵ�����������ڵ㲢�������ǵ�ֵ��
��֤�������н���ֵ������ͬ��
����һ�����ĸ���㣬�뷵������������λ�õ�ֵ������С��ֵ��ǰ��
*/
//�ύʱ�䣺2017-01-09 ���ԣ�Java ����ʱ�䣺 107 ms ռ���ڴ棺1232K ״̬������ȷ
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
public class FindErrorNode {
    public int[] findError(TreeNode root) {
        LinkedList<TreeNode> queue=new LinkedList<TreeNode>();
        zhong_fun(root, queue);
        int[] res=new int[2];
        int len=queue.size();
        int k=1;
        int n=queue.poll().val;
        for(int i=0;i<len-1;i++){
            int m=queue.poll().val;
            System.out.println(n+" "+m);
            if(n>m){
                if(res[1]==0){
                    res[1]=n;
                }else{
                    res[0]=m;
                }
                res[0]=m;
            }
            n=m;
        }
        return res;
    }
     
    public static void zhong_fun(TreeNode root,LinkedList<TreeNode> list){
        if(root==null){
            return;
        }
        zhong_fun(root.left, list);
        list.add(root);
        zhong_fun(root.right, list);
    }
}