package com.cjc.service;

import java.util.List;

import com.cjc.model.Book;

public interface BookService {

	Book saveBook(Book book);

	List<Book> getAllBook();

	Book getBook(int id);

	List<Book> deleteBook(int id);

}
