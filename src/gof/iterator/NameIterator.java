package gof.iterator;

/**
 * Created by
 * author:valarchie
 * on 2019/9/1 18:36
 * mailbox:343928303@qq.com
 **/
public class NameIterator implements Iterator {

    private String[] names = null;
    // 游标
    private int cursor = -1;

    public NameIterator(String[] strings) {
        this.names = strings;
    }


    @Override
    public Object first() {
        cursor = -1;
        return names[cursor + 1];
    }

    @Override
    public Object next() {
        return names[++cursor];
    }

    @Override
    public boolean hasNext() {
        if (cursor + 1 == names.length) {
            return false;
        }
        return names[cursor + 1] != null;
    }

}
