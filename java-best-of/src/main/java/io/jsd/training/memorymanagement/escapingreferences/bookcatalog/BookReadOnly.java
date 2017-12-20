package io.jsd.training.memorymanagement.escapingreferences.bookcatalog;

public interface BookReadOnly {

	int getId();

	String getTitle();

	String getAuthor();

	String toString();

	Price getPrice();

}