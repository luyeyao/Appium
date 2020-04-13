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
            driver.findElement(by);
        }catch (Exception e){
            handle();
            driver.findElement(by);

        }

    }

    private static void handle() {
        List<By> alertBoxs = new ArrayList<>();
        alertBoxs.add(By.id("com.crgt.ilife:id/iv_dialog_ad_close"));//关闭首页弹窗
        alertBoxs.add(By.id("com.crgt.ilife:id/tv_left"));//关闭通知弹窗
        alertBoxs.add(By.id("com.crgt.ilife:id/iv_dialog_ad_close"));//关闭打车页弹窗


        alertBoxs.forEach(alert -> {
            By adsLocator = alert;
            List<WebElement> ads = driver.findElements(adsLocator);
            if (ads.size() >= 1) {
                ads.get(0).click();
            }
        });
    }


}
