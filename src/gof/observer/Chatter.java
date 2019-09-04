package gof.observer;

/**
 * Created by
 * author:valarchie
 * on 2019/9/1 23:49
 * mailbox:343928303@qq.com
 **/
public class Chatter implements Observer {

    private String name;

    public Chatter(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        System.out.println(name + "发送了一条信息：" + message);
    }

    @Override
    public void response() {
        System.out.println(name + "收到一条新消息！");
    }

}
