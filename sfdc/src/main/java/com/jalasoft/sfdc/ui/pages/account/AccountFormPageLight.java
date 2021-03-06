package com.jalasoft.sfdc.ui.pages.account;

import com.jalasoft.sfdc.entities.Account;
import com.jalasoft.sfdc.ui.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class AccountFormPageLight extends AccountFormPage {

    @Override
    public void waitUntilPageObjectIsLoaded() {
        driverTools.waitUntilElementDisplayed(accountNameTextField);
    }

    @FindBy(css = ".witsSuggestedNameField .input")
    private WebElement accountNameTextField;
    @FindBy(css = "input[title='Search Accounts']")
    private WebElement parentAccountTextField;
    @FindBy(xpath =
            "//span[text()='Account Number']/parent::label/following-sibling::input")
    private WebElement accountNumberTextField;

    @FindBy(xpath =
            "//span[text()='Account Site']/parent::label/following-sibling::input")
    private WebElement accountSiteTextField;
    @FindBy(xpath =
            "//span[text()='Type']/parent::span/following-sibling::div/descendant::a")
    private WebElement typeList;
    @FindBy(xpath =
            "//span[text()='Industry']/parent::span/following-sibling::div/descendant::a")
    private WebElement industryList;
    @FindBy(xpath =
            "//span[text()='Annual Revenue']/parent::label/following-sibling::input")
    private WebElement annualRevenueTextField;
    @FindBy(xpath =
            "//span[text()='Rating']/parent::span/following-sibling::div/descendant::a")
    private WebElement ratingList;
    @FindBy(xpath =
            "//span[text()='Phone']/parent::label/following-sibling::input")
    private WebElement accountPhone;
    @FindBy(xpath =
            "//span[text()='Fax']/parent::label/following-sibling::input")
    private WebElement accountFax;
    @FindBy(xpath =
            "//span[text()='Website']/parent::label/following-sibling::input")
    private WebElement accountWebsite;
    @FindBy(xpath =
            "//span[text()='Ticker Symbol']/parent::label/following-sibling::input")
    private WebElement accountTickerSymbol;
    @FindBy(xpath =
            "//span[text()='Ownership']/parent::span/following-sibling::div/descendant::a")
    private WebElement ownershipList;
    @FindBy(xpath =
            "//span[text()='Employees']/parent::label/following-sibling::input")
    private WebElement accountEmployee;
    @FindBy(xpath =
            "//span[text()='SIC Code']/parent::label/following-sibling::input")
    private WebElement accountSICCode;


    //-----------------------------------------------------------------------------------------------------------------

    /**
     * set accountEmployee attribute.
     *
     * @param accountSICCode string value.
     */
    public void setAccountSICCodeTextField(final String accountSICCode) {
        driverTools.setInputField(this.accountSICCode, accountSICCode);
    }

    /**
     * set accountEmployee attribute.
     *
     * @param accountEmployee string value.
     */
    public void setAccountEmployeeTextField(final String accountEmployee) {
        driverTools.setInputField(this.accountEmployee, accountEmployee);
    }

    /**
     * set accountOwnershipList attribute.
     *
     * @param accountOwnershipList string value.
     */
    public void setAccountOwnershipList(final String accountOwnershipList) {
    }

    /**
     * set accountTickerSymbol attribute.
     *
     * @param accountTickerSymbol string value.
     */
    public void setAccountTickerSymbolTextField(final String accountTickerSymbol) {
        driverTools.setInputField(this.accountTickerSymbol, accountTickerSymbol);
    }

    /**
     * set accountWebsite attribute.
     *
     * @param accountWebsite string value.
     */
    public void setAccountWebsiteTextField(final String accountWebsite) {
        driverTools.setInputField(this.accountWebsite, accountWebsite);
    }

    /**
     * set accountPhone attribute.
     *
     * @param accountFax string value.
     */
    public void setAccountFaxTextField(final String accountFax) {
        driverTools.setInputField(this.accountFax, accountFax);
    }

    /**
     * set accountPhone attribute.
     *
     * @param accountPhone string value.
     */
    public void setAccountPhoneTextField(final String accountPhone) {
        driverTools.setInputField(this.accountPhone, accountPhone);
    }

    /**
     * set ratingList attribute.
     *
     * @param ratingList string value.
     */
    public void setAccountRatingList(final String ratingList) {
    }

    /**
     * set accountName attribute.
     *
     * @param accountName string value.
     */
    private void setAccountNameTextField(final String accountName) {
        driverTools.setInputField(this.accountNameTextField, accountName);
    }

    /**
     * set parentAccount attribute.
     *
     * @param parentAccount the value.
     */
    private void setParentAccountTextField(final String parentAccount) {
        driverTools.setInputField(this.parentAccountTextField, parentAccount);
    }

    /**
     * set accountNumber attribute.
     *
     * @param accountNumber the value.
     */
    private void setAccountNumberTextField(final String accountNumber) {
        driverTools.setInputField(this.accountNumberTextField, accountNumber);
    }

    /**
     * set accountSite attribute.
     *
     * @param accountSite the value.
     */
    private void setAccountSiteTextField(final String accountSite) {
        driverTools.setInputField(this.accountSiteTextField, accountSite);
    }

    /**
     * Method to set type attribute.
     *
     * @param type the value.
     */
    private void setAccountTypeList(final String type) {
    }

    /**
     * set industry attribute.
     *
     * @param industry the value.
     */
    private void setIndustryList(final String industry) {
    }

    /**
     * set annualRevenue attribute.
     *
     * @param annualRevenue the value.
     */
    private void setAnnualRevenueTextField(final String annualRevenue) {

    }

    /**
     * set field requiered on form account.
     *
     * @param value requiered
     * @return page with detail.
     */
    public AccountDetailsPage setRequeredFiel(String value) {
        setAccountNameTextField(value);
        driverTools.clickElement(saveButton);
        return PageFactory.getDetailAccountPage();
    }

    /**
     * @param values account fields.
     * @return map of account fields.
     */
    @Override
    public Map<AccountEnum, StrategySetInputs> getStrategyStepMap(final Map<AccountEnum, String> values) {
        EnumMap<AccountEnum, StrategySetInputs> strategyMap = new EnumMap<>(AccountEnum.class);

        strategyMap.put(AccountEnum.name, () ->
                this.setAccountNameTextField(String.valueOf(values.get(AccountEnum.name))));

        strategyMap.put(AccountEnum.number, () ->
                this.setAccountNumberTextField(String.valueOf(values.get(AccountEnum.number))));

        strategyMap.put(AccountEnum.ACCOUNT_SITE, () ->
                this.setAccountSiteTextField(String.valueOf(values.get(AccountEnum.ACCOUNT_SITE))));

        strategyMap.put(AccountEnum.ANNUAL_REVENUE, () ->
                this.setAnnualRevenueTextField(String.valueOf(values.get(AccountEnum.ANNUAL_REVENUE))));

        strategyMap.put(AccountEnum.INDUSTRY, () ->
                this.setIndustryList(String.valueOf(values.get(AccountEnum.INDUSTRY))));

        strategyMap.put(AccountEnum.PARENT_ACCOUNT, () ->
                this.setParentAccountTextField(String.valueOf(values.get(AccountEnum.PARENT_ACCOUNT))));

        strategyMap.put(AccountEnum.TYPE, () ->
                this.setAccountTypeList(String.valueOf(values.get(AccountEnum.TYPE))));

        strategyMap.put(AccountEnum.RATING, () ->
                this.setAccountRatingList(String.valueOf(values.get(AccountEnum.RATING))));

        strategyMap.put(AccountEnum.phone, () ->
                this.setAccountPhoneTextField(String.valueOf(values.get(AccountEnum.phone))));

        strategyMap.put(AccountEnum.fax, () ->
                this.setAccountFaxTextField(String.valueOf(values.get(AccountEnum.fax))));

        strategyMap.put(AccountEnum.web, () ->
                this.setAccountWebsiteTextField(String.valueOf(values.get(AccountEnum.web))));

        strategyMap.put(AccountEnum.TICKER_SYMBOL, () ->
                this.setAccountTickerSymbolTextField(String.valueOf(values.get(AccountEnum.TICKER_SYMBOL))));

        strategyMap.put(AccountEnum.OWNERSHIP, () ->
                this.setAccountOwnershipList(String.valueOf(values.get(AccountEnum.OWNERSHIP))));

        strategyMap.put(AccountEnum.employees, () ->
                this.setAccountEmployeeTextField(String.valueOf(values.get(AccountEnum.employees))));

        strategyMap.put(AccountEnum.siccode, () ->
                this.setAccountSICCodeTextField(String.valueOf(values.get(AccountEnum.siccode))));
        return strategyMap;
    }

    /**
     * set field requiered on form account.
     *
     * @return page with detail.
     */
    @Override
    public AccountDetailsPage clickSaveButton() {

        driverTools.clickElement(saveButton);
        return PageFactory.getDetailAccountPage();
    }

    @Override
    public List<StrategySetInputs> saveAccount(Account account) {
        List<StrategySetInputs> strategySetInputs = new ArrayList<>();
        if(account.getName()!=null)strategySetInputs.add(()-> driverTools.setInputField(accountNameTextField, account.getName()));
        if(account.getNumber()!=null)strategySetInputs.add(()-> driverTools.setInputField(accountNumberTextField, account.getNumber()));
        if(account.getWeb()!=null)strategySetInputs.add(()-> driverTools.setInputField(accountWebsite, account.getWeb()));
        if(account.getFax()!=null)strategySetInputs.add(()-> driverTools.setInputField(accountFax, account.getFax()));
        if(account.getPhone()!=null)strategySetInputs.add(()-> driverTools.setInputField(accountPhone, account.getPhone()));
        if(account.getSicCode()!=null)strategySetInputs.add(()-> driverTools.setInputField(accountSICCode, account.getSicCode()));
        if(account.getEmployees()!=null)strategySetInputs.add(()-> driverTools.setInputField(accountEmployee, account.getEmployees()));
        return strategySetInputs;
    }

}
