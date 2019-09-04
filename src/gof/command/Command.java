package gof.command;

/**
 * Created by
 * author:valarchie
 * on 2019/8/30 23:44
 * mailbox:343928303@qq.com
 **/
public abstract class Command {

    protected Car car;

    public Command(Car car) {
        this.car = car;
    }

    public abstract void execute();
}
