package com.php.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
WebDriver driver;
	
	public HomePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Add/Remove Elements
	@FindBy(how = How.LINK_TEXT, using = "Add/Remove Elements")
	@CacheLookup
	public WebElement addRemove;
	
	//Add/Remove element click
	public void addRemoveClick(){
		addRemove.click();
	}
	
	//Checkboxes
	@FindBy(how = How.LINK_TEXT, using = "Checkboxes")
	@CacheLookup
	public WebElement checkboxes;
	
	//Drag And Drop
	@FindBy(how = How.LINK_TEXT, using = "Drag and Drop")
	@CacheLookup
	public WebElement dragAndDrop;
	
	//Dropdown
	@FindBy(how = How.LINK_TEXT, using = "Dropdown")
	@CacheLookup
	public WebElement dropDown;
	
	//Dynamic content
	@FindBy(how = How.LINK_TEXT, using = "Dynamic Content")
	@CacheLookup
	public WebElement dynamicContent;
	
	//Frames
	@FindBy(how = How.LINK_TEXT, using = "Frames")
	@CacheLookup
	public WebElement frames;
	
	//Horizontal Slider
	@FindBy(how = How.LINK_TEXT, using = "Horizontal Slider")
	@CacheLookup
	public WebElement horizontalSlider;
	
	//Hovers
	@FindBy(how = How.LINK_TEXT, using = "Hovers")
	@CacheLookup
	public WebElement hovers;
	
	//Infinite Scroll
	@FindBy(how = How.LINK_TEXT, using = "Infinite Scroll")
	@CacheLookup
	public WebElement infiniteScroll;
	
	//Inputs
	@FindBy(how = How.LINK_TEXT, using = "Inputs")
	@CacheLookup
	public WebElement inputs;
	
	//JQuery UI menus
	@FindBy(how = How.LINK_TEXT, using = "JQuery UI Menus")
	@CacheLookup
	public WebElement jQueryUiMenu;
	
	//JavaScript Alerts
	@FindBy(how = How.LINK_TEXT, using = "JavaScript Alerts")
	@CacheLookup
	public WebElement javaScriptAlerts;
	
	//Key Presses
	@FindBy(how = How.LINK_TEXT, using = "Key Presses")
	@CacheLookup
	public WebElement keyPresses;
	
	//Multiple Windows
	@FindBy(how = How.LINK_TEXT, using = "Multiple Windows")
	@CacheLookup
	public WebElement multipleWindows;
	
	//Nested Frames
	@FindBy(how = How.LINK_TEXT, using = "Nested Frames")
	@CacheLookup
	public WebElement nestedFrames;
	
	//Shifting Content
	@FindBy(how = How.LINK_TEXT, using = "Shifting Content")
	@CacheLookup
	public WebElement shiftingContent;
	
	//Sortable Data Tables
	@FindBy(how = How.LINK_TEXT, using = "Sortable Data Tables")
	@CacheLookup
	public WebElement sortableDataTables;
	
	//Status Codes
	@FindBy(how = How.LINK_TEXT, using = "Status Codes")
	@CacheLookup
	public WebElement statusCodes;
	
	//WYSIWYG Editor
	@FindBy(how = How.LINK_TEXT, using = "WYSIWYG Editor")
	@CacheLookup
	public WebElement wysiwygEditor;
	
	public void wait(int milliseconds){
		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


}
