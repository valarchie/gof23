package gof.factorymethod;

/**
 * Created by
 * author:valarchie
 * on 2019/8/27 21:42
 * mailbox:343928303@qq.com
 **/
public class TestFactoryMethod {

    public static void main(String[] args) {

        testCar(new Benz4S());
        testCar(new Bmw4S());


    }

    public static void testCar(Abstract4S fourS) {

        Car car = fourS.getCar();
        car.start();

    }

}
