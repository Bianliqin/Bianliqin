package blq;

/**
 * @ClassName AAA
 * @Description TODO
 * @Author huachengyu
 * @Date 2020/10/10
 **/
public class AAA {
    private int money;
    private int getMoney(){
        return money;
    }
    public static void main(String args[]){
        AAA exa = new AAA();
        exa.money = 3000;
        int m = exa.getMoney();
        System.out.println("money = " + m);
    }
}
