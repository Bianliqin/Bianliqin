package blq;

/**
 * @ClassName Example4_5
 * @Description TODO
 * @Author huachengyu
 * @Date 2020/10/16
 **/
public class Example4_5 {
    public static void main(String args[]){
        Ci ci =new Ci(10);  //代码1
        System.out.println("main方法中ci的引用:" + ci);
        System.out.println("main方法中ci的半径:" + ci.getRadius());
        Circular circular = new Circular(ci,20);   //代码2
        System.out.println("circular圆锥的bottom的引用:" + circular.bottom);
        System.out.println("圆锥的bottom的半径:" + circular.getBottomRadius());
        System.out.println("圆锥的体积:" + circular.getVolme());
        double r = 8888;
        System.out.println("圆锥更改底圆bottom的半径:" + r);
        circular.setBottomRadius(r);   //代码3
        System.out.println("圆锥的bottom的半径:" + circular.getBottomRadius());
        System.out.println("圆锥的体积:" + circular.getVolme());
        System.out.println("main方法中ci的半径:" + ci.getRadius());
        System.out.println("main方法中ci的引用半径将发生变化");
        Ci ci1 = new Ci(1000);  //重新创建ci(代码4)
        System.out.println("现在main方法中ci的引用:" + ci);
        System.out.println("main方法中ci的半径:" + ci.getRadius());
        System.out.println("但是不影响circular圆锥的bottom的引用");
        System.out.println("circular圆锥的bottom的引用:" + circular.bottom);
        System.out.println("圆锥的bottom的半径:" + circular.getBottomRadius());
    }
}
