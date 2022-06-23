package tests.sixpmTests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import sixpm.BrowserType;
import sixpm.DriverFactory;
import sixpm.pages.HomePage;
import sixpm.pages.ProductsPage;

public class TestSearch {

    @Test
    public void testSearchFunctionality() {
        DriverFactory.initDriver(BrowserType.CHROME);
        HomePage homePage = new HomePage(DriverFactory.getDriver()).openPage();
        final String searchText = "Sneakers";
        homePage.waitForPageLoad();
        homePage.searchFor(searchText);
        ProductsPage productsPage = new ProductsPage(DriverFactory.getDriver());
        productsPage.waitForPageLoad();

        Assert.assertEquals(productsPage.getSearchResultHeaderText(), searchText);
    }

    @AfterMethod
    public void tearDown() {
        WebDriver driver = DriverFactory.getDriver();
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
