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

import java.io.IOException;
import java.util.List;

public class NopCVUngTuyen {
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
    public void TC01() throws IOException {
        chromeDriver.get("http://localhost:3000/");
        sleep(2000);
        WebElement button = chromeDriver.findElement(By.className("_extra_db591_86"));
        button.click();
        WebElement txtEmail = chromeDriver.findElement(By.id("basic_username"));
        WebElement txtPass = chromeDriver.findElement(By.id("basic_password"));
        WebElement btnDN = chromeDriver.findElement(By.xpath("/html/body/div/div/main/div/section/form/div[3]/div/div/div/div/button/span"));

        Actions action = new Actions(chromeDriver);
        action.sendKeys(txtEmail, "abcd@gmail.com").build().perform();
        action.sendKeys(txtPass, "123456").build().perform();
        btnDN.click();
        sleep(2000);

        WebElement btnJobIT = chromeDriver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div[2]/ul/li[2]/span[2]/a"));
        btnJobIT.click();
        sleep(5000);
        WebElement AJobIT = chromeDriver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[3]/div/div/div/div/div[1]/div[3]/div"));
        AJobIT.click();
        sleep(5000);
        WebElement btnApply = chromeDriver.findElement(By.className("_btn-apply_db591_201"));
        btnApply.click();
        sleep(5000);

        WebElement inputCV = chromeDriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/form/div/div[3]/div/div/div[2]/div/div/span/div[1]/span/button/span[2]"));
        inputCV.click();
        sleep(5000);
        // Gọi script AutoIt để upload file
        Runtime.getRuntime().exec("D:\\1.DoAnTN\\File_AutoIT\\uploadCVdangdoc.exe");
        sleep(5000);
        WebElement btnGuiCV = chromeDriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[3]/button[2]"));
        sleep(3000);
        btnGuiCV.click();
        sleep(3000);

        WebElement mesGuiCV = chromeDriver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/span[2]"));
        String lbmesGuiCVlValue = mesGuiCV.getText();
        Assert.assertEquals(lbmesGuiCVlValue, "Gui CV thanh cong!");
    }

    @Test
    public void TC02() throws IOException {
        chromeDriver.get("http://localhost:3000/");
        sleep(2000);
        WebElement button = chromeDriver.findElement(By.className("_extra_db591_86"));
        button.click();
        WebElement txtEmail = chromeDriver.findElement(By.id("basic_username"));
        WebElement txtPass = chromeDriver.findElement(By.id("basic_password"));
        WebElement btnDN = chromeDriver.findElement(By.xpath("/html/body/div/div/main/div/section/form/div[3]/div/div/div/div/button/span"));

        Actions action = new Actions(chromeDriver);
        action.sendKeys(txtEmail, "abcd@gmail.com").build().perform();
        action.sendKeys(txtPass, "123456").build().perform();
        btnDN.click();
        sleep(2000);

        WebElement btnJobIT = chromeDriver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div[2]/ul/li[2]/span[2]/a"));
        btnJobIT.click();
        sleep(5000);
        WebElement AJobIT = chromeDriver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[3]/div/div/div/div/div[1]/div[3]/div"));
        AJobIT.click();
        sleep(5000);
        WebElement btnApply = chromeDriver.findElement(By.className("_btn-apply_db591_201"));
        btnApply.click();
        sleep(5000);

        WebElement inputCV = chromeDriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/form/div/div[3]/div/div/div[2]/div/div/span/div[1]/span/button/span[2]"));
        inputCV.click();
        sleep(5000);
        // Gọi script AutoIt để upload file
        Runtime.getRuntime().exec("D:\\1.DoAnTN\\File_AutoIT\\uploadCVdangdocx.exe");
        sleep(5000);
        WebElement btnGuiCV = chromeDriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[3]/button[2]"));
        sleep(3000);
        btnGuiCV.click();
        sleep(3000);

        WebElement mesGuiCV = chromeDriver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/span[2]"));
        String lbmesGuiCVlValue = mesGuiCV.getText();
        Assert.assertEquals(lbmesGuiCVlValue, "Gui CV thanh cong!");
    }

