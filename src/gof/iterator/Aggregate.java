package gof.iterator;

/**
 * Created by
 * author:valarchie
 * on 2019/9/1 18:30
 * mailbox:343928303@qq.com
 **/
public interface Aggregate {

    void add(Object o);

    void remove(Object o);

    Iterator iterator();

}
