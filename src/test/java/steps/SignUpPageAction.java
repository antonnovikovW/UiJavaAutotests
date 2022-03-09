package steps;

import io.cucumber.java.en.Then;
import pages.SignUpPage;

import static config.UserConfig.*;

public class SignUpPageAction {
    SignUpPage signUpPage = new SignUpPage();

    @Then("Content SignUpPage visible")
    public void contentVisible() {
        signUpPage.waitForLoaded();
    }

    @Then("Input phone number")
    public void inputPhone() {
        signUpPage.inputPhone(PHONE);
    }

    @Then("Input e-mail")
    public void inputEmail() {
        signUpPage.inputEmail(EMAIL);
    }

    @Then("Click next button")
    public void clickNextButton() {
        signUpPage.nextButtonClick();
    }

    @Then("Input users data")
    public void inputUsersData() {
        signUpPage.inputUsersData(SECONDNAME, NAME, FATHERNAME);
    }
}
