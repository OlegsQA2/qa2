
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.List;

    public class WebTestDelfi {

        private final String HOME_PAGE = "http://rus.delfi.lv";


        private final By CLASS_ELEMENT = By.className("top2012-title");

        @Test
        public void someTest() {

            String articleName = "Семь пород собак, которые требуют особого внимания в жару";
            Boolean articleFound = false;
            System.setProperty("webdriver.gecko.driver", "/Users/oleg/Desktop/TESTING/PROGI-Testing/geckodriver") ;
            WebDriver driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.get(HOME_PAGE);

            //Vozvrashaet odin element
            WebElement classElement = driver.findElement(CLASS_ELEMENT);

            //Vozvrashaet vse elementi spiskom
            List<WebElement> classElements = driver.findElements(CLASS_ELEMENT);
            for (WebElement element : classElements
                 ) {
                if(articleName.equals(element.getText())){
                    articleFound = true;
                    break;
                }

            }
            driver.quit();
            if (articleFound == true) {
                System.out.println("Statja najdena");

            }

            Assert.assertTrue(articleFound);


    }




}

