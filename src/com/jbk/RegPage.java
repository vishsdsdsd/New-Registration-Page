package com.jbk;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegPage {

	WebDriver driver = null;

	@BeforeClass
	public void openBrowser() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///G:/Workspace/Offline%20website/index.html");
	}

	@AfterClass
	public void CloseBrowser() {
		driver.close();
	}

	@Test(priority = 1)
	public void Intiallizaion() {

		WebElement NewReg = driver.findElement(By.xpath("//a[contains(text(),'Register a new membership')]"));
		String Linktxt = NewReg.getText();
		System.out.println(Linktxt);
		Assert.assertEquals("Register a new membership", Linktxt);
	}

	@Test(priority = 2)
	public void regnewdurl() throws Exception {
		// URL check
		driver.findElement(By.xpath("/html/body/div/div[2]/a")).click();

		System.out.println(driver.getCurrentUrl());
		Assert.assertEquals(driver.getCurrentUrl(),
				"file:///G:/Workspace/Offline%20website/pages/examples/register.html");
	}

	@Test(priority = 3)
	public void Regnewdata() throws Exception {
		// without name

		WebElement nam = driver.findElement(By.xpath("//*[@id='name']"));
		WebDriverWait name = new WebDriverWait(driver, 10);
		name.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='name']")));
		nam.sendKeys("");

		WebElement mn = driver.findElement(By.xpath("//input[@name='mobile']"));
		WebDriverWait mob = new WebDriverWait(driver, 10);
		mob.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='mobile']")));
		mn.sendKeys("226655");

		WebElement em = driver.findElement(By.xpath("//input[@name='email']"));
		WebDriverWait email = new WebDriverWait(driver, 10);
		email.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='email']")));
		em.sendKeys("Vishal@vs.com");

		WebElement pas = driver.findElement(By.xpath("//input[@name='password']"));
		WebDriverWait pass = new WebDriverWait(driver, 10);
		pass.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='password']")));
		pas.sendKeys("vishal2266");

		WebElement sub = driver.findElement(By.xpath("//button[@type='submit']"));
		sub.click();

		WebElement error = driver.findElement(By.xpath("//div[@id='name_error']"));
		String err = error.getText();

		Assert.assertEquals("Please enter Name.", err);
		nam.clear();
		em.clear();
		mn.clear();
		pas.clear();
	}

	@Test(priority = 4)
	public void Regnewdatamobile() throws Exception {
		// without Mobile

		WebElement nam = driver.findElement(By.xpath("//*[@id='name']"));
		WebDriverWait name = new WebDriverWait(driver, 10);
		name.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='name']")));
		nam.sendKeys("Vishal Shivhare");

		WebElement mn = driver.findElement(By.xpath("//input[@name='mobile']"));
		WebDriverWait mob = new WebDriverWait(driver, 10);
		mob.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='mobile']")));
		mn.sendKeys("");

		WebElement em = driver.findElement(By.xpath("//input[@name='email']"));
		WebDriverWait email = new WebDriverWait(driver, 10);
		email.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='email']")));
		em.sendKeys("Vishal@vs.com");

		WebElement pas = driver.findElement(By.xpath("//input[@name='password']"));
		WebDriverWait pass = new WebDriverWait(driver, 10);
		pass.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='password']")));
		pas.sendKeys("vishal2266");

		WebElement sub = driver.findElement(By.xpath("//button[@type='submit']"));
		sub.click();

		WebElement error = driver.findElement(By.xpath("//div[@id='mobile_error']"));
		String err = error.getText();

		Assert.assertEquals("Please enter Mobile.", err);
		nam.clear();
		em.clear();
		mn.clear();
		pas.clear();

	}

	@Test(priority = 5)
	public void Regnewemail() throws Exception {
		// without Email

		WebElement nm = driver.findElement(By.xpath("//*[@id='name']"));
		WebDriverWait name = new WebDriverWait(driver, 10);
		name.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='name']")));
		nm.sendKeys("Vishal Shivhare");

		WebElement mn = driver.findElement(By.xpath("//input[@name='mobile']"));
		WebDriverWait mob = new WebDriverWait(driver, 10);
		mob.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='mobile']")));
		mn.sendKeys("22446655");

		WebElement em = driver.findElement(By.xpath("//input[@name='email']"));
		WebDriverWait email = new WebDriverWait(driver, 10);
		email.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='email']")));
		em.sendKeys("");

		WebElement pas = driver.findElement(By.xpath("//input[@name='password']"));
		WebDriverWait pass = new WebDriverWait(driver, 10);
		pass.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='password']")));
		pas.sendKeys("vishal2266");

		WebElement sub = driver.findElement(By.xpath("//button[@type='submit']"));
		sub.click();

		WebElement error = driver.findElement(By.xpath("//div[@id='email_error']"));
		String err = error.getText();

		Assert.assertEquals("Please enter Email.", err);
		nm.clear();
		em.clear();
		mn.clear();
		pas.clear();

	}

	@Test(priority = 6)
	public void RegnewPass() throws Exception {
		// without Password

		WebElement nm = driver.findElement(By.xpath("//*[@id='name']"));
		WebDriverWait name = new WebDriverWait(driver, 10);
		name.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='name']")));
		nm.sendKeys("Vishal Shivhare");

		WebElement mn = driver.findElement(By.xpath("//input[@name='mobile']"));
		WebDriverWait mob = new WebDriverWait(driver, 10);
		mob.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='mobile']")));
		mn.sendKeys("22446655");

		WebElement em = driver.findElement(By.xpath("//input[@name='email']"));
		WebDriverWait email = new WebDriverWait(driver, 10);
		email.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='email']")));
		em.sendKeys("vs@vs.com");

		WebElement pas = driver.findElement(By.xpath("//input[@name='password']"));
		WebDriverWait pass = new WebDriverWait(driver, 10);
		pass.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='password']")));
		pas.sendKeys("");

		WebElement sub = driver.findElement(By.xpath("//button[@type='submit']"));
		sub.click();

		WebElement error = driver.findElement(By.xpath("//div[@id='password_error']"));
		String err = error.getText();

		Assert.assertEquals("Please enter Password.", err);
		driver.findElement(By.xpath("/html/body/div/div[2]/a")).click();

	}

	@Test(priority = 7)
	public void alldata() throws Exception {
		// with all data

		driver.findElement(By.xpath("/html/body/div/div[2]/a")).click();

		WebElement nam = driver.findElement(By.xpath("//*[@id='name']"));
		WebDriverWait name = new WebDriverWait(driver, 10);
		name.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='name']")));
		nam.sendKeys("vishal");

		WebElement mn = driver.findElement(By.xpath("//input[@name='mobile']"));
		WebDriverWait mob = new WebDriverWait(driver, 10);
		mob.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='mobile']")));
		mn.sendKeys("226655");

		WebElement em = driver.findElement(By.xpath("//input[@name='email']"));
		WebDriverWait email = new WebDriverWait(driver, 10);
		email.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='email']")));
		em.sendKeys("Vishal@vs.com");

		WebElement pas = driver.findElement(By.xpath("//input[@name='password']"));
		WebDriverWait pass = new WebDriverWait(driver, 10);
		pass.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='password']")));
		pas.sendKeys("vishal2266");

		WebElement sub = driver.findElement(By.xpath("//button[@type='submit']"));
		sub.click();
		Alert al = driver.switchTo().alert();
		al.accept();

	}

	@Test(priority = 8)
	public void buttonTxt() {
		WebElement Txt = driver.findElement(By.xpath("//button[contains(text(),'Sign In')]"));
		String acttxt = Txt.getText();
		System.out.println(acttxt);

		Assert.assertEquals("Sign In", acttxt);
	}

	@Test(priority = 9)
	public void Txtcheck1() {
		WebElement Txt = driver.findElement(By.xpath("/html/body/div/div[1]/a/b"));
		String acttxt = Txt.getText();
		System.out.println(acttxt);

		Assert.assertEquals("Java By Kiran", acttxt);
	}

	@Test(priority = 10)
	public void Txtcheck2() {
		WebElement Txt = driver.findElement(By.xpath("/html/body/div/div[2]/p"));
		String acttxt = Txt.getText();
		System.out.println(acttxt);

		Assert.assertEquals("Register a new membership", acttxt);
	}

	@Test(priority = 11)
	public void Txtcheck3() {
		WebElement Txt = driver.findElement(By.xpath("/html/body/div/div[2]/a"));
		String acttxt = Txt.getText();
		System.out.println(acttxt);

		Assert.assertEquals("I already have a membership", acttxt);
	}

	@Test(priority = 17)
	public void mainpgeurl() {

		WebElement mem = driver.findElement(By.xpath("/html/body/div/div[2]/a"));
		mem.click();
		System.out.println(driver.getCurrentUrl());
		Assert.assertEquals(driver.getCurrentUrl(), "file:///G:/Workspace/Offline%20website/index.html");
	}

	// placeholder check
	@Test(priority = 13)
	public void verifyPlaceHoldersName() {
		WebElement unameTextBox = driver.findElement(By.xpath("//*[@id='name']"));
		String value = unameTextBox.getAttribute("placeholder");
		System.out.println(value);
		Assert.assertEquals(value, "Name");
	}

	@Test(priority = 12)
	public void verifyPlaceHoldersmob() {
		WebElement unameTextBox = driver.findElement(By.id("mobile"));
		String value = unameTextBox.getAttribute("placeholder");
		System.out.println(value);
		Assert.assertEquals(value, "Mobile");
	}

	@Test(priority = 14)
	public void verifyPlaceHoldersemail() {
		WebElement unameTextBox = driver.findElement(By.id("email"));
		String value = unameTextBox.getAttribute("placeholder");
		System.out.println(value);
		Assert.assertEquals(value, "Email");
	}

	@Test(priority = 15)
	public void verifyPlaceHolderspass() {
		WebElement unameTextBox = driver.findElement(By.id("password"));
		String value = unameTextBox.getAttribute("placeholder");
		System.out.println(value);
		Assert.assertEquals(value, "Password");
	}

	@Test(priority = 16)
	public void verifyGoLinksWithWindowsHandles() {
		driver.findElement(By.xpath("/html/body/div/div[1]/a/b")).click();
		Assert.assertEquals(driver.getCurrentUrl(), "file:///G:/Workspace/Offline%20website/index2.html");
		driver.navigate().back();

	}

}