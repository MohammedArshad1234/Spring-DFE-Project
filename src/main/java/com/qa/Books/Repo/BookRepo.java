package com.qa.Books.Repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.qa.Books.Data.TypeofBook;


@Repository
public interface BookRepo extends JpaRepository <TypeofBook, Integer>{

		public TypeofBook findByNameOfBook(String NameOfBook);
		public List<TypeofBook> findByFictionOrNonFiction(String FictionOrNonFiction);
		public List<TypeofBook> findByAuthor(String Author);
		public List<TypeofBook> findByGenre(String Genre);
		public List<TypeofBook> findByYearOfPublication(String YearOfPublication);
		
} 

