package blq;

/**
 * @ClassName Compare
 * @Description TODO
 * @Author huachengyu
 * @Date 2020/10/20
 **/
public class Compare {
    public static void main(String[] args) {
        // 声明int型变量number1
        int number1 = 4;
        // 声明int型变量number2
        int number2 = 5;
        System.out.println("number1>number的返回值为：" +(number1 > number2));
        /* 依次将变量number1与变量number2的比较结果输出 */
        System.out.println("number1<number2的返回值为："+(number1 < number2));
        System.out.println("number1==number2返回值为："+(number1== number2));
        System.out.println("number1!=number2返回值为："+(number1 != number2));
        System.out.println("number1>= number2返回值为："+(number1 >= number2));
        System.out.println("number1<=number2返回值为："+(number1 <= number2));
    }
}
