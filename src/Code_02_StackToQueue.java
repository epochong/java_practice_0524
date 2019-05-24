import java.util.Stack;

/**
 * @author wangchong
 * @date 2019/5/24 22:02
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Code_02_StackToQueue {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
        pushToPop();
    }

    public  int pop() {
        if (stack2.isEmpty() && stack1.isEmpty()) {
            throw new RuntimeException("Queue is empty!");
        }
        pushToPop();
        return stack2.pop();
    }
    public void pushToPop() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
    }
    public static void main(String[] args) {

    }
}
