package repository;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="uiObject")
public class PageElement {
	
	
	private String elementName;
	private String locatorType;
	private String locator;
	
	@XmlAttribute(name="name")
	public String getElementName() {
		return elementName;
	}
	public void setElementName(String elementName) {
		this.elementName = elementName;
	}
	
	@XmlAttribute(name="type")
	public String getLocatorType() {
		return locatorType;
	}
	public void setLocatorType(String locatorType) {
		this.locatorType = locatorType;
	}
	
	@XmlElement(name="locator")
	public String getLocator() {
		return locator;
	}
	public void setLocator(String locator) {
		this.locator = locator;
	}
	@Override
	public String toString() {
		return "PageElement [elementName=" + elementName + ", locatorType=" + locatorType + ", locator=" + locator
				+ "]";
	}
	
	
	

}
