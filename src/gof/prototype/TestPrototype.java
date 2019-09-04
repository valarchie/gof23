package gof.prototype;

/**
 * Created by
 * author:valarchie
 * on 2019/8/28 20:30
 * mailbox:343928303@qq.com
 **/
public class TestPrototype {


    public static void main(String[] args) throws CloneNotSupportedException {

        Sketch sketch1 = new Sketch("A beautiful girl");

        sketch1.show();

        Sketch sketch2 = sketch1.clone();

        sketch2.show();

    }



}
