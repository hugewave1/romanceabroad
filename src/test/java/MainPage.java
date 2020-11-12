import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainPage {
    String mainUrl = "https://romanceabroad.com/";
    WebDriver driver;
    String currentUrlSearch;
    String expectedUrl= "https://romanceabroad.com/users/search";

    @BeforeMethod
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "chromedriver 2");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(mainUrl);

    }

    @Test
    public void testMainPage () {
     driver.findElement(By.xpath("//a[@href='https://romanceabroad.com/users/search']")).click();
     currentUrlSearch=driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch, expectedUrl);
    }




  @AfterMethod
    public void afterActions(){
      driver.quit();
  }

}
