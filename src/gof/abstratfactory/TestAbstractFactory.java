package gof.abstratfactory;

/**
 * Created by
 * author:valarchie
 * on 2019/8/27 20:54
 * mailbox:343928303@qq.com
 **/
public class TestAbstractFactory {

    public static void main(String[] args) {

        eatBurgerAndCola(new KentuckyFactory());

        eatBurgerAndCola(new McDonaldFactory());


    }


    public static void eatBurgerAndCola(AbstractFactory factory) {

        Burger burger = factory.getBurger();

        burger.eat();

        Cola cola = factory.getCola();

        cola.drink();

    }



}
