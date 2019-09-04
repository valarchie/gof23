package gof.observer;

/**
 * Created by
 * author:valarchie
 * on 2019/9/1 23:46
 * mailbox:343928303@qq.com
 **/
public class Chatroom extends Subject {
    @Override
    public void notifyObserver() {
        // 挨个通知每个观察者
        for (Observer observer : observers) {
            observer.response();
        }
    }

}
