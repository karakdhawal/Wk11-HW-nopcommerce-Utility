package testsuite;
//5. Write down the following test into ‘RegisterTest’ class
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class RegisterTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setup (){
        openBrowser(baseUrl);
    }
    @Test
    /*1. userShouldNavigateToRegisterPageSuccessfully
     * click on the ‘Register’ link * Verify the text ‘Register’
     */
    public void userShouldNavigateToRegisterPageSuccessfully (){
        clickOnElement(By.linkText("Register"));
        String actualmes = getTextFromElement(By.linkText("Register"));
        System.out.println(actualmes);
        String expectedmes = "Register";
        Assert.assertEquals(expectedmes, actualmes);
    }
    @Test
    /*2. userSholdRegisterAccountSuccessfully * click on the ‘Register’ link
     * Select gender radio button * Enter First name
     * Enter Last name * Select Day Month and Year * Enter Email address
     * Enter Password * Enter Confirm password * Click on REGISTER button
     * Verify the text 'Your registration completed
     */
    public void userShouldRegisterAccountSuccessfully (){
    clickOnElement(By.linkText("Register"));
    clickOnElement(By.xpath("//input[@id='gender-male']"));
    sendKeysToElement(By.xpath("//input[@id='FirstName']"),"uk");
    sendKeysToElement(By.xpath("//input[@id='LastName']"),"lord");
    sendKeysToElement(By.xpath("//select[@name='DateOfBirthDay']"),"1");
    sendKeysToElement(By.xpath("//select[@name='DateOfBirthMonth']"), "January");
    sendKeysToElement(By.xpath("//select[@name='DateOfBirthYear']"),"1981");
    sendKeysToElement(By.xpath("//input[@id='Email']"),"lorduk11@gmail.com");
    sendKeysToElement(By.xpath("//input[@id='Password']"), "123456");
    sendKeysToElement(By.xpath("//input[@id='ConfirmPassword']"),"123456");
    clickOnElement(By.xpath("//button[@id='register-button']"));
    String actualmes = getTextFromElement(By.xpath("//div[@class='result']"));
    System.out.println(actualmes);
    String expectedmes = "Your registration completed";
    Assert.assertEquals(expectedmes,actualmes);




    }


    @After
    public void teardown (){
        closeBrowser();
    }
}
