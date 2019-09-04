package gof.command;

/**
 * Created by
 * author:valarchie
 * on 2019/8/31 0:43
 * mailbox:343928303@qq.com
 **/
public class RunCommand extends Command {
    public RunCommand(Car car) {
        super(car);
    }

    @Override
    public void execute() {
        car.run();
    }
}