    @Test
    public void TC03() throws IOException
    {
        chromeDriver.get("http://localhost:3000/");
        sleep(2000);
        WebElement button = chromeDriver.findElement(By.className("_extra_db591_86"));
        button.click();
        WebElement txtEmail = chromeDriver.findElement(By.id("basic_username"));
        WebElement txtPass = chromeDriver.findElement(By.id("basic_password"));
        WebElement btnDN = chromeDriver.findElement(By.xpath("/html/body/div/div/main/div/section/form/div[3]/div/div/div/div/button/span"));

        Actions action = new Actions(chromeDriver);
        action.sendKeys(txtEmail, "abcd@gmail.com").build().perform();
        action.sendKeys(txtPass, "123456").build().perform();
        btnDN.click();
        sleep(2000);

        WebElement btnJobIT = chromeDriver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div[2]/ul/li[2]/span[2]/a"));
        btnJobIT.click();
        sleep(5000);
        WebElement AJobIT = chromeDriver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[3]/div/div/div/div/div[1]/div[3]/div"));
        AJobIT.click();
        sleep(5000);
        WebElement btnApply = chromeDriver.findElement(By.className("_btn-apply_db591_201"));
        btnApply.click();
        sleep(5000);

        WebElement inputCV = chromeDriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/form/div/div[3]/div/div/div[2]/div/div/span/div[1]/span/button/span[2]"));
        inputCV.click();
        sleep(5000);
        // Gọi script AutoIt để upload file
        Runtime.getRuntime().exec("D:\\1.DoAnTN\\File_AutoIT\\uploadCVdangpdf.exe");
        sleep(5000);
        WebElement btnGuiCV = chromeDriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[3]/button[2]"));
        sleep(3000);
        btnGuiCV.click();
        sleep(3000);

        WebElement mesGuiCV = chromeDriver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/span[2]"));
        String lbmesGuiCVlValue = mesGuiCV.getText();
        Assert.assertEquals(lbmesGuiCVlValue, "Gui CV thanh cong!");
    }

    @Test
    public void TC04() throws IOException
    {
        chromeDriver.get("http://localhost:3000/");
        sleep(2000);
        WebElement button = chromeDriver.findElement(By.className("_extra_db591_86"));
        button.click();
        WebElement txtEmail = chromeDriver.findElement(By.id("basic_username"));
        WebElement txtPass = chromeDriver.findElement(By.id("basic_password"));
        WebElement btnDN = chromeDriver.findElement(By.xpath("/html/body/div/div/main/div/section/form/div[3]/div/div/div/div/button/span"));

        Actions action = new Actions(chromeDriver);
        action.sendKeys(txtEmail, "abcd@gmail.com").build().perform();
        action.sendKeys(txtPass, "123456").build().perform();
        btnDN.click();
        sleep(2000);

        WebElement btnJobIT = chromeDriver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div[2]/ul/li[2]/span[2]/a"));
        btnJobIT.click();
        sleep(5000);
        WebElement AJobIT = chromeDriver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[3]/div/div/div/div/div[1]/div[3]/div"));
        AJobIT.click();
        sleep(5000);
        WebElement btnApply = chromeDriver.findElement(By.className("_btn-apply_db591_201"));
        btnApply.click();
        sleep(5000);

        WebElement inputCV = chromeDriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/form/div/div[3]/div/div/div[2]/div/div/span/div[1]/span/button/span[2]"));
        inputCV.click();
        sleep(5000);
        // Gọi script AutoIt để upload file
        Runtime.getRuntime().exec("D:\\1.DoAnTN\\File_AutoIT\\uploadCVdangtxt.exe");
        sleep(5000);
        WebElement btnGuiCV = chromeDriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[3]/button[2]"));
        sleep(3000);
        btnGuiCV.click();
        sleep(3000);

        WebElement mesGuiCV = chromeDriver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/span[2]"));
        String lbmesGuiCVlValue = mesGuiCV.getText();
        Assert.assertEquals(lbmesGuiCVlValue, "Invalid file type");
    }

