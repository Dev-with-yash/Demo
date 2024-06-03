package com.example.onetomany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.onetomany.dao.AuthorDao;

import com.example.onetomany.model.Author;
import com.example.onetomany.model.Book;

@SpringBootApplication
public class OnetomanyApplication implements CommandLineRunner {
    
	@Autowired
	AuthorDao authorDao;
	public OnetomanyApplication() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		SpringApplication.run(OnetomanyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		Author author = new Author();
		
		
		author.setAuthorid(1001);
		author.setAuthorname("J.K. Rowling");
		

        Book book1 = new Book();
        book1.setBookId(101);
        book1.setBookname("Harry Potter and the Sorcerer's Stone");

        Book book2 = new Book();
        book2.setBookId(102);
        book2.setBookname("Harry Potter and the Chamber of Secrets");

		
        book1.setAuthor(author);
        book2.setAuthor(author);

        authorDao.save(author);
  
		System.out.println("one to many");
		
		
	}

}
