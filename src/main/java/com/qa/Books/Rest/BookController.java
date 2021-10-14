package com.qa.Books.Rest;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.Books.Data.TypeofBook;
import com.qa.Books.Service.BookService;


@RestController
public class BookController {

	private BookService service;

	public BookController(BookService service) {
		super();
		this.service = service;
	}
	@PostMapping("/create")
	public TypeofBook create(@RequestBody TypeofBook newBook) {
		return this.service.create(newBook);
	}
	@GetMapping("/get/{id}")
	public TypeofBook getById(@PathVariable Integer id) {
		return this.service.getById(id);
	}
	@GetMapping("/")
	public List<TypeofBook> getAll() {
		return this.service.getAll();
	}
	@GetMapping("/getByName/{NameOfBook}")
	public TypeofBook getByName(@PathVariable String NameOfBook) {
		return this.service.getByNameOfBook(NameOfBook);
	}
	@GetMapping("/getbyAuthor/{Author}")
	public List<TypeofBook> getByAuthor(@PathVariable String Author){
		return this.service.getByAuthor(Author);
		
	}
	@GetMapping("/getbyGenre/{Genre}")
	public List<TypeofBook> getByGenre(@PathVariable String Genre){
		return this.service.getbyGenre(Genre);
	}
	
	@PutMapping("/update/{id}")
	public TypeofBook updateBook(Integer id, TypeofBook newBook) {
		return this.service.updateBook(id, newBook);

	}
	@DeleteMapping("/remove/{id}")
	public boolean removeBook(@PathVariable Integer id) {
		return this.service.removeBook(id);
	}
	}
	