    @Test
    public void TC05() throws IOException
    {
        chromeDriver.get("http://localhost:3000/");
        sleep(2000);
        WebElement button = chromeDriver.findElement(By.className("_extra_db591_86"));
        button.click();
        WebElement txtEmail = chromeDriver.findElement(By.id("basic_username"));
        WebElement txtPass = chromeDriver.findElement(By.id("basic_password"));
        WebElement btnDN = chromeDriver.findElement(By.xpath("/html/body/div/div/main/div/section/form/div[3]/div/div/div/div/button/span"));

        Actions action = new Actions(chromeDriver);
        action.sendKeys(txtEmail, "abcd@gmail.com").build().perform();
        action.sendKeys(txtPass, "123456").build().perform();
        btnDN.click();
        sleep(2000);

        WebElement btnJobIT = chromeDriver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div[2]/ul/li[2]/span[2]/a"));
        btnJobIT.click();
        sleep(5000);
        WebElement AJobIT = chromeDriver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[3]/div/div/div/div/div[1]/div[3]/div"));
        AJobIT.click();
        sleep(5000);
        WebElement btnApply = chromeDriver.findElement(By.className("_btn-apply_db591_201"));
        btnApply.click();
        sleep(5000);

        WebElement inputCV = chromeDriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/form/div/div[3]/div/div/div[2]/div/div/span/div[1]/span/button/span[2]"));
        inputCV.click();
        sleep(5000);
        // Gọi script AutoIt để upload file
        Runtime.getRuntime().exec("D:\\1.DoAnTN\\File_AutoIT\\uploadCVdangpptx.exe");
        sleep(5000);
        WebElement btnGuiCV = chromeDriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[3]/button[2]"));
        sleep(3000);
        btnGuiCV.click();
        sleep(3000);

        WebElement mesGuiCV = chromeDriver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/span[2]"));
        String lbmesGuiCVlValue = mesGuiCV.getText();
        Assert.assertEquals(lbmesGuiCVlValue, "Invalid file type");
    }

    @Test
    public void TC06() throws IOException {
        chromeDriver.get("http://localhost:3000/");
        sleep(2000);
        WebElement button = chromeDriver.findElement(By.className("_extra_db591_86"));
        button.click();
        WebElement txtEmail = chromeDriver.findElement(By.id("basic_username"));
        WebElement txtPass = chromeDriver.findElement(By.id("basic_password"));
        WebElement btnDN = chromeDriver.findElement(By.xpath("/html/body/div/div/main/div/section/form/div[3]/div/div/div/div/button/span"));

        Actions action = new Actions(chromeDriver);
        action.sendKeys(txtEmail, "abcd@gmail.com").build().perform();
        action.sendKeys(txtPass, "123456").build().perform();
        btnDN.click();
        sleep(2000);

        WebElement btnJobIT = chromeDriver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div[2]/ul/li[2]/span[2]/a"));
        btnJobIT.click();
        sleep(5000);
        WebElement AJobIT = chromeDriver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[3]/div/div/div/div/div[1]/div[3]/div"));
        AJobIT.click();
        sleep(5000);
        WebElement btnApply = chromeDriver.findElement(By.className("_btn-apply_db591_201"));
        btnApply.click();
        sleep(5000);

        WebElement inputCV = chromeDriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/form/div/div[3]/div/div/div[2]/div/div/span/div[1]/span/button/span[2]"));
        inputCV.click();
        sleep(5000);
        // Gọi script AutoIt để upload file
        Runtime.getRuntime().exec("D:\\1.DoAnTN\\File_AutoIT\\uploadCVdangexcel.exe");
        sleep(5000);
        WebElement btnGuiCV = chromeDriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[3]/button[2]"));
        sleep(3000);
        btnGuiCV.click();
        sleep(3000);

        WebElement mesGuiCV = chromeDriver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/span[2]"));
        String lbmesGuiCVlValue = mesGuiCV.getText();
        Assert.assertEquals(lbmesGuiCVlValue, "Invalid file type");
    }

