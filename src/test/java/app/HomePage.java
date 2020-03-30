package app;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.TestCase;
import org.junit.*;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

public class HomePage {

        private AndroidDriver driver;

        @Before
        public void setUp() throws MalformedURLException {
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability("platformName", "android");
            desiredCapabilities.setCapability("appPackage","com.crgt.ilife");
            //desiredCapabilities.setCapability("appActivity",".ui.main.MainFloatAcitivity");
            //desiredCapabilities.setCapability("deviceName", "127.0.0.1:7555");
            desiredCapabilities.setCapability("deviceName", "1df3d7b1");
            desiredCapabilities.setCapability("appActivity",".plugin.sessionmanager.fg.main.SplashActivity");

            desiredCapabilities.setCapability("noReset",true);
            //desiredCapabilities.setCapability("skipDeviceInitialization",true);
            desiredCapabilities.setCapability("autoGrantPermissions",true);

            URL remoteUrl = new URL("http://localhost:4723/wd/hub");

            driver = new AndroidDriver(remoteUrl, desiredCapabilities);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        }

        @Test
        public void sampleTest() {
//            MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout
//            /android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[5]");或者[1]看app的位置
//            el2.click();
            //MobileElement el3 = (MobileElement) driver.findElementById("com.crgt.ilife:id/tv_one_button");
            //el3.click();
            MobileElement el4 = (MobileElement) driver.findElementById("com.crgt.ilife:id/iv_dialog_ad_close");
            el4.click(); //关闭首页弹窗
        }

//        @After
//        public void tearDown() {
//            driver.quit();
//        }


}
