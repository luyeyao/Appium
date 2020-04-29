package app.page;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

public class BasePage {
    public static AndroidDriver driver;

    public static boolean isElementAppear(MobileElement mobileElement){
        try{
            log.print("检查元素是否存在");
            WebDriverWait wait = new WebDriverWait(driver,2);
            wait.withTimeout(Duration.ofSeconds(2));
            wait.until(ExpectedConditions.visibilityOf(mobileElement));
            return true;
        }catch (Exception e){
            log.print("元素不存在");
            return false;
        }
    }
    public static boolean isElementDisAppear(MobileElement mobileElement) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 5);
            wait.until(ExpectedConditions.invisibilityOf(mobileElement));
            return true;
        } catch (TimeoutException e) {
            log.print("元素存在");
            return false;
        }


    }







    //遍历处理弹窗
        public static WebElement findElement(By by){
        try{
            return driver.findElement(by);
        }catch (Exception e){
            handle();
            return driver.findElement(by);
            //return null;
        }

    }

    //处理弹框
    private static void handle() {
        List<By> alertBoxs = new ArrayList<>();
//        alertBoxs.add(By.xpath("/hierarchy/android.widget.FrameLayout/android" +
//                ".widget.FrameLayout/android.widget.FrameLayout/android" +
//                ".widget.LinearLayout/android.widget.ImageView[2]"));//关闭首页弹窗

        WebElement element1 = findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android" +
                ".widget.FrameLayout/android.widget.FrameLayout/android" +
                ".widget.LinearLayout/android.widget.ImageView[2]"));
        if (element1.isDisplayed()) {
            alertBoxs.add(By.xpath("/hierarchy/android.widget.FrameLayout/android" +
                    ".widget.FrameLayout/android.widget.FrameLayout/android" +
                    ".widget.LinearLayout/android.widget.ImageView[2]"));//关闭首页弹窗
        }


        WebElement element = findElement(By.id("com.crgt.ilife:id/tv_left"));
        if(element.isDisplayed()){
            alertBoxs.add(By.id("com.crgt.ilife:id/tv_left"));//关闭权限通知弹窗
        }

        alertBoxs.add(By.id("/hierarchy/android.widget.FrameLayout/android" +
                ".widget.FrameLayout/android.widget.FrameLayout/android" +
                ".widget.LinearLayout/android.widget.ImageView[2]"));//关闭打车页弹窗

//        for (By alert : alertBoxs) {
//            By adsLocator = alert;
//            List<WebElement> ads = driver.findElements(adsLocator);
//            if (ads.size() >= 1) {
//                ads.get(0).click();
//            }
//        }
    //效果同下

        alertBoxs.forEach(alert -> {
            By adsLocator = alert;
            List<WebElement> ads = driver.findElements(adsLocator);
            if (ads.size() >= 1) {
                ads.get(0).click();
            }
        });
    }


}
