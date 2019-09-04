package gof.interpreter;

/**
 * Created by
 * author:valarchie
 * on 2019/9/1 16:56
 * mailbox:343928303@qq.com
 **/
public class ValueExpression implements Expresion {

    private int value;

    public ValueExpression(int value) {
        this.value = value;
    }

    @Override
    public int interprete() {
        return value;
    }

}
