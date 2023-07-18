package com.bank.pages;

import com.aventstack.extentreports.Status;

import com.bank.customlisteners.CustomListeners;
import com.bank.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement bankManagerLoginTab;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement customerLoginTab;
    @CacheLookup
    @FindBy(xpath = "//button[@class='btn home']")
    WebElement homeTab;


    public void clickOnBankManagerLoginTab() {
        Reporter.log("Click on bank manager login tab" + bankManagerLoginTab.toString());
        CustomListeners.test.log(Status.PASS, "Click on bank manager login tab");
        clickOnElement(bankManagerLoginTab);
    }

    public void clickOnCustomerLoginTab() {
        Reporter.log("Click on customer login tab" + customerLoginTab.toString());
        CustomListeners.test.log(Status.PASS, "Click on customer login tab");
        clickOnElement(customerLoginTab);
    }

    public void clickOnHomeTab() {
        Reporter.log("Click on home login tab" + homeTab.toString());
        CustomListeners.test.log(Status.PASS, "Click on home tab");
        clickOnElement(homeTab);
    }

}
