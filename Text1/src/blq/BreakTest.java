package blq;

/**
 * @ClassName BreakTest
 * @Description TODO
 * @Author huachengyu
 * @Date 2020/10/22
 **/
public class BreakTest {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
            //如果i等于6则跳出循环
            if (i == 6) {
                break;
            }
        }
        //显示程序结束
        System.out.println("---end---");
    }
}
