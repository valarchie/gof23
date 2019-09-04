package gof.bridge;

/**
 * Created by
 * author:valarchie
 * on 2019/8/29 21:20
 * mailbox:343928303@qq.com
 **/
public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("我是一个" + color.paint() + "的园形");
    }

}
