package gof.observer;

/**
 * Created by
 * author:valarchie
 * on 2019/9/1 23:51
 * mailbox:343928303@qq.com
 **/
public class TestObserver {

    public static void main(String[] args) {
        // 聊天室
        Subject chatroom = new Chatroom();

        Observer chatter1 = new Chatter("张三");
        Observer chatter2 = new Chatter("李四");
        Observer chatter3 = new Chatter("王五");

        // 依次添加到观察者列表
        chatroom.addObserver(chatter1);
        chatroom.addObserver(chatter2);
        chatroom.addObserver(chatter3);

        ((Chatter) chatter1).sendMessage("大家好！");

        chatroom.notifyObserver();

    }

}
