package app.page;

import app.HomePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

public class App extends BasePage{

    private HomePageObjects homePageObjects = new HomePageObjects();


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
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public static TaxiPage toTaxi() {
        try{
            MobileElement el1 = (MobileElement) driver.findElementById("com.crgt.ilife:id/tv_left");
            el1.click();
        }catch(Exception e){
            log.print(e);
        }//通知权限弹窗

        try{
            MobileElement el2 = (MobileElement) driver.findElementById("com" +
                    ".crgt.ilife:id/iv_dialog_ad_close");
            el2.click();
        }catch(Exception e){
            log.print(e);
        }


        /*MobileElement el3 = (MobileElement) driver.findElementByXPath(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ImageView");
        el3.click();//进入打车*/

        MobileElement el31 = (MobileElement) driver.findElementById("com.crgt.ilife:id/item_functionblock_iv_itemicon");
        el31.click();//打车  id是重复的，但是findelement会默认返回第一个元素
        try{
            MobileElement el4 =(MobileElement) driver.findElementById("com.crgt.ilife:id/iv_dialog_ad_close");
            el4.click();
        }catch (Exception e){
            log.print(e);
        }
        //关闭打车弹窗

        return new TaxiPage();
    }
}
