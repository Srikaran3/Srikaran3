package org.sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.Junit.FbLoginLocators;
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
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

//Base class
public class LibGlobal {
	protected static WebDriver driver;
	static Actions ac;
	static Robot r;
	static Alert a;
	static JavascriptExecutor js;
	static Select s;
	protected static FbLoginLocators f;

	// 1.
	public static void edgeBrowserLaunch() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}

	// 2.
	public static void loadUrl(String url) {

		driver.get(url);
	}

	// 3.
	public static void toMaximize() {
		driver.manage().window().maximize();
	}

	// 4.
	public static void toFill(WebElement e, String text) {
		e.sendKeys(text);
	}

	// 5.
	public static void toClick(WebElement b) {
		b.click();
	}

	// 6.
	public static void toQuit() {
		driver.quit();

	}

	// 7.
	public static void toSnap(String FileName) throws IOException {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\karthick\\eclipse-workspace\\Student\\Screenshots\\" + FileName + ".png");
		FileUtils.copyFile(src, dest);
	}

	// 8.
	public static void toMouseHover(WebElement e) {

		ac = new Actions(driver);
		ac.moveToElement(e).perform();
	}

	// 9.
	public static void toWait() {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	}

	// 10.
	public static void toCut() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_X);

	}

	// 11.
	public static void toCopy() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);

	}

	// 12.
	public static void toPaste() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);

	}

	// 13.
	public static void toDoubleClick(WebElement e) {
		ac = new Actions(driver);
		ac.doubleClick(e).perform();
	}

	// 14.
	public static void toRightClick(WebElement e) {
		ac = new Actions(driver);
		ac.contextClick(e).perform();
	}

	// 15.
	public static void toDragAndDrop(WebElement src, WebElement dest) {
		ac = new Actions(driver);
		ac.dragAndDrop(src, dest).perform();
	}

	// 16.
	public static void closeCurrentTab() {
		driver.close();

	}

	// 17.
	public static void toCloseBrowser() {
		driver.quit();

	}

	// 18.
	public static void toPressEnter() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

	// 19.
	public static void toPressEsc() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
	}

	// 20.
	public static void toPressTab() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	}

	// 21.
	public static void alertAccept() {
		a = driver.switchTo().alert();
		a.accept();
	}

	// 22
	public static void alertDismiss() {
		a = driver.switchTo().alert();
		a.dismiss();
	}

	// 23
	public static void alertSendKeys(String text) {
		a = driver.switchTo().alert();
		a.sendKeys(text);

	}

	// 24
	public static void alertGetText() {
		System.out.println(a.getText());
	}

	// 25
	public static void moveForwad() {
		driver.navigate().forward();
	}

	// 26
	public static void moveback() {
		driver.navigate().back();
	}

	// 27
	public static void refreshPage() {
		driver.navigate().refresh();
	}

	// 28
	public static void webTableParticularCell(int rowIndex, int columnIndex) {
		WebElement table = driver.findElement(By.id("customers"));
		List<WebElement> Rows = table.findElements(By.tagName("tr"));
		WebElement row = Rows.get(rowIndex);
		List<WebElement> datas = row.findElements(By.tagName("td"));
		WebElement data = datas.get(columnIndex);
		System.out.println(data.getText());

	}

	// 29 create new sheet enter data in a particular cell
	public static void toCreateSheet(String fileName, String sheetName, int rowIndex, int cellIndex, String value)
			throws IOException {
		File f = new File("C:\\Users\\karthick\\eclipse-workspace\\Student\\ExcelSheet\\" + fileName + ".xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet s = w.createSheet(sheetName);
		Row r = s.createRow(rowIndex);
		Cell c = r.createCell(cellIndex);
		c.setCellValue(value);
		FileOutputStream op = new FileOutputStream(f);
		w.write(op);
	}

	// 30
	public static String gettingCurrentUrl() {
		String url = driver.getCurrentUrl();
		return url;
	}

	// 31
	public static String gettingTitle() {
		String title = driver.getTitle();
		return title;
	}
	// 32

	public static String retrieveTextJse(WebElement e) {

		js = (JavascriptExecutor) driver;
		Object s = js.executeScript("return arguments[0].getAttribute('value')", e);
		String as = (String) s;
		return as;

	}
	// 33

	public static void clickJse(WebElement e) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", e);
	}

	// 34

	public static void scrollBottomJse() {
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	// 35

	public static void scrollTopJse() {
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,0)");
	}

	// 36
	public static void scrollIntoViewJse(WebElement e) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", e);
	}

	// 37
	public static void toSelectByIndex(WebElement e, int value) {
		s = new Select(e);
		s.selectByIndex(value);
	}

	// 38
	public static void toSelectByVisibleText(WebElement e, String text) {
		s = new Select(e);
		s.selectByVisibleText(text);
	}

	// 39
	public static void toSelectByValue(WebElement e, String value) {
		s = new Select(e);
		s.selectByValue(value);
	}

	// 40
	public static void toSelectAll() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);

	}

	// 41
	public static void chromeBrowserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	// 42
	public static void ieBrowserLaunch() {
		WebDriverManager.iedriver().setup();
		driver = new InternetExplorerDriver();
	}

	// 43
	public static String toGetAttribute(WebElement e) {
		String attribute = e.getAttribute("value");
		return attribute;
	}

	// 44
	public static void togetText(WebElement e) {
		e.getText();
	}

	// 45
	public static void ReplaceParticularCellValue(String fileName, int sheetIndex, int rowIndex, int cellIndex,
			String oldValue, String newValue) throws Exception {
		File f = new File("C:\\Users\\karthick\\eclipse-workspace\\Student\\ExcelSheet\\" + fileName + ".xlsx");

		FileInputStream input = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(input);
		Sheet s = w.getSheetAt(sheetIndex);
		Row r = s.getRow(rowIndex);
		Cell c = r.getCell(cellIndex);
		String v = c.getStringCellValue();
		if (v.contains(oldValue)) {
			c.setCellValue(newValue);
		}
		FileOutputStream out = new FileOutputStream(f);
		w.write(out);

	}

	// 46
	public static void createRow(String fileName, int sheetIndex, int rowIndex, int cellIndex, String value)
			throws IOException {
		File f = new File("C:\\Users\\karthick\\eclipse-workspace\\Student\\ExcelSheet\\" + fileName + ".xlsx");
		FileInputStream input = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(input);
		Sheet s = w.getSheetAt(sheetIndex);
		Row r = s.createRow(rowIndex);
		Cell c = r.createCell(cellIndex);
		c.setCellValue(value);
		FileOutputStream out = new FileOutputStream(f);
		w.write(out);
	}
	// 47

	public static void createCell(String fileName, int sheetIndex, int rowIndex, int cellIndex, String value)
			throws IOException {
		File f = new File("C:\\Users\\karthick\\eclipse-workspace\\Student\\ExcelSheet\\" + fileName + ".xlsx");
		FileInputStream input = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(input);
		Sheet s = w.getSheetAt(sheetIndex);
		Row r = s.getRow(rowIndex);
		Cell c = r.createCell(cellIndex);
		c.setCellValue(value);
		FileOutputStream out = new FileOutputStream(f);
		w.write(out);
	}
	// 48

	public static void gettingAllCellValue(String fileName, String sheetName) throws IOException {
		String value = null;
		File fil = new File("C:\\Users\\karthick\\eclipse-workspace\\Student\\ExcelSheet\\" + fileName + ".xlsx");
		FileInputStream input = new FileInputStream(fil);
		Workbook w = new XSSFWorkbook(input);
		Sheet s = w.getSheet(sheetName);
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);
				int cellType = c.getCellType();
				if (cellType == 1) {
					value = c.getStringCellValue();
				} else if (DateUtil.isCellDateFormatted(c)) {
					Date d = c.getDateCellValue();
					SimpleDateFormat sim = new SimpleDateFormat("dd/MM/yyyy");
					value = sim.format(d);
				} else {
					double n = c.getNumericCellValue();

					long l = (long) n;
					value = String.valueOf(l);
				}
				System.out.println(value);
			}

		}
	}

	// 49
	public static String excelRead(String fileName, String sheetName, int rowIndex, int cellIndex) throws IOException {

		File fil = new File("C:\\Users\\karthick\\eclipse-workspace\\Student\\ExcelSheet\\" + fileName + ".xlsx");
		FileInputStream input = new FileInputStream(fil);
		Workbook w = new XSSFWorkbook(input);
		Sheet s = w.getSheet(sheetName);
		Row r = s.getRow(rowIndex);
		Cell c = r.getCell(cellIndex);
		int cellType = c.getCellType();
		String value;
		if (cellType == 1) {
			value = c.getStringCellValue();
		} else if (DateUtil.isCellDateFormatted(c)) {
			Date d = c.getDateCellValue();
			SimpleDateFormat sim = new SimpleDateFormat("dd/MM/yyyy");
			value = sim.format(d);
		} else {
			double n = c.getNumericCellValue();

			long l = (long) n;
			value = String.valueOf(l);
		}
		return value;
	}
}