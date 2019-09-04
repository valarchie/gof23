package gof.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by
 * author:valarchie
 * on 2019/8/30 12:38
 * mailbox:343928303@qq.com
 **/
public class ChessPieceFactory {

    Map<String, ChessPiece> chessPieceMap = new HashMap<>();

    public ChessPieceFactory() {

        chessPieceMap.put("黑", new BlackChessPiece());
        chessPieceMap.put("白", new WhiteChessPiece());

    }


    public ChessPiece getChessPiece(String color) {

        return chessPieceMap.get(color);

    }


}
