package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TimKiemCVTheoKyNangDiaDiem {
    ChromeDriver chromeDriver;

    @BeforeMethod
    public void Setup(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--remote-allow-origins=*");
        chromeDriver = new ChromeDriver(options);
        System.out.println("Setup");
    }

    @Test
    public void TC01()
    {
        chromeDriver.get("http://localhost:3000/");
        sleep(5000);
        WebElement inSearch = chromeDriver.findElement(By.className("ant-form-item-control-input"));
        //WebElement inAddr = chromeDriver.findElement(By.className("ant-form-item-control-input"));
        WebElement btnSearch = chromeDriver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/form/div/div[4]/button/span"));
       // WebElement btnSearch = chromeDriver.findElement(By.name("Search"));
        Actions action = new Actions(chromeDriver);
        action.sendKeys(inSearch, "ReactJS").build().perform();
       // action.sendKeys(inAddr, "123456").build().perform();
        sleep(5000);
        btnSearch.click();
        sleep(5000);

        // Đợi trang kết quả tải
        chromeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Kiểm tra có kết quả trả về
        List<WebElement> results = chromeDriver.findElements(By.cssSelector("div.result"));
        Assert.assertTrue(results.size() > 0, "No results found.");
    }

    @Test
    public void TC02()
    {
        chromeDriver.get("http://localhost:3000/");
        sleep(5000);
        WebElement inSearch = chromeDriver.findElement(By.className("ant-form-item-control-input"));
        //WebElement inAddr = chromeDriver.findElement(By.className("ant-form-item-control-input"));
        WebElement btnSearch = chromeDriver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/form/div/div[4]/button/span"));
        // WebElement btnSearch = chromeDriver.findElement(By.name("Search"));
        Actions action = new Actions(chromeDriver);
        action.sendKeys(inSearch, "React").build().perform();
        sleep(5000);
        // action.sendKeys(inAddr, "123456").build().perform();
        btnSearch.click();
        sleep(5000);

        // Đợi trang kết quả tải
        chromeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Kiểm tra có kết quả trả về
        List<WebElement> results = chromeDriver.findElements(By.cssSelector("div.result"));
        Assert.assertTrue(results.size() > 0, "No results found.");
    }

    @Test
    public void TC03()
    {
        chromeDriver.get("http://localhost:3000/");
        sleep(5000);
        WebElement inSearch = chromeDriver.findElement(By.className("ant-form-item-control-input"));
       // WebElement inAddr = chromeDriver.findElement(By.className("ant-form-item-control-input"));
        WebElement btnSearch = chromeDriver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/form/div/div[4]/button/span"));
        // WebElement btnSearch = chromeDriver.findElement(By.name("Search"));
        Actions action = new Actions(chromeDriver);
        action.sendKeys(inSearch, "Auto testing").build().perform();
        sleep(5000);
        // action.sendKeys(inAddr, "123456").build().perform();
        btnSearch.click();
        sleep(5000);

        // Đợi trang kết quả tải
        chromeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Kiểm tra có kết quả trả về
        List<WebElement> results = chromeDriver.findElements(By.cssSelector("div.result"));
        Assert.assertTrue(results.size() > 0, "No results found.");
    }

    @Test
    public void TC04()
    {
        chromeDriver.get("http://localhost:3000/");
        sleep(5000);
       // WebElement inSearch = chromeDriver.findElement(By.className("ant-form-item-control-input"));
        WebElement inAddr = chromeDriver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/form/div/div[3]/div/div"));
        WebElement btnSearch = chromeDriver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/form/div/div[4]/button/span"));
        // WebElement btnSearch = chromeDriver.findElement(By.name("Search"));
        Actions action = new Actions(chromeDriver);
        action.sendKeys(inAddr, "Ha Noi").build().perform();
        sleep(5000);
        // action.sendKeys(inAddr, "123456").build().perform();
        btnSearch.click();
        sleep(5000);

        // Đợi trang kết quả tải
        chromeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Kiểm tra có kết quả trả về
        List<WebElement> results = chromeDriver.findElements(By.cssSelector("div.result"));
        Assert.assertTrue(results.size() > 0, "No results found.");
    }

    @Test
    public void TC05()
    {
        chromeDriver.get("http://localhost:3000/");
        sleep(5000);
        // WebElement inSearch = chromeDriver.findElement(By.className("ant-form-item-control-input"));
        WebElement inAddr = chromeDriver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/form/div/div[3]/div/div"));
        WebElement btnSearch = chromeDriver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/form/div/div[4]/button/span"));
        // WebElement btnSearch = chromeDriver.findElement(By.name("Search"));
        Actions action = new Actions(chromeDriver);
        action.sendKeys(inAddr, "Ha").build().perform();
        sleep(5000);
        // action.sendKeys(inAddr, "123456").build().perform();
        btnSearch.click();
        sleep(5000);

        // Đợi trang kết quả tải
        chromeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Kiểm tra có kết quả trả về
        List<WebElement> results = chromeDriver.findElements(By.cssSelector("div.result"));
        Assert.assertTrue(results.size() > 0, "No results found.");
    }

    @Test
    public void TC06()
    {
        chromeDriver.get("http://localhost:3000/");
        sleep(5000);
        // WebElement inSearch = chromeDriver.findElement(By.className("ant-form-item-control-input"));
        WebElement inAddr = chromeDriver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/form/div/div[3]/div/div"));
        WebElement btnSearch = chromeDriver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/form/div/div[4]/button/span"));
        // WebElement btnSearch = chromeDriver.findElement(By.name("Search"));
        Actions action = new Actions(chromeDriver);
        action.sendKeys(inAddr, "Han Quoc").build().perform();
        sleep(5000);
        // action.sendKeys(inAddr, "123456").build().perform();
        btnSearch.click();
        sleep(5000);

        // Đợi trang kết quả tải
        chromeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Kiểm tra có kết quả trả về
        List<WebElement> results = chromeDriver.findElements(By.cssSelector("div.result"));
        Assert.assertTrue(results.size() > 0, "No results found.");
    }

    @AfterMethod
    public void Cleanup(){
        //WebElement button = chromeDriver.findElement(By.xpath("/html/body/div[2]/div/ul/li[3]/span[2]/label"));
        chromeDriver.quit();
        System.out.println("bye");
    }

    private void sleep(int time){
        try{
            Thread.sleep(time);
        }catch (Exception ex){
            System.out.print(ex.getMessage());
        }
    }
}
