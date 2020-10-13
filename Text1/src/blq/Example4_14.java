package blq;

/**
 * @ClassName Example4_14
 * @Description TODO
 * @Author huachengyu
 * @Date 2020/10/13
 **/

public class Example4_14 {
    public static void main(String args[]){
        Triangle tir = new Triangle(12,-3,100);
        tir.计算面积();
        tir.修改三边(3,4,5);
        tir.计算面积();
    }
}
