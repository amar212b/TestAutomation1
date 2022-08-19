package repository;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="uiElements")
public class WebPageElement {
	
	private List<PageElement> webElements;
	
	@XmlElement(name="uiobject")
	public List<PageElement> getWebElements(){
		return webElements;
	}
	
	public void setWebElements(List<PageElement> webElements) {
		this.webElements=webElements;
	}

	@Override
	public String toString() {
		return "WebPageElement [webElements=" + webElements + "]";
	}

	

}
