package gof.iterator;

/**
 * Created by
 * author:valarchie
 * on 2019/9/1 18:39
 * mailbox:343928303@qq.com
 **/
public class TestIterator {

    public static void main(String[] args) {

        Aggregate names = new NameAggregate();

        names.add("张三");
        names.add("李四");
        names.add("王五");
        names.add("赵六");

        Iterator iterator = names.iterator();

        while (iterator.hasNext()) {
            System.out.println("姓名：" + iterator.next());
        }

    }

}
