package sixpm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ProductsPage extends BasePage {

    private final String productsLocStr = "#products>article";
    private By productLoc = By.cssSelector(productsLocStr);

    @FindBy(css = productsLocStr)
    private List<WebElement> productItems;

    @FindBy(css = "div[class*=searchWrapper]>div h1")
    private WebElement searchResultHeader;

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public void waitForPageLoad() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.numberOfElementsToBeMoreThan(productLoc,0));
    }

    public String getSearchResultHeaderText() {
        return searchResultHeader.getText();
    }

}
