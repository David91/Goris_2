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
        final String searchText = "Glass";
        homePage.waitForPageLoad();
        homePage.searchFor(searchText);
        ProductsPage productsPage = new ProductsPage(DriverFactory.getDriver());
        productsPage.waitForPageLoad();

        Assert.assertEquals(productsPage.getSearchResultHeaderText(), searchText);

        String secondSearchText = "Sneakers";
        productsPage.searchFor(secondSearchText);
        productsPage.waitForPageLoad();

        Assert.assertEquals(productsPage.getSearchResultHeaderText(), secondSearchText);
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
