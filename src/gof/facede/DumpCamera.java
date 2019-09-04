package gof.facede;

/**
 * Created by
 * author:valarchie
 * on 2019/8/30 0:38
 * mailbox:343928303@qq.com
 **/
public class DumpCamera {

    private Focal focal;
    private Aperture aperture;
    private Shutter shutter;

    public DumpCamera() {
        focal = new Focal();
        aperture = new Aperture();
        shutter = new Shutter();
    }

    // 拍照
    public void takePhoto() {

        focal.adjustFocus();
        aperture.adjustLight();
        shutter.click();

        System.out.println("拍出一张好照片！");

    }


}