    @Test
    public void TC07() throws IOException
    {
        chromeDriver.get("http://localhost:3000/");
        sleep(2000);
        WebElement button = chromeDriver.findElement(By.className("_extra_db591_86"));
        button.click();
        WebElement txtEmail = chromeDriver.findElement(By.id("basic_username"));
        WebElement txtPass = chromeDriver.findElement(By.id("basic_password"));
        WebElement btnDN = chromeDriver.findElement(By.xpath("/html/body/div/div/main/div/section/form/div[3]/div/div/div/div/button/span"));

        Actions action = new Actions(chromeDriver);
        action.sendKeys(txtEmail, "abcd@gmail.com").build().perform();
        action.sendKeys(txtPass, "123456").build().perform();
        btnDN.click();
        sleep(2000);

        WebElement btnJobIT = chromeDriver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div[2]/ul/li[2]/span[2]/a"));
        btnJobIT.click();
        sleep(5000);
        WebElement AJobIT = chromeDriver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[3]/div/div/div/div/div[1]/div[3]/div"));
        AJobIT.click();
        sleep(5000);
        WebElement btnApply = chromeDriver.findElement(By.className("_btn-apply_db591_201"));
        btnApply.click();
        sleep(5000);

        WebElement inputCV = chromeDriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/form/div/div[3]/div/div/div[2]/div/div/span/div[1]/span/button/span[2]"));
        inputCV.click();
        sleep(5000);
        // Gọi script AutoIt để upload file
        Runtime.getRuntime().exec("D:\\1.DoAnTN\\File_AutoIT\\uploadCVnhohon5mb.exe");
        sleep(5000);
        WebElement btnGuiCV = chromeDriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[3]/button[2]"));
        sleep(3000);
        btnGuiCV.click();
        sleep(3000);

        WebElement mesGuiCV = chromeDriver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/span[2]"));
        String lbmesGuiCVlValue = mesGuiCV.getText();
        Assert.assertEquals(lbmesGuiCVlValue, "Gui CV thanh cong!");
    }

    @Test
    public void TC08() throws IOException
    {
        chromeDriver.get("http://localhost:3000/");
        sleep(2000);
        WebElement button = chromeDriver.findElement(By.className("_extra_db591_86"));
        button.click();
        WebElement txtEmail = chromeDriver.findElement(By.id("basic_username"));
        WebElement txtPass = chromeDriver.findElement(By.id("basic_password"));
        WebElement btnDN = chromeDriver.findElement(By.xpath("/html/body/div/div/main/div/section/form/div[3]/div/div/div/div/button/span"));

        Actions action = new Actions(chromeDriver);
        action.sendKeys(txtEmail, "abcd@gmail.com").build().perform();
        action.sendKeys(txtPass, "123456").build().perform();
        btnDN.click();
        sleep(2000);

        WebElement btnJobIT = chromeDriver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div[2]/ul/li[2]/span[2]/a"));
        btnJobIT.click();
        sleep(5000);
        WebElement AJobIT = chromeDriver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[3]/div/div/div/div/div[1]/div[3]/div"));
        AJobIT.click();
        sleep(5000);
        WebElement btnApply = chromeDriver.findElement(By.className("_btn-apply_db591_201"));
        btnApply.click();
        sleep(5000);

        WebElement inputCV = chromeDriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/form/div/div[3]/div/div/div[2]/div/div/span/div[1]/span/button/span[2]"));
        inputCV.click();
        sleep(5000);
        // Gọi script AutoIt để upload file
        Runtime.getRuntime().exec("D:\\1.DoAnTN\\File_AutoIT\\uploadCVbang5mb.exe");
        sleep(5000);
        //WebElement btnGuiCV = chromeDriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[3]/button[2]"));
        //sleep(3000);
        //btnGuiCV.click();
        //sleep(3000);

        WebElement mesGuiCV = chromeDriver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/span[2]"));
        String lbmesGuiCVlValue = mesGuiCV.getText();
        Assert.assertEquals(lbmesGuiCVlValue, "File too large");
    }

