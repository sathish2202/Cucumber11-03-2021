package org.utilities;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static void loadChrome() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void loadUrl(String url) {
		driver.get(url);
	}

	public static void winMax() {
		driver.manage().window().maximize();

	}
	public static void closeBrowser() {
		driver.close();

	}
	public static void nap() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}


	public static void fill(WebElement ele,String value) {
		ele.sendKeys(value);
	}
	public static void btnClick(WebElement ele) {
		ele.click();
	}
	public static void currentTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	public static void screenshot(String name) throws IOException {
		TakesScreenshot tk=(TakesScreenshot) driver;

		File src = tk.getScreenshotAs(OutputType.FILE);

		File des=new File("C:\\Users\\ELCOT\\eclipse-workspace\\MavenFrameWork\\ScreenShots\\"+name+".jpg");

		FileUtils.copyFile(src, des);

	}


}
