package app.testcase;

import app.page.App;
import app.page.TaxiPage;
import io.appium.java_client.MobileElement;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

import java.net.MalformedURLException;

import static app.page.App.driver;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class TestTaxi {
    public static TaxiPage taxiPage;
    @BeforeClass
    public static void beforeAll() throws MalformedURLException {
        App.start();
        taxiPage = App.toTaxi();
    }

    @Test
    public void taxi(){
        assertThat(taxiPage.taxi("星民大厦").getTaxiPrice(), equalTo(14));

    }

//    @After
//    public void tearDown() {
//        driver.quit();
//    }
}
