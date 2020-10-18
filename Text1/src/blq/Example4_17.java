package blq;

/**
 * @ClassName Example4_17
 * @Description TODO
 * @Author huachengyu
 * @Date 2020/10/18
 **/
class Stu{
    private int age;
    public void setAge(int age){
        if(age>=7&&age<=28){
            this.age=age;
        }
    }
    public int getAge(){
        return age;
    }
}
public class Example4_17 {
    public static void main(String args[]){
        Stu zhang= new Stu();
        Stu geng= new Stu();
        zhang.setAge(23);
        System.out.println("zhang的年龄:" + zhang.getAge());
        geng.setAge(25);
        //"zhang.age=23;"或"geng.age=25;"都是非法的,因为zhang和geng已经不在Stu类中
        System.out.println("geng的年龄:" + geng.getAge());
    }
}
