package gof.interpreter;

/**
 * Created by
 * author:valarchie
 * on 2019/9/1 16:57
 * mailbox:343928303@qq.com
 **/
public class AddExpression implements Expresion {

    private Expresion left;
    private Expresion right;

    public AddExpression(Expresion left, Expresion right) {
        this.left = left;
        this.right = right;
    }


    @Override
    public int interprete() {
        return left.interprete() + right.interprete();
    }

}
