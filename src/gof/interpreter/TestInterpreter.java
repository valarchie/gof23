package gof.interpreter;

/**
 * Created by
 * author:valarchie
 * on 2019/9/1 17:01
 * mailbox:343928303@qq.com
 **/
public class TestInterpreter {

    public static void main(String[] args) {

        // 我们省略了将表达式Parse的过程和Context环境变量类
        // 1+3+4-5
        int result = new MinusExpression(new AddExpression(new AddExpression(new ValueExpression(1),
                new ValueExpression(3)), new ValueExpression(4)),new ValueExpression(5)).interprete();

        System.out.println("计算结果为：" + result);

    }


}
