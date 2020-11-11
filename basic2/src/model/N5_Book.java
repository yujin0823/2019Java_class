package model;

public class N5_Book {
	//책이름, 저자, 도서번호(숫자), 출판일(날짜), 설명(간단한 책소개) 
	private String title;
	private String author;
	private int number;
	private String pubDate;
	private String description;
	
	public N5_Book() {
		this.title = "기능반이란 무엇인가?";
		this.author = "최곤달";
		this.number = 12345;
		this.pubDate = "2019-05-05";
		this.description = "어린이날 쉬지 못하는 어른이의 아픔..";
	}
	
	public N5_Book(String title, String author, 
			int number, String pubDate, String description) {
		this.title = title;
		this.author = author;
		this.number = number;
		this.pubDate = pubDate;
		this.description = description;
	}

	
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", number=" + number + ", pubDate=" + pubDate
				+ ", description=" + description + "]";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getPubDate() {
		return pubDate;
	}

	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
