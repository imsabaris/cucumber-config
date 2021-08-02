package com.utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public static void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		driver = new ChromeDriver();
	}
	
	public static void browserLaunchFirefox() {
		WebDriverManager.firefoxdriver().setup();
		//System.setProperty(GeckoDriverService.GECKO_DRIVER_EXE_PROPERTY, "true");
		driver = new FirefoxDriver();
	}

	public static void browserLaunchExplorer() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}
	
	public static void loadUrl(String url) {
		screenMaximize();
		driver.get(url);
		implicitWait();
	}

	public static void screenMaximize() {
		driver.manage().window().maximize();
	}

	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public static void urlTitle() {
		String title = driver.getTitle();
		System.out.println("Title : " + title);
	}

	public static void currentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current Url : " + currentUrl);
	}

	public static void pageClose() {
		driver.close();
	}

	public static void pageQuit() {
		driver.quit();
	}

	public static void typeInput(WebElement element, String data) {
		element.sendKeys(data);
	}

	public static void btnClick(WebElement element) {
		element.click();
	}

	public static void getsText(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}

	public static String getsValue(WebElement element) {
		String input = element.getAttribute("value");
		return input;
	}

	public static void selectByText(WebElement element, String data) {
		Select s = new Select(element);
		s.selectByVisibleText(data);
	}

	public static void selectsByvalue(WebElement element, String data) {
		Select s = new Select(element);
		s.selectByValue(data);
	}

	public static void selectsById(WebElement element, int data) {
		Select s = new Select(element);
		s.selectByIndex(data);
	}

	public static void inputTypeJs(WebElement element, String data) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','" + data + "')", element);
	}

	public static void clickJs(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}

	public static void pageDownSCrollJs(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}

	public static void pageUpScrollJs(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", element);
	}

	public static void getTextJs(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("return arguments[0].getAttribute('value')", element);
	}

	public static void alertAccept() {
		Alert a = driver.switchTo().alert();
		a.accept();
	}

	public static void alertDIsmiss() {
		Alert a = driver.switchTo().alert();
		a.dismiss();
	}

	public static void alertPrompt(String data) {
		Alert a = driver.switchTo().alert();
		a.sendKeys(data);
	}

	public static void alertText() {
		Alert a = driver.switchTo().alert();
		String text = a.getText();
		System.out.println("Alert text : " + text);
	}

	public static void mouseHover(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
	}

	public static void dragDrop(WebElement src, WebElement dest) {
		Actions a = new Actions(driver);
		a.dragAndDrop(src, dest);
	}

	public static void doubleClick(WebElement element) {
		Actions a = new Actions(driver);
		a.doubleClick(element).perform();
	}

	public static void rightClick(WebElement element) {
		Actions a = new Actions(driver);
		a.contextClick(element).perform();
	}

	public static void actionClick(WebElement element) {
		Actions a = new Actions(driver);
		a.click(element).perform();
	}

	public static void actionInput(WebElement element, String data) {
		Actions a = new Actions(driver);
		a.sendKeys(element, data).perform();
	}

	public static void actionUpperCase(WebElement element, String data) {
		Actions a = new Actions(driver);
		a.keyDown(element, Keys.SHIFT).perform();
		actionInput(element, data);
		a.keyUp(element, Keys.SHIFT).perform();
	}

	public static void keyBoardCopy() throws AWTException {
		Robot r = new Robot();
		for (int i = 0; i < 3; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_UP);
		}
	}

	public static void keyBoardEnter() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void snapShot(String data) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(data);
		FileUtils.copyFile(src, dest);
	}

	public static void waitElementToLoacte(String data) {
		WebDriverWait w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(data)));
	}

	public static void fluentWaitVisibleToLocate(String data) {
		FluentWait<WebDriver> w = new FluentWait<WebDriver>(driver).withTimeout(10, TimeUnit.SECONDS)
				.pollingEvery(1, TimeUnit.SECONDS).ignoring(Exception.class);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(data)));
	}

	public static void parentWindow() {
		String parentWindowId = driver.getWindowHandle();
	}

	public static void allWindow() {
		Set<String> allWindows = driver.getWindowHandles();
	}

	public static void windowSwitch() {
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindow = driver.getWindowHandles();
		for (String eachWindow : allWindow) {
			if (!parentWindow.equals(allWindow)) {
				driver.switchTo().window(eachWindow);
			}
		}
	}

	public static void selectAllOption(WebElement element) {
		Select s = new Select(element);
		List<WebElement> allOptions = s.getOptions();
		for (WebElement eachOption : allOptions) {
			System.out.println(eachOption.getText());
		}
	}

	public static void selectAllSelectedOption(WebElement element) {
		Select s = new Select(element);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement eachSelectedOption : allSelectedOptions) {
			System.out.println(eachSelectedOption.getText());
		}
	}

	public static void nonSelectedOption(WebElement element) {
		Select s = new Select(element);
		List<WebElement> allOptions = s.getOptions();
		for (WebElement eachOption : allOptions) {
			System.out.println(eachOption.getText());
		}
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement eachSelectedOption : allSelectedOptions) {
			System.out.println(eachSelectedOption.getText());
		}
		allOptions.removeAll(allSelectedOptions);
		for (WebElement eachNonSelectedOption : allOptions) {
			System.out.println(eachNonSelectedOption.getText());
		}
	}

	public static void deselectByValue(WebElement element, String data) {
		Select s = new Select(element);
		s.deselectByValue(data);
	}

	public static void deselectByIndex(WebElement element, int index) {
		Select s = new Select(element);
		s.deselectByIndex(index);
	}

	public static void deselectByText(WebElement element, String value) {
		Select s = new Select(element);
		s.deselectByVisibleText(value);
	}

	public static void deselectAll(WebElement element) {
		Select s = new Select(element);
		s.deselectAll();
	}

	public static void tableDataSelect(String input) {
		List<WebElement> allTable = driver.findElements(By.tagName("table"));
		for (WebElement table : allTable) {
			List<WebElement> allRow = table.findElements(By.tagName("tr"));
			for (WebElement row : allRow) {
				List<WebElement> allData = row.findElements(By.tagName("td"));
				for (WebElement data : allData) {
					// System.out.println(data.getText());
					if (data.getText().equals(input)) {
						data.click();
					}
				}
			}

		}

	}
	
	public static void switchFrame(WebElement element) {
		driver.switchTo().frame(element);
	}
	
	public static void switchDefaultFrame() {
		driver.switchTo().defaultContent();
	}
	
	public static String readExcel(int row,int cell) throws Exception {
		File loc = new File(System.getProperty("user.dir")+"\\Excel\\pomexcel.xlsx");
		FileInputStream in = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(in);
		Sheet s = w.getSheet("Datas");
		String value = null;
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(row);
			for (int j = 0; j <r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(cell);
				int type = c.getCellType();
				
				if (type==1) {
					 value = c.getStringCellValue();
				}else if (type==0) {
					if (DateUtil.isCellDateFormatted(c)) {
						Date date = c.getDateCellValue();
						SimpleDateFormat sm = new SimpleDateFormat("dd/MM/yyyy");
						value = sm.format(date);
					}else {
						double d = c.getNumericCellValue();
						long l = (long) d;
						value = String.valueOf(l);
					}
				}
					
			}
		}
		return value;		
	}
	
}
