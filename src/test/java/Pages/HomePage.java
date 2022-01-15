package Pages;

import Tests.Telefoni;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class HomePage extends BasePage {
    String homePageUrl = "https://mts.rs/";
    ChromeDriver driver;

    // @FindBy (xpath = "(//*[@class='main-nav-tab js-nav-first-level-btn'])[3])")
    //public WebElement boxMenuItem;

    // @FindBy (xpath = "(//*[@class='second-level-nav-btn js-nav-dropdown-btn'])[3]")
    //private WebElement box4;

    // @FindBy (xpath = "//*[@id=\"main-header\"]/div[1]/div[2]/button/span")
    //public WebElement mtsMeni;

    //  @FindBy (className = "main-navigation-mobile-wrapper")
    // public WebElement Proizvodi;

    public HomePage(ChromeDriver driver) {
        super(driver);
        driver.get(homePageUrl);
        this.driver = driver;

    }

    public UserIcon clickonUserIcon(){
        driver.findElementByXPath("//*[@id=\"main-header\"]/div[1]/div[2]/a[3]").click();
        return new UserIcon(driver);
    }
    public Televizori clickonTelevizoriButton(){
        driver.findElementByXPath("//*[@id=\"main-header\"]/div[2]/div/ul/li[1]/nav/ul/li[2]/div/ul/li[2]/ul/li[2]/a").click();
        return new Televizori(driver);

    }

    public void clickonPonudaUredjajaButton()
    {
        driver.findElementByXPath("//*[@id=\"main-header\"]/div[2]/div/ul/li[1]/nav/ul/li[2]/div/ul/li[2]/button").click();
    }

    public void clickonUredjajiButton() {
        try {

        Thread.sleep(2000);
        String searchIconXpath ="//*[@id=\"main-header\"]/div[2]/div/ul/li[1]/nav/ul/li[2]/button";
//        driver.findElementByXPath("(//*[@class=\"main-nav-tab js-nav-first-level-btn\"])[3]").click();
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(searchIconXpath))).click();
    }
    catch (InterruptedException e) {
        e.printStackTrace();
    }
       // driver.findElementByXPath("//*[@id=\"main-header\"]/div[2]/div/ul/li[1]/nav/ul/li[2]/button").click();
    }


    public void clickonMeniItem() {
        driver.findElementByXPath("//*[@id=\"main-header\"]/div[1]/div[2]/button").click();
    }

    public void clickonBoxMeniItem() {
        try {

            Thread.sleep(2000);
            String searchIconXpath ="//*[@id=\"main-header\"]/div[2]/div/ul/li[1]/nav/ul/li[3]/button";
//        driver.findElementByXPath("(//*[@class=\"main-nav-tab js-nav-first-level-btn\"])[3]").click();
            WebDriverWait wait = new WebDriverWait(driver, 15);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(searchIconXpath))).click();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clickonBox4MeniItem() {
        driver.findElementByXPath("(//*[@class=\"second-level-nav-btn js-nav-dropdown-btn\"])[3]").click();
    }

    public FixnaNet clickonFixnaNet() {
        driver.findElementByXPath("//*[@id=\"main-header\"]/div[2]/div/ul/li[1]/nav/ul/li[3]/div/ul/li[2]/ul/li[1]/a").click();
        return new FixnaNet(driver);

    }




         public void clickonSearchButton() {
        try {

        Thread.sleep(2000);
        String searchIconXpath = "//*[@id=\"main-header\"]/div[1]/ul/li[1]/span";
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(searchIconXpath))).click();
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
        }


public void searchByText(String searchText) {
        String inputXpath = "//*[@id=\"main-header\"]/div[1]/ul/li[1]/input";
        driver.findElementByXPath(inputXpath).sendKeys(searchText);
        driver.findElementByXPath(inputXpath).sendKeys(Keys.ENTER);

        }}