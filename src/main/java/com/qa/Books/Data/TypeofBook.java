package com.qa.Books.Data;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="books")
public class TypeofBook {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String NameOfBook;
	private String FictionOrNonFiction;
	private String Author;
	private String Genre;
	private String YearOfPublication;

	
	
	public TypeofBook(Integer id, String Name0fBook, String FictionOrNonFiction, String Author, String Genre, String YearOfPublication) {
		

		super();
		this.id = id;
		this.NameOfBook = Name0fBook;
		this.FictionOrNonFiction = FictionOrNonFiction;
		this.Author = Author;
		this.Genre = Genre;
		this.YearOfPublication = YearOfPublication;
		
}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName0fBook() {
		return NameOfBook;
	}


	public void setName0fBook(String Name0fBook) {
		this.NameOfBook = Name0fBook;
	}


	public String getFictionOrNonFiction() {
		return FictionOrNonFiction;
	}


	public void setFictionOrNonFiction(String FictionOrNonFiction) {
		this.FictionOrNonFiction = FictionOrNonFiction;
	}


	public String getAuthor() {
		return Author;
	}


	public void setAuthor(String Author) {
		this.Author = Author;
	}


	public String getGenre() {
		return Genre;
	}


	public void setGenre(String Genre) {
		this.Genre = Genre;
	}


	public String getYearOfPublication() {
		return YearOfPublication;
	}


	public void setYearOfPublication(String yearOfPublication) {
		YearOfPublication = yearOfPublication;
	
	}


		
	}

	