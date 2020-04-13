package app.page;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class App extends BasePage{

    public static void start() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "android");
        desiredCapabilities.setCapability("appPackage","com.crgt.ilife");
        //desiredCapabilities.setCapability("appActivity",".ui.main.MainFloatAcitivity"); //模拟器
        //desiredCapabilities.setCapability("deviceName", "127.0.0.1:7555");
        desiredCapabilities.setCapability("deviceName", "3ac35274");
        desiredCapabilities.setCapability("appActivity",".plugin.sessionmanager.fg.main.SplashActivity"); //启动app时获得
        //desiredCapabilities.setCapability("automationName","UiAutomator1");
        desiredCapabilities.setCapability("noReset",true);
        //desiredCapabilities.setCapability("skipDeviceInitialization",true); //跳过初始化
        desiredCapabilities.setCapability("autoGrantPermissions",true);

        URL remoteUrl = new URL("http://localhost:4723/wd/hub");

        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public static TaxiPage toTaxi() {
//        MobileElement el2 = (MobileElement) driver.findElementById("com.crgt.ilife:id/tv_left");
//        el2.click();//关闭首页访问权限设置
        MobileElement el3 = (MobileElement) driver.findElementByXPath ("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ImageView");
        el3.click();
        //进入打车页面
//        MobileElement el4 = (MobileElement) findElement(By.id("com.crgt.ilife:id/iv_dialog_ad_close"));
//        el4.click(); //关闭弹窗

        return new TaxiPage();
    }
}
