package com.qa.Books.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.qa.Books.Data.TypeofBook;
import com.qa.Books.Exceptions.BookNotFoundException;
import com.qa.Books.Repo.BookRepo;


@Service
public class BookService<FictionorNonFiction> {

private BookRepo repo;

public BookService(BookRepo repo) {
	super();
	this.repo = repo;
}

public TypeofBook create (TypeofBook newBook) {
	return this.repo.save(newBook);
}

public TypeofBook getById(Integer id) {
	return this.repo.findById(id).orElseThrow(BookNotFoundException::new);
}
public List<TypeofBook> getAll() {
	return this.repo.findAll();
}
public TypeofBook getByNameOfBook(String NameOfBook) {
	return this.repo.findByNameOfBook(NameOfBook);
	
}
public List<TypeofBook> getFictionOrNonFiction(String FictionOrNonFiction){
	return this.repo.findByFictionOrNonFiction(FictionOrNonFiction);
	
}
	
public List<TypeofBook> getByAuthor(String Author){
	return this.repo.findByAuthor(Author);
		
}

public List<TypeofBook> getbyGenre(String Genre){
	return this.repo.findByGenre(Genre);
	
}
public List<TypeofBook> getByYearOfPublication(String YearOfPublication){
	return this.repo.findByYearOfPublication(YearOfPublication);
}

public TypeofBook updateBook(Integer id, TypeofBook newBook) {
	TypeofBook updatedBook = this.repo.findById(id).orElseThrow(BookNotFoundException::new);
	updatedBook.setName0fBook(newBook.getName0fBook());
	updatedBook.setFictionOrNonFiction(newBook.getFictionOrNonFiction());
	updatedBook.setAuthor(newBook.getAuthor());
	updatedBook.setGenre(newBook.getGenre());
	updatedBook.setYearOfPublication(newBook.getYearOfPublication());
	return this.repo.save(updatedBook);
}

public boolean removeBook(Integer id) {
	this.repo.deleteById(id);
	return !this.repo.existsById(id);
}

	
}

