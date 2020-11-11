package gondr;

import org.jsoup.nodes.Element;

public class ProjectNewsItem {
	private String title;
	private String link;
	private String description;
	private String pubDate;
	
	public void setDate(Element item) {
		//엘레멘트에서 값을 빼서 변수에 넣는다.
//		title = item.selectFirst("title").text();
//		link = item.selectFirst("link").text();
//		description = item.selectFirst("description").text();
//		pubDate = item.selectFirst("pubDate").text();
		
		Element titleElement = item.selectFirst("title");
		if(titleElement != null) {
			title = titleElement.text();
		}else {
			title = "";
		}
		
		Element linkElement = item.selectFirst("link");
		if(linkElement != null) {
			link = linkElement.text();
		}else {
			link = "";
		}
		
		Element desElement = item.selectFirst("description");
		if(desElement != null ) {
			description = desElement.text();
		}else {
			description = "";
		}
		
		Element pubElement = item.selectFirst("pubDate");
		if(pubElement != null) {
			pubDate = pubElement.text();
		}else {
			pubDate = "";
		}
	}
	
	public String getTagItem() {
		String tagItem = "<div class ='item'>";
		tagItem += "<a href='" + link + "'>";
		tagItem += title + "[" + pubDate + "] </a>";
		tagItem += "<p>" + description + "</p></div>";
		return tagItem;
	}
	

}
