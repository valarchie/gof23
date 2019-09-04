package gof.interpreter;

/**
 * Created by
 * author:valarchie
 * on 2019/9/1 17:00
 * mailbox:343928303@qq.com
 **/
public class MinusExpression implements Expresion {

    private Expresion left;
    private Expresion right;

    public MinusExpression(Expresion left, Expresion right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interprete() {
        return left.interprete() - right.interprete();
    }


}
