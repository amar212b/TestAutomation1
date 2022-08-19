package repository;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="page")
public class WebPage {
	
	private WebPageElement webPageElement;
	
	private String pageName;
	
	@XmlAttribute(name="name")
	public String getPageName(){
		return pageName;
	}
	
	@XmlElement(name="uiElements")
	public WebPageElement getWebPageElement(){
		return webPageElement;
	}
	
	public void setWebPageElement(WebPageElement webPageElement) {
		this.webPageElement=webPageElement;
	}

	public void setPageName(String pageName) {
		this.pageName=pageName;
	}

	@Override
	public String toString() {
		return "WebPage [webPageElement=" + webPageElement + ", pageName=" + pageName + "]";
	}

	
	

}
