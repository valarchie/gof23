package gof.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by
 * author:valarchie
 * on 2019/8/29 23:32
 * mailbox:343928303@qq.com
 **/
public class Composite extends Component {

    private List<Component> components = new ArrayList<>();

    @Override
    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void remove(int i) {
        components.remove(i);
    }

    @Override
    public int getPrice() {

        int sum = 0;

        for (Component component : components) {
            sum += component.getPrice();
        }

        return sum;

    }

}
