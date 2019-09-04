package gof.memento;

import java.util.Stack;

/**
 * Created by
 * author:valarchie
 * on 2019/9/1 22:45
 * mailbox:343928303@qq.com
 **/
public class Caretaker {
    // 保存备忘录的栈
    private Stack<Memento> mementos = new Stack<>();
    // 添加到备忘录栈
    public void addMemento(Memento memento) {
        mementos.add(memento);
    }
    // 从栈中获取备忘录
    public Memento getMemento() {
        return mementos.pop();
    }

}
