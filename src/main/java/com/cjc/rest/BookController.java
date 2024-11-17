package com.cjc.rest;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.Book;
import com.cjc.service.BookService;

@RestController
public class BookController {

	private BookService service;

	public BookController(BookService service) {
		super();
		this.service = service;
	}
	
	@PostMapping(value = "/addBook")
	public Book addBook(@RequestBody Book book)
	{
		Book bk=service.saveBook(book);
		return bk;	
	}
	
	@GetMapping(value = "/getAllBooks")
	public List<Book> getAllBook()
	{
		List<Book>bList=service.getAllBook();
		return bList;
	}
	
	@GetMapping(value = "/getBook/{id}")
	public Book getBook(@PathVariable int id)
	{
		Book book=service.getBook(id);
		return book;
	}
	
	@DeleteMapping(value = "/deleteBook/{id}")
	public List<Book>deleteBook(@PathVariable int id)
	{
		List<Book> blist=service.deleteBook(id);
		return blist;
	}
	
	@PutMapping(value = "/updateBook")
	public Book updateBook(@RequestBody Book book)
	{
		Book bk=service.saveBook(book);
		return bk;
	}
}
	
