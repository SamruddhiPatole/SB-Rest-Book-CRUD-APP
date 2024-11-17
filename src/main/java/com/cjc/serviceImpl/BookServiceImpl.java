package com.cjc.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cjc.model.Book;
import com.cjc.repository.BookRepository;
import com.cjc.service.BookService;
@Service
public class BookServiceImpl implements BookService{

	private BookRepository repository;

	public BookServiceImpl(BookRepository repository) {
		super();
		this.repository = repository;
	}
	@Override
	public Book saveBook(Book book) {
		repository.save(book);
		return book;
	}
	@Override
	public List<Book> getAllBook() {
		List<Book> list = repository.findAll();
		return list;
	}
	@Override
	public Book getBook(int id) {
		Optional<Book> optional = repository.findById(id);
		if(optional.isPresent())
		{
			return optional.get();
		}
		return null;
	}
	@Override
	public List<Book> deleteBook(int id) {
		repository.deleteById(id);
		return getAllBook();
	}
}
