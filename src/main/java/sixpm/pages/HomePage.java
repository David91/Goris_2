package sixpm.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    private WebDriver driver;
    private static String URL = "https://www.6pm.com/";

    @FindBy(id = "searchAll")
    private WebElement inputSearch;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public HomePage openPage() {
        driver.get(URL);
        return this;
    }

    public void waitForPageLoad() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(inputSearch));
    }

    public void searchFor(String searchText) {
        inputSearch.sendKeys(searchText);
        inputSearch.sendKeys(Keys.ENTER);
    }
}
