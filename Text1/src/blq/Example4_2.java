package blq;

/**
 * @ClassName Example4_2
 * @Description TODO
 * @Author huachengyu
 * @Date 2020/10/16
 **/
public class Example4_2 {
    public static void main(String args[]) {
        Hua zhubajie = null, sunwukong = null;
        zhubajie = new Hua();
        sunwukong = new Hua();
        zhubajie.name = PersonName.八戒;
        zhubajie.height = 1.83f;
        zhubajie.weight = 86f;
        zhubajie.head = "猪头";
        sunwukong.name = PersonName.悟空;
        sunwukong.height = 1.66f;
        sunwukong.weight = 1000f;
        sunwukong.head = "猴头";
        System.out.println(zhubajie.name + "的身高:" + zhubajie.height);
        System.out.println(zhubajie.name + "的体重:" + zhubajie.weight);
        System.out.println(zhubajie.name + "的头: " + zhubajie.head);
        System.out.println(sunwukong.name + "的身高:" + sunwukong.height);
        System.out.println(sunwukong.name + "的体重:" + sunwukong.weight);
        System.out.println(sunwukong.name + "的头: " + sunwukong.head);
        zhubajie.speak(zhubajie.name + "我想娶媳妇");
        System.out.println(zhubajie.name + "现在的头:" + zhubajie.head);
        sunwukong.speak(sunwukong.name + "我重" +
                sunwukong.weight + "公斤,想骗八戒背我");
        System.out.println(sunwukong.name + "现在的头:" + sunwukong.head);
    }
}

