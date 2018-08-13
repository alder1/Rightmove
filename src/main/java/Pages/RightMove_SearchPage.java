package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RightMove_SearchPage {
    WebDriver driver;

    public RightMove_SearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    @FindBy(id = "searchLocation")
    private WebElement clickSearchField;

    @FindBy(id = "typeaheadList")
    private WebElement Location;

    @FindBy(id = "buy")
    private WebElement Buy;

    @FindBy(id = "radius")
    private WebElement Radius;

    public void SearchField() { clickSearchField.click(); }

    public void TypeLocation(String myLocation){ Location.sendKeys(myLocation); }

     public void clickForSale (){ Buy.click(); }

     public void searchRadius() { Buy.click(); }

    }



