/**
 * @author wangchong
 * @date 2019/5/24 19:47
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Test_05 {
    String str = new String("good");
    char[] ch = {'a','b','c'};

    public static void main(String[] args) {
        Test_05 ex = new Test_05();
        System.out.println(ex.str + " and ");
        System.out.println(ex.ch);
    }
    public void change(String str, char ch[]) {
        str = "test bood";
        ch[0] = 'g';
    }
}
