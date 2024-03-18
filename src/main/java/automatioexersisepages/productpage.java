package automatioexersisepages;

import javax.swing.Action;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productpage {

	
	@FindBy(xpath="//div[@class='features_items']/div[2]")private WebElement proiducts;
	@FindBy(xpath="//div[@class='features_items']/div")private WebElement productlistvisible;
	@FindBy(xpath="//a[@href='/product_details/1']")private WebElement viewproduct;
	@FindBy(xpath="//h2[text()='Blue Top']")private WebElement productname;
	@FindBy(xpath="//p[text()='Category: Women > Tops']")private WebElement category;
	@FindBy(partialLinkText="Rs")private WebElement price;
	@FindBy(xpath="//b[text()='Availability:']")private WebElement availability;
	@FindBy(xpath="//b[text()='Condition:']")private WebElement condition;
	@FindBy(xpath="//b[text()='Brand:']")private WebElement brand;
	@FindBy(xpath="//a[@data-product-id='1']")private WebElement firstproduct;
	@FindBy(xpath="//div[@class='col-sm-9 padding-right']//div[2]//div[1]//div[1]//div[2]//div[1]//a[1]")private WebElement addtocartbtn;
	@FindBy(xpath="//a[@href='/view_cart']/u")private WebElement viewcart;
	@FindBy(xpath="//button[@class='btn btn-success close-modal btn-block']")private WebElement continueshoppingbtn;
	@FindBy(xpath="//input[@name='quantity']")private WebElement productquentity;
	@FindBy(xpath="//u[normalize-space()='Register / Login']")private WebElement continueshopping;
	@FindBy(xpath="//button[@class='btn btn-default cart']")private WebElement productviewaddtocart;
	@FindBy(xpath="//a[text()='Proceed To Checkout']")private WebElement proceedtocheckout;
	@FindBy(xpath="//button[@class='btn btn-default cart']")private WebElement addtocartwithoutlogin;
	@FindBy(xpath="//button[text()='Continue Shopping']")private WebElement contiueshoppingwithoutlogin;

	
	

	

	
	public productpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void verifyproductpageproductlist() {
				System.out.println(productlistvisible.getSize());
				viewproduct.click();
				
	}
	
	public void verifyproductnameavailabilitycondition() {
		
		boolean productnametext = productname.isDisplayed();
		System.out.println("productname is displayed= " +productnametext);
		
		boolean categorytext = category.isDisplayed();
		System.out.println("category text is visible= " +categorytext);
		
//		boolean pricetext = price.isDisplayed();
//		System.out.println("price text is visible= " +pricetext);
		
		boolean availabilitytext = availability.isDisplayed();
		System.out.println("Availability text is visible= " +availabilitytext);
		
		boolean conditiontext = condition.isDisplayed();
		System.out.println("condition text text is visible= " +conditiontext);
		
		boolean brandtext = brand.isDisplayed();
		System.out.println("brand text is visible= " +brandtext);
	}
	
	public void clickaddcartbtn() {
		addtocartbtn.click();	
	}
	public void clickcontinuebtn() {
		continueshoppingbtn.click();
	}
	
	public void clickviewcartbtn() {
		viewcart.click();

	}
	
	public void setproductpageproductquantity() {
		productquentity.clear();
		productquentity.sendKeys("4");
	}
	
	public void clickcontinueshopping() {
		continueshopping.click();
	}
	
	public void addtocardproductview() {
		productviewaddtocart.click();
	}
	
	public void clickproceedtocheckout() {
		proceedtocheckout.click();
	}
	public void addtocartwithoutlogin() {
		addtocartwithoutlogin.click();
		contiueshoppingwithoutlogin.click();
	}
	
}

