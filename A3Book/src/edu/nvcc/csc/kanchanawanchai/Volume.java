package edu.nvcc.csc.kanchanawanchai;
import java.util.Arrays;


public class Volume {
	private Book book[];
	private int numberOfBooks;
	private String volumeName;
	
	public Volume(Book book[], int numberOfBooks, String volumeName) {
		this.book = book;
		this.numberOfBooks = numberOfBooks;
		this.volumeName = volumeName;
	}
	
	public String getBookArray() {
		String bookList="";
		for(Book b:book) {
			bookList += b +"\n";
		}
		return bookList;
	}
	
	@Override
	public String toString() {
		return "Volume [book=" + Arrays.toString(book) + ", numberOfBooks="
				+ numberOfBooks + ", volumeName=" + volumeName + "]";
	}
	
	
}
