package step_definition;

import DriverInstance.driverInstance;
import Pages.RightMove_SearchPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class RightMove_Search extends driverInstance {

    RightMove_SearchPage rms = new RightMove_SearchPage(driver);


    @Given("^I am am on RightMove website$")
    public void i_am_am_on_RightMove_website() throws Throwable {
     Thread.sleep(5000);
     System.out.println("This is to test property search");
    }

    @Given("^I click on the search field$")
    public void i_click_on_the_search_field() throws Throwable {
    Thread.sleep(5000);
    rms.SearchField();

    }

    @Given("^I enter the text \"([^\"]*)\"$")
    public void i_enter_the_text(String arg1) throws Throwable {
     Thread.sleep(2000);
     rms.TypeLocation("London");
    }

    @Given("^I click on the For sale tab$")
    public void i_click_on_the_For_sale_tab() throws Throwable {
    Thread.sleep(2000);
    rms.clickForSale();
    }

    @Given("^I select the search radius$")
    public void i_select_the_search_radius() throws Throwable {
    Thread.sleep(2000);
    rms.searchRadius();
    }

    @Given("^I select the price range$")
    public void i_select_the_price_range() throws Throwable {

    }

    @Given("^I select the number of bedrooms$")
    public void i_select_the_number_of_bedrooms() throws Throwable {

    }

    @Given("^I select the property type$")
    public void i_select_the_property_type() throws Throwable {

    }

    @Given("^I select added to site$")
    public void i_select_added_to_site() throws Throwable {

    }

    @Given("^I select Find properties$")
    public void i_select_Find_properties() throws Throwable {

    }

    @Then("^matching my selections should be displayed$")
    public void matching_my_selections_should_be_displayed() throws Throwable {

    }

}
