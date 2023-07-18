package com.bank.testsuite;


import com.bank.customlisteners.CustomListeners;
import com.bank.pages.*;
import com.bank.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(CustomListeners.class)
public class BankTest extends BaseTest {

    HomePage homePage;
    BankManagerLoginPage bankManagerLoginPage;
    AddCustomerPage addCustomerPage;
    OpenAccountPage openAccountPage;
    CustomersPage customersPage;
    AccountPage accountPage;
    SoftAssert softAssert;

    @BeforeMethod
    public void inIt() {

        homePage = new HomePage();
        bankManagerLoginPage = new BankManagerLoginPage();
        addCustomerPage = new AddCustomerPage();
        openAccountPage = new OpenAccountPage();
        customersPage = new CustomersPage();
        accountPage = new AccountPage();
        softAssert = new SoftAssert();
    }

    @Test(groups = {"sanity", "regression"})
    public void bankManagerShouldAddCustomerSuccessfully() throws InterruptedException {


        //click On "Bank Manager Login" Tab
        homePage.clickOnBankManagerLoginTab();
        //click On "Add Customer" Tab
        bankManagerLoginPage.clickOnAddCustomerTab();
        //enter FirstName
        addCustomerPage.enterFirstName("Jasmeen");
        //enter LastName
        addCustomerPage.enterLastName("Kaur");
        //enter PostCode
        addCustomerPage.enterPostCode("CV21 1BF");
        //click On "Add Customer" Button
        addCustomerPage.clickOnAddCustomerButton();
        //verify message "Customer added successfully" on popup displayed
        softAssert.assertEquals(addCustomerPage.verifyAlertText(), "Customer added successfully with customer id :6", "\"Unable to verify text.");
        //click on "ok" button on popup.
        addCustomerPage.acceptingAlert();
        softAssert.assertAll();
    }

    @Test(groups = {"smoke", "regression"})
    public void bankManagerShouldOpenAccountSuccessfully() throws InterruptedException {


        //click On "Bank Manager Login" Tab
        Thread.sleep(3000);
        homePage.clickOnBankManagerLoginTab();
        //click On "Open Account" Tab
        bankManagerLoginPage.clickOnOpenAccountTab();
        //Search customer that created in first test
        openAccountPage.searchCustomerCreatedInFirstTest("Harry Potter");
        //Select currency "Pound"
        openAccountPage.searchCurrencyPound("Pound");
        //click on "process" button
        openAccountPage.clickOnProcessButton();
        //verify message "Account created successfully" on popup displayed
        softAssert.assertEquals(openAccountPage.verifyAlertText(), "Account created successfully with account Number :1016", "Unable to verify text.");
        //click on "ok" button on popup.
        openAccountPage.acceptTheAlert();
        softAssert.assertAll();
    }

    @Test(groups = {"regression"})
    public void customerShouldLoginAndLogoutSuccessfully() throws InterruptedException {


        //click on "Customer Login" Tab
        Thread.sleep(2000);
        homePage.clickOnCustomerLoginTab();
        //search customer that you created.
        customersPage.searchCreatedCustomer("Harry Potter");
        //click on "Login" Button
        customersPage.clickOnLoginButton();
        //verify "Logout" Tab displayed.
        softAssert.assertEquals(accountPage.verifyLogoutTabDisplayed(), "Logout", "Unable to verify text.");
        //click on "Logout"
        accountPage.clickOnLogout();
        //verify "Your Name" text displayed.
        softAssert.assertEquals(customersPage.verifyYourNameText(), "Your Name :", "Unable to verify text.");
        softAssert.assertAll();
    }

    @Test(groups = {"regression"})
    public void customerShouldDepositMoneySuccessfully() throws InterruptedException {


        //click on "Customer Login" Tab
        Thread.sleep(2000);
        homePage.clickOnCustomerLoginTab();
        //search customer that you created.
        customersPage.searchCreatedCustomer("Harry Potter");
        //click on "Login" Button
        customersPage.clickOnLoginButton();
        //click on "Deposit" Tab
        accountPage.clickOnDepositTab();
        //Enter amount 100
        accountPage.enterAmount("100");
        //click on "Deposit" Button
        Thread.sleep(2000);
        accountPage.clickOnDepositButton();
        //verify message "Deposit Successful"
        softAssert.assertEquals(accountPage.verifyDepositSuccessfulMessage(), "Deposit Successful", "Unable to verify message.");
        softAssert.assertAll();
    }

    @Test(groups = {"regression"})
    public void customerShouldWithdrawMoneySuccessfully() throws InterruptedException {


        //click on "Customer Login" Tab
        Thread.sleep(2000);
        homePage.clickOnCustomerLoginTab();
        //search customer that you created.
        customersPage.searchCreatedCustomer("Harry Potter");
        //click on "Login" Button
        customersPage.clickOnLoginButton();
        //click on "Withdrawal" Tab
        accountPage.clickOnWithdrawalTab();
        //Enter amount 50
        accountPage.enterAmount("50");
        //click on "withdraw" Button
        accountPage.clickOnWithdrawButton();
        //verify message "Transaction Successful"
        softAssert.assertEquals(accountPage.verifyTransactionSuccessfulMessage(), "Transaction successful", "Unable to verify message.");
        softAssert.assertAll();
    }
}
