import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author wangchong
 * @date 2019/5/24 19:54
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Code_01_Get40 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int pow = (int)Math.pow(i,2);
            String str = String.valueOf(pow);
        }
    }
}
