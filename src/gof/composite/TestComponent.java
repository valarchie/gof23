package gof.composite;

/**
 * Created by
 * author:valarchie
 * on 2019/8/29 23:36
 * mailbox:343928303@qq.com
 **/
public class TestComponent {

    public static void main(String[] args) {

        // 大零件A由三个小零件A1,A2,A3组成
        Component bigPartA = new Composite();
        Component partA1 = new Leaf(1);
        Component partA2 = new Leaf(2);
        Component partA3 = new Leaf(3);
        bigPartA.add(partA1);
        bigPartA.add(partA2);
        bigPartA.add(partA3);

        System.out.println("大零件A的价钱为：" + bigPartA.getPrice());

        // 大零件B由三个小零件A1,A2,A3组成
        Component bigPartB = new Composite();
        Component partB1 = new Leaf(4);
        Component partB2 = new Leaf(5);
        Component partB3 = new Leaf(6);
        bigPartB.add(partB1);
        bigPartB.add(partB2);
        bigPartB.add(partB3);

        System.out.println("大零件B的价钱为：" + bigPartB.getPrice());

        // 大零件C由三个小零件A1,A2,A3组成
        Component bigPartC = new Composite();
        Component partC1 = new Leaf(7);
        Component partC2 = new Leaf(8);
        Component partC3 = new Leaf(9);
        bigPartC.add(partC1);
        bigPartC.add(partC2);
        bigPartC.add(partC3);

        System.out.println("大零件C的价钱为：" + bigPartC.getPrice());

        // 成品由大零件ABC构成
        Component whole = new Composite();

        whole.add(bigPartA);
        whole.add(bigPartB);
        whole.add(bigPartC);

        System.out.println("整个零件的价钱为：" + whole.getPrice());

    }

}
