package gof.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by
 * author:valarchie
 * on 2019/9/1 23:42
 * mailbox:343928303@qq.com
 **/
public abstract class Subject {

    protected List<Observer> observers = new ArrayList();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public abstract void notifyObserver();


}
