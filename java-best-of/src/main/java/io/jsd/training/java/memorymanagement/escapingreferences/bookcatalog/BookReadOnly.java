package io.jsd.training.java.memorymanagement.escapingreferences.bookcatalog;

public interface BookReadOnly {

	int getId();

	String getTitle();

	String getAuthor();

	String toString();

	Price getPrice();

}