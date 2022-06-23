package sixpm.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    protected WebDriver driver;
    protected final String BASE_URL = "https://www.6pm.com/";

    @FindBy(id = "searchAll")
    protected WebElement inputSearch;

    @FindBy(css = "#searchForm > button")
    protected WebElement searchBtn;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void searchFor(String searchText) {
        inputSearch.sendKeys(searchText);
        inputSearch.sendKeys(Keys.ENTER);
    }
}
