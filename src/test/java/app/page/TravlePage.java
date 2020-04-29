package app.page;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import static app.page.App.driver;

public class TravlePage {

        @Test
        public void travel(){
            //封装click方法
            MobileElement el4 = (MobileElement) driver.findElementById("com.crgt.ilife:id/edt_train_number");
            el4.sendKeys("G20");
            MobileElement el5 = (MobileElement) driver.findElementById("com.crgt.ilife:id/rl_date_click");
            el5.click();
            MobileElement el6 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.View[2]");
            el6.click();
            MobileElement el7 = (MobileElement) driver.findElementById("com.crgt.ilife:id/text_query");
            el7.click();
            MobileElement el8 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[2]");
            el8.click();
            MobileElement el9 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[5]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[2]");
            el9.click();
            MobileElement el10 = (MobileElement) driver.findElementById("com.crgt.ilife:id/btn_add");
            el10.click();
            MobileElement el11 = (MobileElement) driver.findElementById("com.crgt.ilife:id/left_top_return");
            el11.click();
            MobileElement el12 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.TextView[4]");
            el12.click();
            MobileElement el13 = (MobileElement) driver.findElementById("com.crgt.ilife:id/tv_add_trip_by_hand");
            el13.click();
            MobileElement el14 = (MobileElement) driver.findElementById("com.crgt.ilife:id/edt_train_number");
            el14.sendKeys("G320");
            MobileElement el15 = (MobileElement) driver.findElementById("com.crgt.ilife:id/rl_date_click");
            el15.click();
            MobileElement el16 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.View[2]");
            el16.click();
            MobileElement el17 = (MobileElement) driver.findElementById("com.crgt.ilife:id/text_query");
            el17.click();
            MobileElement el18 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[2]");
            el18.click();
            MobileElement el19 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[8]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[2]");
            el19.click();
            MobileElement el20 = (MobileElement) driver.findElementById("com.crgt.ilife:id/btn_add");
            el20.click();
            MobileElement el21 = (MobileElement) driver.findElementById("com.crgt.ilife:id/left_top_return");
            el21.click();
        }

        @After
        public void tearDown() {
            driver.quit();
        }


}
