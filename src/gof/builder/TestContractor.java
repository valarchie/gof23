package gof.builder;

/**
 * Created by
 * author:valarchie
 * on 2019/8/28 0:15
 * mailbox:343928303@qq.com
 **/
public class TestContractor {

    public static void main(String[] args) {

        // 包工头
        Contractor contractor = new Contractor();

        // 石材工人
        Builder stoneBuilder = new StoneBuilder();
        // 建石材房子
        House stoneHouse = contractor.buildHouse(stoneBuilder);
        System.out.println(stoneHouse.toString());

        // 木材工人
        WoodBuilder woodBuilder = new WoodBuilder();
        // 建木材房子
        House woodHouse = contractor.buildHouse(woodBuilder);
        System.out.println(woodHouse.toString());

    }


}
