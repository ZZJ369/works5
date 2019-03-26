package work5;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class xueshenglogin{
	 public WebDriver driver;
	  private String url1;
	 @BeforeClass
	  public void setUp() throws Exception {
		 System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
			driver=new ChromeDriver();
		url1="http://localhost:8080/examsys/";
		driver.get(url1);
	  }
@Test
public void open() throws InterruptedException{
	
	driver.findElement(By.name("username")).clear();
    driver.findElement(By.name("username")).sendKeys("hujianming");
    driver.findElement(By.name("userpass")).clear();
    driver.findElement(By.name("userpass")).sendKeys("hujianming123");
    new Select(driver.findElement(By.name("usertype"))).selectByVisibleText("π‹¿Ì‘±");
    Thread.sleep(10000);
    driver.findElement(By.cssSelector("button.tm_btn")).click();
    Thread.sleep(10000);
    driver.switchTo().frame("main");
    String a=driver.findElement(By.xpath("/html/body/div/div[1]/ul")).getText();
  	System.out.println(a);

}		
	 @AfterClass
	  public void tearDown() throws Exception {		 
		driver.close();
	    }
}
