package blq;

/**
 * @ClassName Calculation
 * @Description TODO
 * @Author huachengyu
 * @Date 2020/10/20
 **/
public class Calculation {
    public static void main(String[] args) {
        // 声明int型变量a
        int a = 2;
        // 声明int型变量b
        int b = 5;
        // 声明布尔型变量，用于保存应用逻辑运算符“&&”后的返回值
        boolean result = ((a > b) && (a != b));
        // 声明布尔型变量，用于保存应用逻辑运算符“||”后的返回值
        boolean result2 = ((a > b) || (a != b));
        // 将变量result输出
        System.out.println(result);
        // 将变量result2输出
        System.out.println(result2);
    }
}
