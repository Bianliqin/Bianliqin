package blq;

/**
 * @ClassName Cir
 * @Description TODO
 * @Author huachengyu
 * @Date 2020/10/16
 **/
public class Cir {
    C bottom;
    double height;
    Cir(Cir c,double h) {   //构造方法，将C类的实例的引用传递给bottom
        bottom = c;
        height = h;
    }
    double getVolme() {
        return bottom.getArea() * height / 3.0;
    }
    double getBottomRadius(){
        return bott
    }// }

}
