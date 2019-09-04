package gof.composite;

/**
 * Created by
 * author:valarchie
 * on 2019/8/29 23:24
 * mailbox:343928303@qq.com
 **/
public abstract class Component {

    private int price;

    public abstract void add(Component component);

    public abstract void remove(int i);

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
