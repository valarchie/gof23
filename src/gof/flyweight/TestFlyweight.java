package gof.flyweight;

/**
 * Created by
 * author:valarchie
 * on 2019/8/30 12:43
 * mailbox:343928303@qq.com
 **/
public class TestFlyweight {

    public static void main(String[] args) {

        ChessPieceFactory chessPieceFactory = new ChessPieceFactory();

        ChessPiece black1 = chessPieceFactory.getChessPiece("黑");
        black1.placePiece(1, 1);

        ChessPiece white1 = chessPieceFactory.getChessPiece("白");
        white1.placePiece(2,2);

        ChessPiece black2 = chessPieceFactory.getChessPiece("黑");
        black1.placePiece(3, 3);

        ChessPiece white2 = chessPieceFactory.getChessPiece("白");
        white1.placePiece(4,4);


    }


}
