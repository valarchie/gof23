package gof.builder;

/**
 * Created by
 * author:valarchie
 * on 2019/8/28 0:09
 * mailbox:343928303@qq.com
 **/
public class StoneBuilder implements Builder {
    @Override
    public String buildBase() {
        return "石材地基";
    }

    @Override
    public String buildWall() {
        return "石材墙";
    }

    @Override
    public String buildRoof() {
        return "石材屋顶";
    }
}
