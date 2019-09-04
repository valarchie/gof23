package gof.command;

/**
 * Created by
 * author:valarchie
 * on 2019/8/30 23:45
 * mailbox:343928303@qq.com
 **/
public class StartCommand extends Command {

    public StartCommand(Car car) {
        super(car);
    }

    @Override
    public void execute() {
        car.start();
    }

}
