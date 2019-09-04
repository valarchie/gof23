package gof.builder;

/**
 * Created by
 * author:valarchie
 * on 2019/8/27 23:59
 * mailbox:343928303@qq.com
 **/
public interface Builder {
    // 打地基
    String buildBase();
    // 砌墙
    String buildWall();
    // 盖屋顶
    String buildRoof();

}
