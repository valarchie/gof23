package gof.adapter;

/**
 * Created by
 * author:valarchie
 * on 2019/8/28 22:24
 * mailbox:343928303@qq.com
 **/
public class TestAdapter {

    public static void main(String[] args) {

        // 将日本人对象填入翻译对象
        Translator translator = new Translator(new Japanese());

        Chinese chinese = new Chinese();
        // 中国人不直接与日本人交流 而是与翻译
        chinese.listenChinese(translator);

    }

}
