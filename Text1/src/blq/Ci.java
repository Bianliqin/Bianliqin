package blq;

/**
 * @ClassName C
 * @Description TODO
 * @Author huachengyu
 * @Date 2020/10/16
 **/
public class Ci {
    double radius;

    Ci(double r) {
        radius = r;
    }

    double getArea() {
        return 3.14 * radius * radius;
    }

    void setRadius(double r) {
        radius = r;
    }

    double getRadius() {
        return radius;
    }
}
