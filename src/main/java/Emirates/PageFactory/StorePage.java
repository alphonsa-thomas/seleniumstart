package Emirates.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class StorePage {

    //final variables
    public static final String PAGE_TITLE = "My Store";
    public static final String PAGE_URL = "http://automationpractice.com/index.php";

    //local webdriver variable
    WebDriver driver;

    By Sign_in = By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a");  //*[@id="header"]/div[2]/div/div/nav/div[1]/a
    By create_accfield = By.xpath("//*[@id='email_create']");
    //By create_accbutton = By.xpath("//*[@id='SubmitCreate']/span");
    By creat_button = By.xpath("//*[@id='SubmitCreate']");
    By title_Mrs= By.xpath("//*[@id='id_gender2']");
    By first_name = By.xpath("//*[@id='customer_firstname']");
    By last_name = By.xpath("//*[@id='customer_lastname']");
    By pwd_text = By.xpath("//*[@id='passwd']");
    By dropdown_day = By.xpath("//select[@id='days']");
    By dropdown_month = By.xpath("//select[@id='months']");
    By dropdown_year = By.xpath("//select[@id='years']");
    By check_box_1= By.xpath("//*[@id='newsletter']");
    By check_box_2= By.xpath("//*[@id='optin']");
    By add_company= By.xpath("//*[@id='company']");
    By add_address1= By.xpath("//*[@id='address1']");
    By add_address2= By.xpath("//*[@id='address2']");
    By add_city= By.xpath("//*[@id='city']");
    By add_state= By.xpath("//select[@id='id_state']");
    By add_postcode= By.xpath("//*[@id='postcode']");
    By add_country= By.xpath("//select[@id='id_country']");
    By add_information= By.xpath("//*[@id='other']");
    By add_homephone= By.xpath("//*[@id='postcode']");
    By add_mobilephone= By.xpath("//*[@id='phone']");
    By add_aliasid= By.xpath("//*[@id='alias']");
    By btn_register= By.xpath("//*[@id='submitAccount']");



    //-----------------------

    //Page Class Constructor
    public StorePage(WebDriver driver) {
        this.driver = driver;
        //Create all webElement of this page
        //PageFactory.initElements(driver, this);
    }

    //Action Methods
    private void ClickSignin() {
        try {


            TimeUnit.SECONDS.sleep(2);
            driver.findElement(Sign_in).isDisplayed();
            driver.findElement(Sign_in).click();

        } catch (NoSuchElementException nse) {
            System.out.println("Not Found - " + Sign_in);
        } catch (InterruptedException ie) {
            System.out.println(ie);
        }


    }

    public void ClickSign() {


        try {

            ClickSignin();
//            WebDriverWait wait = new WebDriverWait(driver, 10);
//            wait.until(ExpectedConditions.visibilityOfElementLocated(Departure_Airport));

            TimeUnit.SECONDS.sleep(2);

            //driver.findElement(Departure_Airport).sendKeys(deptfield);
        } catch (NoSuchElementException nse) {
            System.out.println("Not Found - " + Sign_in);
        } catch (InterruptedException ie) {
            System.out.println(ie);
        }


    }


    //Action methods 2
    private void setCreateAccount(String createAccount) {
        try {
            TimeUnit.SECONDS.sleep(2);
            driver.findElement(create_accfield).isDisplayed();
            driver.findElement(create_accfield).click();
            driver.findElement(create_accfield).sendKeys(createAccount);
        } catch (
                NoSuchElementException nse) {
            System.out.println("Not Found - " + Sign_in);
        } catch (
                InterruptedException ie) {
            System.out.println(ie);
        }

    }

    public void CreateAcc(String createAccount1) {

        try {

            setCreateAccount(createAccount1);
            TimeUnit.SECONDS.sleep(2);

        } catch (NoSuchElementException nse) {
            System.out.println("Not Found - " + create_accfield);
        } catch (InterruptedException ie) {
            System.out.println(ie);
        }
    }



    //Action methods 3
    private void setclickCreateButton() {
        try {
            TimeUnit.SECONDS.sleep(2);
            driver.findElement(creat_button).isDisplayed();
            driver.findElement(creat_button).click();

        } catch (
                NoSuchElementException nse) {
            System.out.println("Not Found - " + Sign_in);
        } catch (
                InterruptedException ie) {
            System.out.println(ie);
        }

    }

    public void ClickCreateButn() {

        try {

            setclickCreateButton();
            TimeUnit.SECONDS.sleep(2);

        } catch (NoSuchElementException nse) {
            System.out.println("Not Found - " + create_accfield);
        } catch (InterruptedException ie) {
            System.out.println(ie);
        }
    }


    //Action methods 4
    private void setclickTitle() {
        try {
            TimeUnit.SECONDS.sleep(2);
            driver.findElement(title_Mrs).isDisplayed();
            driver.findElement(title_Mrs).click();

        } catch (
                NoSuchElementException nse) {
            System.out.println("Not Found - " + title_Mrs);
        } catch (
                InterruptedException ie) {
            System.out.println(ie);
        }

    }

    public void ClickMrsCheckbox() {

        try {

            setclickTitle();
            TimeUnit.SECONDS.sleep(2);

        } catch (NoSuchElementException nse) {
            System.out.println("Not Found - " + title_Mrs);
        } catch (InterruptedException ie) {
            System.out.println(ie);
        }
    }


    //Action methods 5
    private void setFirstName(String firstName) {
        try {
            TimeUnit.SECONDS.sleep(2);
            driver.findElement(first_name).isDisplayed();
            driver.findElement(first_name).click();
            driver.findElement(first_name).sendKeys(firstName);

        } catch (
                NoSuchElementException nse) {
            System.out.println("Not Found - " + first_name);
        } catch (
                InterruptedException ie) {
            System.out.println(ie);
        }



    }
    public void CreateFirst(String firstName1) {

        try {

            setFirstName(firstName1);
            TimeUnit.SECONDS.sleep(2);

        } catch (NoSuchElementException nse) {
            System.out.println("Not Found - " + first_name);
        } catch (InterruptedException ie) {
            System.out.println(ie);
        }
    }

    //Action methods 6
    private void setLastName(String lastName) {
        try {
            TimeUnit.SECONDS.sleep(2);
            driver.findElement(last_name).isDisplayed();
            driver.findElement(last_name).click();
            driver.findElement(last_name).sendKeys(lastName);

        } catch (
                NoSuchElementException nse) {
            System.out.println("Not Found - " + last_name);
        } catch (
                InterruptedException ie) {
            System.out.println(ie);
        }



    }
    public void CreateLast(String lastName1) {

        try {

            setLastName(lastName1);
            TimeUnit.SECONDS.sleep(2);

        } catch (NoSuchElementException nse) {
            System.out.println("Not Found - " + last_name);
        } catch (InterruptedException ie) {
            System.out.println(ie);
        }
    }

    //Action methods 7
    private void setPwdText(String password) {
        try {
            TimeUnit.SECONDS.sleep(2);
            driver.findElement(pwd_text).isDisplayed();
            driver.findElement(pwd_text).click();
            driver.findElement(pwd_text).sendKeys(password);

        } catch (
                NoSuchElementException nse) {
            System.out.println("Not Found - " + pwd_text);
        } catch (
                InterruptedException ie) {
            System.out.println(ie);
        }
    }
        public void createPassword(String password1) {

            try {

                setPwdText(password1);
                TimeUnit.SECONDS.sleep(2);

            } catch (NoSuchElementException nse) {
                System.out.println("Not Found - " + pwd_text);
            } catch (InterruptedException ie) {
                System.out.println(ie);
            }


    }


    //Action methods 7
    public void SetDateOfBirth(String day, String month, String year) {
        try {
            TimeUnit.SECONDS.sleep(2);


            Select dayobj = new Select(driver.findElement(dropdown_day));
            dayobj.selectByValue(day);
            Select monthobj = new Select(driver.findElement(dropdown_month));
            monthobj.selectByValue(month);
            Select yearobj = new Select(driver.findElement(dropdown_year));
            yearobj.selectByValue(year);


        } catch (
                NoSuchElementException nse) {
            System.out.println("Not Found - " + dropdown_day);
        } catch (
                InterruptedException ie) {
            System.out.println(ie);
        }



    }
    //Action methods 8

    public void SetCheckBox1() {
        try {
            TimeUnit.SECONDS.sleep(2);
            driver.findElement(check_box_1).isDisplayed();
            driver.findElement(check_box_1).click();

        } catch (
                NoSuchElementException nse) {
            System.out.println("Not Found - " + check_box_1);
        } catch (
                InterruptedException ie) {
            System.out.println(ie);
        }

    }
    //Action methods 9
    public void SetCheckBox2() {
        try {
            TimeUnit.SECONDS.sleep(2);
            driver.findElement(check_box_2).isDisplayed();
            driver.findElement(check_box_2).click();

        } catch (
                NoSuchElementException nse) {
            System.out.println("Not Found - " + check_box_2);
        } catch (
                InterruptedException ie) {
            System.out.println(ie);
        }

    }
    //Action methods 10
    public void Addresscompany(String AddCompanyName)
    {
        try {
            TimeUnit.SECONDS.sleep(2);
            driver.findElement(add_company).isDisplayed();
            driver.findElement(add_company).click();
            driver.findElement(add_company).sendKeys(AddCompanyName);

        }
        catch (NoSuchElementException nse)
        {
            System.out.println("Not Found - " + add_company);
        }
        catch (InterruptedException ie)
        {
            System.out.println(ie);
        }
    }

//Action methods 11
    public void AddressLine(String AddressLine1)
    {
        try {
            TimeUnit.SECONDS.sleep(2);
            driver.findElement(add_address1).isDisplayed();
            driver.findElement(add_address1).click();
            driver.findElement(add_address1).sendKeys(AddressLine1);
        }
        catch
                (NoSuchElementException nse)
                {
                    System.out.println("Not Found -" + add_address1);
                }
                catch (InterruptedException ie)
                {
                    System.out.println("Not Found -" + add_address1 );
                }

                }


            }










