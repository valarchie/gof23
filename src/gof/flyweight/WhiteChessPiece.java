package gof.flyweight;

/**
 * Created by
 * author:valarchie
 * on 2019/8/30 12:37
 * mailbox:343928303@qq.com
 **/
public class WhiteChessPiece implements ChessPiece {

    private String color = "白子";

    @Override
    public void placePiece(int x, int y) {
        System.out.println(color + "下在棋盘下标为" + x + "," + y + "的位置！");
    }

}
