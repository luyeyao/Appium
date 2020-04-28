package app.page;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePageObjects {
    @AndroidFindBy(id = "com.crgt.ilife:id/tv_left")
    public MobileElement permissionCloseButton;

    @AndroidFindBy(id = "com.crgt.ilife:id/iv_dialog_ad_close")
    public MobileElement adPopBannerCloseButton;
}
