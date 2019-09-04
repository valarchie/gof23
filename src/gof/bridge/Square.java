package gof.bridge;

/**
 * Created by
 * author:valarchie
 * on 2019/8/29 21:19
 * mailbox:343928303@qq.com
 **/
public class Square extends Shape {

    public Square(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("我是一个" + color.paint() + "的正方形");
    }

}
