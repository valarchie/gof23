package gof.builder;

/**
 * Created by
 * author:valarchie
 * on 2019/8/28 0:10
 * mailbox:343928303@qq.com
 **/
public class WoodBuilder implements Builder {
    @Override
    public String buildBase() {
        return "木材地基";
    }

    @Override
    public String buildWall() {
        return "木材墙";
    }

    @Override
    public String buildRoof() {
        return "木材屋顶";
    }
}
