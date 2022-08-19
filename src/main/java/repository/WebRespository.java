package repository;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="pages")
public class WebRespository {
	
	private List<WebPage> webPages;
	
	@XmlElement(name="page")
	public List<WebPage> getWebPages(){
		return webPages;
	}
	
	public void setWebPages(List<WebPage> webPages) {
		this.webPages=webPages;
	}

	@Override
	public String toString() {
		return "WebRespository [webPages=" + webPages + "]";
	}
	
	

}
