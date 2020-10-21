package blq;

/**
 * @ClassName Example5_1
 * @Description TODO
 * @Author huachengyu
 * @Date 2020/10/21
 **/
 class Father{
    private int money;
    protected int height;
    int weight;
}

 class Son extends Father{
    public String hand;
    public String getHand(){
        return hand;
    }
}

 class Grandson extends Son{
    public String foot;
}

public class Example5_1 {
    public static void main(String args[]){
        Son son = new Son();
        Grandson grandson = new Grandson();
        son.height = 180;
        son.hand = "一双大手";
        grandson.height = 155;
        grandson.hand = "一双小脚";
        String str = son.getHand();
        System.out.printf("儿子:%s,%d\n",str,son.height);
        str = grandson.getHand();
        System.out.printf("孙子:%s,%s,%d\n",str,grandson.foot,grandson.height);
    }
}
