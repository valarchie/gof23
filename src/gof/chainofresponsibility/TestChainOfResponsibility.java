package gof.chainofresponsibility;

/**
 * Created by
 * author:valarchie
 * on 2019/8/30 21:38
 * mailbox:343928303@qq.com
 **/
public class TestChainOfResponsibility {

    public static void main(String[] args) {

        Leader groupLeader = new GroupLeader();
        Leader manager = new Manager();
        Leader boss = new Boss();

        groupLeader.setNext(manager);
        manager.setNext(boss);

        groupLeader.approve();

    }

}
