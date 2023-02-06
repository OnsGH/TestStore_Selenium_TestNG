package base;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePage {
	
	public static WebDriver driver;
	private String url;
	private Properties prop;
	
	public BasePage() throws IOException {
		prop = new Properties();
		String userHome = System.getProperty("user.dir");
		System.out.println("USER_HOME "+ userHome);
		FileInputStream data = new FileInputStream(userHome + "/src/main/java/resources/config.properties");
		
		System.out.println("Data "+ data);
		prop.load(data);
		
	}
	
	public WebDriver getDriver() {
		 
		if(prop.getProperty("browser").equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/main/java/drivers/chromedriver");
			driver = new ChromeDriver();
		}else if (prop.getProperty("browser").equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/src/main/java/drivers/geckodriver");
			driver = new FirefoxDriver();
			
		}else {
			
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"/src/main/java/drivers//msedgedriver");
			driver = new EdgeDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		return driver;
		
	}
	
	public String getUrl() {
		
		url = prop.getProperty("url");
		return url;
	}
	
	public void takeScreenShot(String name) throws IOException {
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destFile = new File(System.getProperty("user.dir")+"//target//screenshots//"+ timestamp() + ".png");
		FileUtils.copyFile(srcFile, destFile);
		
	}
	
	public String timestamp() {
		
		return new SimpleDateFormat("yyyy-mm-dd HH-mm-ss").format(new Date());
	}

}
