/*
��ʵ��һ����������һ���ַ����еĿո��滻�ɡ�%20����
���磬���ַ���ΪWe Are Happy.�򾭹��滻֮����ַ���ΪWe%20Are%20Happy��
*/
//�ύʱ�䣺2017-02-22 ���ԣ�Java ����ʱ�䣺 33 ms ռ���ڴ棺688K ״̬������ȷ
public class Solution {
    public String replaceSpace(StringBuffer str) {
        String s="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                s+="%20";
            }else{
                s+=str.charAt(i);
            }
        }
        return s;
    }
}