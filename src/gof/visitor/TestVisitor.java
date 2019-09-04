package gof.visitor;

/**
 * Created by
 * author:valarchie
 * on 2019/9/3 0:04
 * mailbox:343928303@qq.com
 **/
public class TestVisitor {

    public static void main(String[] args) {

        WareHouse wareHouse = new WareHouse();
        // 加入三件衣服 一件裤子
        wareHouse.add(new ShirtElement());
        wareHouse.add(new ShirtElement());
        wareHouse.add(new PantsElement());
        wareHouse.add(new ShirtElement());
        // 盘点衣服
        wareHouse.accept(new ShirtVisitor());
        System.out.println("=======================");
        // 盘点裤子
        wareHouse.accept(new PantsVisitor());


    }

}
