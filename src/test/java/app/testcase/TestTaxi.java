package app.testcase;

import app.page.App;
import app.page.TaxiPage;
import io.appium.java_client.MobileElement;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.Array;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

import static app.page.App.driver;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(Parameterized.class)
public class TestTaxi {
    public static TaxiPage taxiPage;
    @BeforeClass
    public static void beforeAll() throws MalformedURLException {
        App.start();
        taxiPage = App.toTaxi();
    }

    //参数化
    @Parameterized.Parameters
    public static List<String> data(){
        List<String> travel = new ArrayList<>();
        travel.add("");
        travel.add("");
        travel.add("");
        return travel;
    }

    @Parameterized.Parameter
    public String travel;



    @Test
    public void taxi(){
        assertThat(taxiPage.taxi("星民大厦").getTaxiPrice(), equalTo(14));

    }

//    @After
//    public void tearDown() {
//        driver.quit();
//    }
}
