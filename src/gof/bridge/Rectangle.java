package gof.bridge;

/**
 * Created by
 * author:valarchie
 * on 2019/8/29 21:16
 * mailbox:343928303@qq.com
 **/
public class Rectangle extends Shape{

    public Rectangle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("我是一个" + color.paint() + "的长方形");
    }
}
