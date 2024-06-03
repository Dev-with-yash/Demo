package com.example.onetomany.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import jakarta.persistence.OneToMany;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "author")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Author {
    @Id
    int authorid;
    private String authorname;
    private String bookname;
    
    @OneToMany(mappedBy = "author",cascade = CascadeType.ALL)
    private List<Book> books;
	  
}
