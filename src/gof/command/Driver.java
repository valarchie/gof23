package gof.command;

/**
 * Created by
 * author:valarchie
 * on 2019/8/31 0:44
 * mailbox:343928303@qq.com
 **/
public class Driver {

    public void requestCommand(Command command) {
        command.execute();
    }

}
