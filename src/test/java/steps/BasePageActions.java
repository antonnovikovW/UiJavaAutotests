package steps;

import io.cucumber.java.en.Then;
import pages.BasePage;

public class BasePageActions {
    BasePage basePage = new BasePage();

    @Then("Content BasePage visible")
    public void contentVisible() {
        basePage.waitForLoaded();
    }

    @Then("Click {string} button")
    public void clickButton(String arg0) {
        basePage.clickButton(arg0);
    }
}
