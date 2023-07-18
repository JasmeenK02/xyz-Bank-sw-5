package com.bank.pages;

import com.aventstack.extentreports.Status;

import com.bank.customlisteners.CustomListeners;
import com.bank.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class OpenAccountPage extends Utility {

    @CacheLookup
    @FindBy(id = "userSelect")
    WebElement searchCustomer;
    @CacheLookup
    @FindBy(id = "currency")
    WebElement searchCurrency;
    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement processButton;


    public void searchCustomerCreatedInFirstTest(String customerName) {
        Reporter.log("Search customer created in first test" + customerName + "to email field" + searchCustomer.toString());
        CustomListeners.test.log(Status.PASS, "Search customer created in first test" + customerName);
        selectByVisibleTextFromDropDown(searchCustomer, customerName);
    }

    public void searchCurrencyPound(String currency) {
        Reporter.log("Search currency pound" + currency + "to email field" + searchCurrency.toString());
        CustomListeners.test.log(Status.PASS, "Search currency pound" + currency);
        selectByVisibleTextFromDropDown(searchCurrency, currency);
    }

    public void clickOnProcessButton() {
        Reporter.log("Click on process button" + processButton.toString());
        CustomListeners.test.log(Status.PASS, "Click on process button");
        clickOnElement(processButton);
    }

    public String verifyAlertText() {
        Reporter.log("Verify alert text");
        CustomListeners.test.log(Status.PASS, "Verify alert text");
        return getTextFromAlert();
    }

    public void acceptTheAlert() {
        Reporter.log("Accept the alert");
        CustomListeners.test.log(Status.PASS, "Accept the alert");
        acceptAlert();
    }
}
