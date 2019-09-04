package gof.prototype;

/**
 * Created by
 * author:valarchie
 * on 2019/8/28 20:28
 * mailbox:343928303@qq.com
 **/
public class Sketch implements Cloneable {

    private String img;

    public Sketch(String content) {
        img = content;
    }

    public void show() {
        System.out.println("画的内容：" + img);
    }

    public Sketch clone() throws CloneNotSupportedException {
        return (Sketch) super.clone();
    }

}
