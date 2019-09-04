package gof.builder;

/**
 * Created by
 * author:valarchie
 * on 2019/8/27 23:59
 * mailbox:343928303@qq.com
 **/
public class Contractor {

    // 工人
    private Builder builder;

    // 建造房子
    public House buildHouse(Builder builder) {

        House house = new House();
        // 1.打地基 2.砌墙 3.盖屋顶
        house.setBase(builder.buildBase());
        house.setWall(builder.buildWall());
        house.setRoof(builder.buildRoof());

        return house;
    }


}
