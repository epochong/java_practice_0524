/**
 * @author wangchong
 * @date 2019/5/24 16:53
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Test_02 {
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("A");
        StringBuffer b = new StringBuffer("B");
        operate(a,b);
        System.out.println(a+ "." + b);
    }
    static void operate(StringBuffer x, StringBuffer y) {
        x.append(y);
        y = x;
    }
}
