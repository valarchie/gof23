package gof.adapter;

/**
 * Created by
 * author:valarchie
 * on 2019/8/28 22:19
 * mailbox:343928303@qq.com
 **/
public class Translator implements ChineseSpeaker{

    private Japanese japanese;

    public Translator(Japanese japanese) {
        this.japanese = japanese;
    }

    public String sayChinese() {

        if (japanese.sayJapanese().equals("konichiwa")) {
            return "你好！";
        } else {
            return "听不懂";
        }

    }

}
