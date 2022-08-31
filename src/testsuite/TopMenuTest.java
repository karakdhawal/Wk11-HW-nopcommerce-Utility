package testsuite;
// Write down the following test into ‘TopMenuTest’ class
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class TopMenuTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setup (){
        openBrowser(baseUrl);
    }
    @Test
    /*1. userShouldNavigateToComputerPageSuccessfully
     * click on the ‘Computers’ Tab * Verify the text ‘Computers’
     */
    public void userShouldNavigateToComputerPageSuccessfully () {
        clickOnElement(By.linkText("Computers"));
        String actualmes = getTextFromElement(By.linkText("Computers"));
        System.out.println(actualmes);
        String expectedmes = "Computers";
        Assert.assertEquals(expectedmes, actualmes);
    }
    @Test
    /*2. userShouldNavigateToElectronicsPageSuccessfully
     * click on the ‘Electronics’ Tab * Verify the text ‘Electronics’
     */
    public void userShouldNavigateToElectronicPageSuccessfully () {
        clickOnElement(By.linkText("Electronics"));
        String actualmes = getTextFromElement(By.linkText("Electronics"));
        System.out.println(actualmes);
        String expectedmes = "Electronics";
        Assert.assertEquals(expectedmes, actualmes);
    }
    @Test
    /*3. userShouldNavigateToApparelPageSuccessfully
     *  click on the ‘Apparel’ Tab * Verify the text ‘Apparel’
     */
    public void userShouldNavigateToApparelPageSuccessfully (){
    clickOnElement(By.linkText("Apparel"));
    String actualmes = getTextFromElement(By.linkText("Apparel"));
    System.out.println(actualmes);
    String expectedmes = "Apparel";
    Assert.assertEquals(expectedmes, actualmes);
    }
    @Test
    /*4. userShouldNavigateToDigitalDownloadsPageSuccessfully
     * click on the ‘Digital downloads’ Tab * Verify the text ‘Digital downloads’
     */
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully () {
        clickOnElement(By.linkText("Digital downloads"));
        String actualmes = getTextFromElement(By.linkText("Digital downloads"));
        System.out.println(actualmes);
        String expectedmes = "Digital downloads";
        Assert.assertEquals(expectedmes, actualmes);
    }
    @Test
    /*5. userShouldNavigateToBooksPageSuccessfully
     * click on the ‘Books’ Tab * Verify the text ‘Books’
     */
    public void userShouldNavigateToBooksPageSuccessfully () {
        clickOnElement(By.linkText("Books"));
        String actualmes = getTextFromElement(By.linkText("Books"));
        System.out.println(actualmes);
        String expectedmes = "Books";
        Assert.assertEquals(expectedmes, actualmes);
    }
    @Test
    /*6. userShouldNavigateToJewelryPageSuccessfully
     * click on the ‘Jewelry’ Tab * Verify the text ‘Jewelry’
     */
    public void userShouldNavigateToJewelryPageSuccessfully () {
        clickOnElement(By.linkText("Jewelry"));
        String actualmes = getTextFromElement(By.linkText("Jewelry"));
        System.out.println(actualmes);
        String expectedmes = "Jewelry";
        Assert.assertEquals(expectedmes, actualmes);
    }
    @Test
    /*7. userShouldNavigateToGiftCardsPageSuccessfully
     * click on the ‘Gift Cards’ Tab
     * Verify the text ‘Gift Cards’
     */
    public void userShouldNavigateToGiftCardsPageSuccessfully () {
        clickOnElement(By.linkText("Gift Cards"));
        String actualmes = getTextFromElement(By.linkText("Gift Cards"));
        System.out.println(actualmes);
        String expectedmes = "Gift Cards";
        Assert.assertEquals(expectedmes, actualmes);
    }


    @After
    public void teardown (){
     //   closeBrowser();
    }
}
