package app.page;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import java.util.List;
import static app.page.App.driver;

public class TaxiPage{
    //private By inputBox = By.id("com.crgt.ilife:id/bottom_edit_text");
    private By inputBox = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.EditText");


    public TaxiPage taxi(String keyword){

        MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView");
        el3.click();//点击去哪儿
        driver.findElement(inputBox).sendKeys(keyword);
//        MobileElement el5 = (MobileElement) driver.findElementById("com.crgt.ilife:id/bottom_edit_text");
//        el5.sendKeys("星民大厦"); //输入终点


        MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout");
        el2.click(); //选取第一个地点

/*        List<MobileElement> addrs = driver.findElementsById("com.crgt.ilife:id/ll_item_sub_addr");
        if(!addrs.isEmpty()){
            MobileElement element = addrs.get(0);
            element.click();
        }*/
        //选取第一个地点
        return this;
    }

    public Integer getTaxiPrice() {
        MobileElement el0 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.LinearLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.CheckBox");
        el0.click();
        //选择第一个获得价格
        String str = el0.getText().replace("预估￥", "");
        return Integer.valueOf(str);

    }
}
