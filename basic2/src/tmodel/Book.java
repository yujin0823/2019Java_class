package tmodel;

public class Book {
	private String title;
	private String author;
	private int number;
	private String pubDate;
	private String description;
	
	public Book() {
		this.title = "����";
		this.author = "������";
		this.number = 14619;
		this.pubDate = "2019-05-07";
		this.description = "�� ����ʹ�.. ���ڽ÷� 5��7��ȭ���� 7��41���� ����";
	}
	
	public Book(String title, String author, 
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