package com.bank.pages;

import com.aventstack.extentreports.Status;

import com.bank.customlisteners.CustomListeners;
import com.bank.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class AddCustomerPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder = 'First Name']")
    WebElement firstNameField;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder = 'Last Name']")
    WebElement lastNameField;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder = 'Post Code']")
    WebElement postCodeField;
    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement addCustomerButton;


    public void enterFirstName(String firstName) {
        Reporter.log("Enter first name" + firstName + "to email field" + firstNameField.toString());
        CustomListeners.test.log(Status.PASS, "Enter first name " + firstName);
        sendTextToElement(firstNameField, firstName);
    }

    public void enterLastName(String lastName) {
        Reporter.log("Enter last name" + lastName + "to email field" + lastNameField.toString());
        CustomListeners.test.log(Status.PASS, "Enter last name " + lastName);
        sendTextToElement(lastNameField, lastName);
    }

    public void enterPostCode(String postCode) {
        Reporter.log("Enter post code" + postCode + "to email field" + postCodeField.toString());
        CustomListeners.test.log(Status.PASS, "Enter post code " + postCode);
        sendTextToElement(postCodeField, postCode);
    }

    public void clickOnAddCustomerButton() {
        Reporter.log("Click on add customer button" + addCustomerButton.toString());
        CustomListeners.test.log(Status.PASS, "Click on add customer button");
        clickOnElement(addCustomerButton);
    }

    public String verifyAlertText() {
        Reporter.log("Verify alert text");
        CustomListeners.test.log(Status.PASS, "Verify alert text");
        return getTextFromAlert();
    }

    public void acceptingAlert() {
        Reporter.log("Accepting the alert");
        CustomListeners.test.log(Status.PASS, "Accepting the alert");
        acceptAlert();
    }

}
