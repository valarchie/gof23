package gof.iterator;

/**
 * Created by
 * author:valarchie
 * on 2019/9/1 18:33
 * mailbox:343928303@qq.com
 **/
public class NameAggregate implements Aggregate {

    private String[] names = new String[16];

    @Override
    public void add(Object o) {

        for (int i = 0; i < names.length; i++) {
            if (names[i] == null) {
                names[i] = (String) o;
                break;
            }
        }

    }

    @Override
    public void remove(Object o) {

        for (int i = 0; i < names.length; i++) {
            if (names[i] == o) {
                names[i] = null;
            }
        }

    }

    @Override
    public Iterator iterator() {
        return new NameIterator(names);
    }

}
