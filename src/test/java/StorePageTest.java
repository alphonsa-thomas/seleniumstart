import Emirates.PageFactory.StorePage;
import Utilities.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import Utilities.DriverFactory.browserType;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Select;
import static org.junit.Assert.assertTrue;

public class StorePageTest {

    WebDriver driver;
    DriverFactory.browserType type = browserType.CHROME;
    StorePage storePageObj;

    @Before
    public void setup(){

        driver = DriverFactory.getDriver(type);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        storePageObj = new StorePage(driver);

    }

    @After
    public void teardown(){
        driver.quit();
    }


    @Test
    public void createAccount_Results(){

        driver.get(storePageObj.PAGE_URL);
        storePageObj.ClickSign();
        storePageObj.CreateAcc("alphonsa.thomas.v@gmail.com");
        storePageObj.ClickCreateButn();
        storePageObj.ClickMrsCheckbox();
        storePageObj.CreateFirst( "Alphonsa");
        storePageObj.CreateLast("Thomas");
        storePageObj.createPassword("test1234");
        storePageObj.SetDateOfBirth("9", "6", "1987");
        storePageObj.SetCheckBox1();
        storePageObj.SetCheckBox2();





        System.out.println(">>>> Successfully Displayed the Now Trip Results ");



        driver.close();
    }

}
