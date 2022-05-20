package Steps;

import Base.BaseUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class AddShoppingItem extends BaseUtil {

    private BaseUtil base; //Create base util object

    @Given("Navigate to the Amazon website")
    public void Navigate_To_The_Website() {
        base.driver.get("https://www.amazon.com.tr"); //Open amazon web site on browser
    }

    @And("Search for product")
    public void Search_For_Product(){
        WebElement cookie=base.driver.findElement(By.cssSelector("#sp-cc-accept")); //Find Cookie accept element
        cookie.click();//Click cookie accept button
        WebElement searchBox=base.driver.findElement(By.cssSelector("#twotabsearchtextbox"));
        searchBox.click(); //Click search box area
        //Send Key to search box area
        searchBox.sendKeys("kendime düsünceler");
        base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Implicitly Wait
    }

    @And("Click search button")
    public void Click_Search_Button(){
        //Find search button element
        WebElement searchButton=base.driver.findElement(By.cssSelector("#nav-search-submit-button"));
        searchButton.click(); //Click Search button
        base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Implicitly Wait
    }

    @And("Select the first product from list")
    public void Select_The_First_Product_From_List() {
        //Find first product on list
        WebElement firstProduct=base.driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/" +
                "div[1]/span[3]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/h2[1]/a[1]/span[1]"));
        firstProduct.click(); //Click first product on list
        base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Implicitly Wait
    }

    @When("Add product to the cart")
    public void Add_Product_To_The_Cart() {
        //Find add cart button
        WebElement addCartButton=base.driver.findElement(By.cssSelector("#add-to-cart-button"));
        addCartButton.click(); //Click add to Cart button
        base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Implicitly Wait
    }

    @Then("Control that the product has been successfully added to cart")
    public void The_Product_Successfully_Added_To_Cart() {
        Assert.assertEquals(base.driver.findElement(By.cssSelector(".a-size-medium-plus.a-color-base" +
                ".sw-atc-text.a-text-bold")).getText(),"Sepete Eklendi"); // Check Product added to cart or not with expected message
        base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Implicitly Wait

    }

    @Then("Return to cart")
    public void Return_To_Cart(){
        base.driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); // Implicitly Wait
        //Find return cart button
        WebElement returnCart=base.driver.findElement(By.cssSelector("a[class='a-button-text']"));
        returnCart.click(); // Click return cart button
        base.driver.quit(); //quit driver
    }

}
