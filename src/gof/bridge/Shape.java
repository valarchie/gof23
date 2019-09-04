package gof.bridge;

/**
 * Created by
 * author:valarchie
 * on 2019/8/29 21:15
 * mailbox:343928303@qq.com
 **/
public abstract class Shape {
    // 持有颜色实现
    protected Color color;
    // 抽象画图方法
    public abstract void draw();

    public Shape(Color color) {
        this.color = color;
    }

}
