package edu.nvcc.csc.kanchanawanchai;

public class Book {
	private String title;
	private String author;
	private int numberOfPages;
	public Book(String title, String author, int numberOfPages) {
		super();
		this.title = title;
		this.author = author;
		this.numberOfPages = numberOfPages;
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
	public int getNumberOfPages() {
		return numberOfPages;
	}
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author
				+ ", numberOfPages=" + numberOfPages + "]";
	}
}
