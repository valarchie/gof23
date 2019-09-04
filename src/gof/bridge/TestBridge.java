package gof.bridge;

/**
 * Created by
 * author:valarchie
 * on 2019/8/29 21:23
 * mailbox:343928303@qq.com
 **/
public class TestBridge {


    public static void main(String[] args) {

        // 三种不同的长方形
        Shape redRectangle = new Rectangle(new Red());
        Shape yellowRectangle = new Rectangle(new Yellow());
        Shape blueRectangle = new Rectangle(new Blue());

        redRectangle.draw();
        yellowRectangle.draw();
        blueRectangle.draw();

        // 三种不同的正方形
        Shape redSquare = new Square(new Red());
        Shape yellowSquare = new Square(new Yellow());
        Shape blueSquare = new Square(new Blue());

        redSquare.draw();
        yellowSquare.draw();
        blueSquare.draw();

        // 三个不同的圆形
        Shape redCircle = new Circle(new Red());
        Shape yellowCircle = new Circle(new Yellow());
        Shape blueCircle = new Circle(new Blue());

        redCircle.draw();
        yellowCircle.draw();
        blueCircle.draw();

    }

}
