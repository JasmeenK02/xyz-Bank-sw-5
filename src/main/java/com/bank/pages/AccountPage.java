package com.bank.pages;

import com.aventstack.extentreports.Status;

import com.bank.customlisteners.CustomListeners;
import com.bank.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class AccountPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//button[@class='btn logout']")
    WebElement logoutTab;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Deposit')]")
    WebElement depositTab;
    @CacheLookup
    @FindBy(xpath = "//input[@type='number']")
    WebElement amount;
    @CacheLookup
    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/button[1]")
    WebElement depositButton;
    @CacheLookup
    @FindBy(xpath = "//span[@class='error ng-binding']")
    WebElement verifyDepositSuccessful;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Withdrawl')]")
    WebElement withdrawal;
    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement withdrawButton;
    @CacheLookup
    @FindBy(xpath = "//span[@class='error ng-binding']")
    WebElement transactionSuccessful;

    public String verifyLogoutTabDisplayed() {
        Reporter.log("Verify logout tab is displayed" + logoutTab.toString());
        CustomListeners.test.log(Status.PASS, "Verify logout tab is displayed");
        return getTextFromElement(logoutTab);
    }

    public void clickOnLogout() {
        Reporter.log("Click on logout" + logoutTab.toString());
        CustomListeners.test.log(Status.PASS, "Click on logout");
        clickOnElement(logoutTab);
    }

    public void clickOnDepositTab() {
        Reporter.log("Click on deposit tab" + depositButton.toString());
        CustomListeners.test.log(Status.PASS, "Click on deposit tab");
        clickOnElement(depositTab);
    }

    public void enterAmount(String enterAmount) {
        Reporter.log("Enter amount" + enterAmount + "to email field" + amount.toString());
        CustomListeners.test.log(Status.PASS, "Enter amount " + enterAmount);
        sendTextToElement(amount, enterAmount);
    }

    public void clickOnDepositButton() {
        Reporter.log("Click on deposit button" + depositButton.toString());
        CustomListeners.test.log(Status.PASS, "Click on deposit button");
        clickOnElement(depositButton);
    }

    public String verifyDepositSuccessfulMessage() {
        Reporter.log("Verify deposit successful message" + verifyDepositSuccessful.toString());
        CustomListeners.test.log(Status.PASS, "Verify deposit successful message");
        return getTextFromElement(verifyDepositSuccessful);
    }

    public void clickOnWithdrawalTab() {
        Reporter.log("Click on withdrawal tab" + withdrawal.toString());
        CustomListeners.test.log(Status.PASS, "Click on withdrawal tab");
        clickOnElement(withdrawal);
    }

    public void clickOnWithdrawButton() {
        Reporter.log("Click on withdrawal button" + withdrawButton.toString());
        CustomListeners.test.log(Status.PASS, "Click on withdrawal button");
        clickOnElement(withdrawButton);
    }

    public String verifyTransactionSuccessfulMessage() {
        Reporter.log("Verify transaction successful mMessage" + transactionSuccessful.toString());
        CustomListeners.test.log(Status.PASS, "Verify transaction successful mMessage");
        return getTextFromElement(transactionSuccessful);
    }
}
