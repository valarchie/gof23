package gof.command;

/**
 * Created by
 * author:valarchie
 * on 2019/8/31 0:48
 * mailbox:343928303@qq.com
 **/
public class TestCommand {

    public static void main(String[] args) {

        Car car = new Car();

        Command start = new StartCommand(car);
        Command run = new RunCommand(car);

        Driver driver = new Driver();

        driver.requestCommand(start);
        driver.requestCommand(run);

    }
}
