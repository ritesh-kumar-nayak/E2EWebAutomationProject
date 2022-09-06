package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//rahulonlinetutor@gmail.com
public class LandingPage {

	public WebDriver driver;

	@FindBy(css = "a[href*='sign_in']")
	 private WebElement signin;

	// By title=By.cssSelector();
	@FindBy(css = ".text-center>h2")
	private WebElement title;

	// By NavBar=By.cssSelector();
	@FindBy(css = ".nav.navbar-nav.navbar-right>li>a")
	private WebElement NavBar;

	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub

		this.driver = driver;

	}

	public WebElement getSignin() {
		return signin;
	}

	public LoginPage getLogin() {
		getSignin().click();
		LoginPage lp = new LoginPage(driver);
		return lp;

	}

	public WebElement getNavigationBar() {
		return NavBar;
	}

	public WebElement getTitle() {
		return title;
	}

}
