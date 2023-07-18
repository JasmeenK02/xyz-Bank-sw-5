package com.bank.pages;

import com.aventstack.extentreports.Status;

import com.bank.customlisteners.CustomListeners;
import com.bank.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CustomersPage extends Utility {

    @CacheLookup
    @FindBy(id = "userSelect")
    WebElement customerCreatedName;
    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginButton;
    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'Your Name :')]")
    WebElement verifyYourName;


    public void searchCreatedCustomer(String customerName) {
        Reporter.log("Search created customer" + customerName + "to email field" + customerCreatedName.toString());
        CustomListeners.test.log(Status.PASS, "Search created customer" + customerName);
        selectByVisibleTextFromDropDown(customerCreatedName, customerName);
    }

    public void clickOnLoginButton() {
        Reporter.log("Click on login button" + loginButton.toString());
        CustomListeners.test.log(Status.PASS, "Click on login button");
        clickOnElement(loginButton);
    }

    public String verifyYourNameText() {
        Reporter.log("Verify your name text" + verifyYourName.toString());
        CustomListeners.test.log(Status.PASS, "Verify your name text");
        return getTextFromElement(verifyYourName);
    }

}