    @Test
    public void TC09() throws IOException
    {
        chromeDriver.get("http://localhost:3000/");
        sleep(2000);
        WebElement button = chromeDriver.findElement(By.className("_extra_db591_86"));
        button.click();
        WebElement txtEmail = chromeDriver.findElement(By.id("basic_username"));
        WebElement txtPass = chromeDriver.findElement(By.id("basic_password"));
        WebElement btnDN = chromeDriver.findElement(By.xpath("/html/body/div/div/main/div/section/form/div[3]/div/div/div/div/button/span"));

        Actions action = new Actions(chromeDriver);
        action.sendKeys(txtEmail, "abcd@gmail.com").build().perform();
        action.sendKeys(txtPass, "123456").build().perform();
        btnDN.click();
        sleep(2000);

        WebElement btnJobIT = chromeDriver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div[2]/ul/li[2]/span[2]/a"));
        btnJobIT.click();
        sleep(5000);
        WebElement AJobIT = chromeDriver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[3]/div/div/div/div/div[1]/div[3]/div"));
        AJobIT.click();
        sleep(5000);
        WebElement btnApply = chromeDriver.findElement(By.className("_btn-apply_db591_201"));
        btnApply.click();
        sleep(5000);

        WebElement inputCV = chromeDriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/form/div/div[3]/div/div/div[2]/div/div/span/div[1]/span/button/span[2]"));
        inputCV.click();
        sleep(5000);
        // Gọi script AutoIt để upload file
        Runtime.getRuntime().exec("D:\\1.DoAnTN\\File_AutoIT\\uploadCVhon5mb.exe");
        sleep(5000);
        //WebElement btnGuiCV = chromeDriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[3]/button[2]"));
        //sleep(3000);
        //btnGuiCV.click();
        //sleep(3000);

        WebElement mesGuiCV = chromeDriver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/span[2]"));
        String lbmesGuiCVlValue = mesGuiCV.getText();
        Assert.assertEquals(lbmesGuiCVlValue, "File too large");
    }

    @Test
    public void TC10() throws IOException
    {
        chromeDriver.get("http://localhost:3000/");
        sleep(2000);
        WebElement button = chromeDriver.findElement(By.className("_extra_db591_86"));
        button.click();
        WebElement txtEmail = chromeDriver.findElement(By.id("basic_username"));
        WebElement txtPass = chromeDriver.findElement(By.id("basic_password"));
        WebElement btnDN = chromeDriver.findElement(By.xpath("/html/body/div/div/main/div/section/form/div[3]/div/div/div/div/button/span"));

        Actions action = new Actions(chromeDriver);
        action.sendKeys(txtEmail, "abcd@gmail.com").build().perform();
        action.sendKeys(txtPass, "123456").build().perform();
        btnDN.click();
        sleep(2000);

        WebElement btnJobIT = chromeDriver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div[2]/ul/li[2]/span[2]/a"));
        btnJobIT.click();
        sleep(5000);
        WebElement AJobIT = chromeDriver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[3]/div/div/div/div/div[1]/div[3]/div"));
        AJobIT.click();
        sleep(5000);
        WebElement btnApply = chromeDriver.findElement(By.className("_btn-apply_db591_201"));
        btnApply.click();
        sleep(5000);

        //WebElement inputCV = chromeDriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/form/div/div[3]/div/div/div[2]/div/div/span/div[1]/span/button/span[2]"));
        //inputCV.click();
        //sleep(5000);
        // Gọi script AutoIt để upload file
        //Runtime.getRuntime().exec("D:\\1.DoAnTN\\File_AutoIT\\uploadCVdangdoc.exe");
        //sleep(5000);
        WebElement btnGuiCV = chromeDriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[3]/button[2]"));
        sleep(3000);
        btnGuiCV.click();
        sleep(3000);

        WebElement mesGuiCV = chromeDriver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/span[2]"));
        String lbmesGuiCVlValue = mesGuiCV.getText();
        Assert.assertEquals(lbmesGuiCVlValue, "Vui long upload CV!");
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
