package uk.co.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//button[@id='save']")
    WebElement acceptAllBtn;

    @CacheLookup
    @FindBy(id ="keywords")
    WebElement jobTitle1;

    @CacheLookup
    @FindBy(id ="location")
    WebElement location1;

    @CacheLookup
    @FindBy(id ="distance")
    WebElement distance1;

    @CacheLookup
    @FindBy(id="toggle-hp-search")
    WebElement moreSearchOption1;

    @CacheLookup
    @FindBy(id="salarymin")
    WebElement salaryMin1;

    @CacheLookup
    @FindBy(id="salarymax")
    WebElement salaryMax1;

    @CacheLookup
    @FindBy(id="salarytype")
    WebElement salaryTypeDropDown1;

    @CacheLookup
    @FindBy(id="tempperm")
    WebElement jobTypeDropDown1;

    @CacheLookup
    @FindBy(id="hp-search-btn")
    WebElement findJobBtn;

    public void acceptIFrameAlert() throws InterruptedException {
        Thread.sleep(2000);
        driver.switchTo().frame("gdpr-consent-notice");
        clickOnElement(acceptAllBtn);
        log.info("Accepting all cookies : " + acceptAllBtn.toString());

    }

    public void addJobTitle(String jobTitle){
        sendTextToElement(jobTitle1,jobTitle);
        log.info("Entering Job Title : " + jobTitle);
    }
    public void addLocation(String location){
        sendTextToElement(location1,location);
        log.info("Entering Location : " + location);
    }

    public void selectDistance(String distance){
        selectByVisibleTextFromDropDown(distance1,distance);
        log.info("Selecting Distance : " + distance);
    }
    public void clickOnMoreSearchOption(){
        clickOnElement(moreSearchOption1);
        log.info("Clicking on More Search Options : " + moreSearchOption1.toString());
    }
    public void enterMinSalary(String minSalary){
        sendTextToElement(salaryMin1,minSalary);
        log.info("Entering Min Salary : " + minSalary);
    }
    public void enterMaxSalary(String maxSalary){
        sendTextToElement(salaryMax1,maxSalary);
        log.info("Entering Max Salary : " + maxSalary);
    }
    public void selectSalaryType(String sType){
        selectByVisibleTextFromDropDown(salaryTypeDropDown1,sType);
        log.info("Selecting Salary Type : " + sType);
    }
    public void selectJobType(String jType){
        selectByVisibleTextFromDropDown(jobTypeDropDown1,jType);
        log.info("Selecting Job Type : " + jType);
    }
    public void clickOnFindJobButton(){
        clickOnElement(findJobBtn);
        log.info("Clicking on Find Job Button : " );
    }

}


