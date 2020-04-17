package app.page;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;

public class BasePage {
    public static AndroidDriver driver;
        public static WebElement findElement(By by){
        try{
            return driver.findElement(by);
        }catch (Exception e){
            handle();
            return driver.findElement(by);
            //return null;
        }

    }

    public static void findElementAndClick(By by){
        try{
            driver.findElement(by).click();
        }catch (Exception e){
            handle1();
            driver.findElement(by).click();

        }

    }


    //处理弹框
    private static void handle() {
        List<By> alertBoxs = new ArrayList<>();
        alertBoxs.add(By.id("com.crgt.ilife:id/iv_dialog_ad_close"));//关闭首页弹窗
        //alertBoxs.add(By.id("com.crgt.ilife:id/tv_left"));//关闭权限通知弹窗
        alertBoxs.add(By.id("com.crgt.ilife:id/iv_dialog_ad_close"));//关闭打车页弹窗

        for (By alert : alertBoxs) {
            By adsLocator = alert;
            List<WebElement> ads = driver.findElements(adsLocator);
            if (ads.size() >= 1) {
                ads.get(0).click();
            }
        }
    //效果同下

//        alertBoxs.forEach(alert -> {
//            By adsLocator = alert;
//            List<WebElement> ads = driver.findElements(adsLocator);
//            if (ads.size() >= 1) {
//                ads.get(0).click();
//            }
//        });
    }



    //处理点击
    private static void handle1() {
        List<By> alertBoxs = new ArrayList<>();
        alertBoxs.add(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout" +
                "/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.view.ViewGroup" +
                "/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout" +
                "/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout"));
        //进入打车
        alertBoxs.add(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView"));
        //点击去哪儿


        for (By alert : alertBoxs) {
            By adsLocator = alert;
            List<WebElement> ads = driver.findElements(adsLocator);
            if (ads.size() >= 1) {
                ads.get(0).click();
            }
        }
        //效果同下

//        alertBoxs.forEach(alert -> {
//            By adsLocator = alert;
//            List<WebElement> ads = driver.findElements(adsLocator);
//            if (ads.size() >= 1) {
//                ads.get(0).click();
//            }
//        });
    }

}
