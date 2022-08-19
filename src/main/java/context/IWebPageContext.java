package context;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import repository.PageElement;

public interface IWebPageContext {
	
	public WebElement getPageElement(String pageName,String elemName);
	
	public WebElement getPageElement(String pageName);
	
	public WebElement getElementLocator(String elemName);

	public List<WebElement> getPageElements(String pageName,String elemName);

	public WebElement getPageElementByTypeAndLocator(String type,String locator);

	public List<WebElement> getPageElementsByTypeAndLocator(String type,String locator);
	
	public boolean isPageElementPresent(String pageName,String name);

	//set context of page currently loaded
	public boolean setContextCurrentPage(String pageName);
	//set context of feature currently loaded
	public boolean setFeatureContext(String featureName);
	//method to get context of page currently loaded
	public boolean getContextCurrentPage(String pageName);

	//get handle of parent window
	public String getParentHandle();
	
	//set handle of parent window before opening child window
	public String setParentHandle(String parentHandle);

	//get all opened wiindow handles
	public Set<String> getWindowHandles();
	
	//fnc to reset window handle to present window
	public void navigateToCurrentWindow();
	
	//fnc to navigate to window by providind window handle
	public void navigateToWindowByHandle(String windowHandle);
	
	//navigate to any window other than one provided by window handle
	public void navigateToCurrentWindow(String winHandle);
	
	
	//navigate to latest opened windows ,list of previosuly cached windows
	public void navigateToWindowNotIn(List<String> windowHandles);

	//close window by its title
	public boolean closeWindowByTitle(String title);
	
	//fnc to navigate to window by providind window handle
	public void navigateToWindowByTitle(String title);
	
	//switch to frame using id/name
	public void switchToFrame(String frameName);
	
	//switch to frame using id/name
	public void switchToFrame(int frameId);
	
	//come out of frame and switch to default
	public void switchToDefaultContent();
	
	//ethod to accept alert and read its text
	public String switchToAlertAndGetText();

	//get Webdriver wait
	public WebDriverWait getWait();
	
	//get Webdriver shortwait
	public WebDriverWait getShortWait();
	
	//ethod to move mouse to particular webelement
	public void moveToWebElement(WebElement element);
	
	//perform mmouse click operation.used in conjuction with movetowebelement
	public void clickAction();
	
	//introduce delay
	public void delay(long delay);
	
	//ethod to refresh current web page
	public void refreshCurrentPage();
	
	//get the count of window handles opened
	public int getWindowHandleCount();
	
	//get handle of current window
	public String getWindowHandle();

	//ethod to fetch pagelement fro repo and not a webelemment
	public PageElement getElementFromRepository(String pageName,String locator);
	
	//get webelement based on pagename or elemname in OR
	public WebElement getPageElement(String pageName,String elemName,int eleTimeout);
	
	//set implicit wait timeout
	public void setImplicitWait(int time);
	
	//close current window
	public void closeCurrentWindow();
	
	//wait for current window/page to load
	public void waitForCurrentPageLoad();
	
	//method to replace all variables in string .variable name is identified with $ prefix
	public String replaceVariable(String varString);
	
	//ethod to scroll ay webelement into view
	public void scrollElementIntoView(WebElement elem);
	
	//save variable into VR at runtime
	public void saveVariable(String variableName,String variableValue);

	
	public void beforeScenario(Scenario s);
	
	public void afterScenario(Scenario s);
}

