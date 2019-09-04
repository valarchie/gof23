package gof.memento;

/**
 * Created by
 * author:valarchie
 * on 2019/9/1 22:45
 * mailbox:343928303@qq.com
 **/
public class TestMemento {

    public static void main(String[] args) {
        // 发起者
        Originator originator = new Originator();
        // 备忘录工具
        Caretaker caretaker = new Caretaker();

        originator.setState("当前第一关，血量100！");
        caretaker.addMemento(originator.createMemento());
        System.out.println(originator.getState());

        originator.setState("当前第二关，血量50！");
        caretaker.addMemento(originator.createMemento());
        System.out.println(originator.getState());

        originator.setState("当前第三关，血量0！角色死亡！");
        caretaker.addMemento(originator.createMemento());
        System.out.println(originator.getState());

        System.out.println("开始回档！");
        // 开始回档
        originator.restoreMemento(caretaker.getMemento());
        System.out.println(originator.getState());

        originator.restoreMemento(caretaker.getMemento());
        System.out.println(originator.getState());

        originator.restoreMemento(caretaker.getMemento());
        System.out.println(originator.getState());


    }

}
