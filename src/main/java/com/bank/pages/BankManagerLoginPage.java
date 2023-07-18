package com.bank.pages;

import com.aventstack.extentreports.Status;

import com.bank.customlisteners.CustomListeners;
import com.bank.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BankManagerLoginPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Add Customer')]")
    WebElement addCustomerTab;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Open Account')]")
    WebElement openAccountTab;


    public void clickOnAddCustomerTab() {
        Reporter.log("Click on add customer tab" + addCustomerTab.toString());
        CustomListeners.test.log(Status.PASS, "Click on add customer tab");
        clickOnElement(addCustomerTab);
    }

    public void clickOnOpenAccountTab() {
        Reporter.log("Click on open account tab" + openAccountTab.toString());
        CustomListeners.test.log(Status.PASS, "Click on open account tab");
        clickOnElement(openAccountTab);
    }

}
