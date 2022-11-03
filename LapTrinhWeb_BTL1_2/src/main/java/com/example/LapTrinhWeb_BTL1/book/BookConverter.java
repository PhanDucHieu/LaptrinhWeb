package com.example.LapTrinhWeb_BTL1.book;

import org.springframework.stereotype.Component;

@Component
public class BookConverter {
	public BookDTO toDTO(BookEntity bookEntity) {
		BookDTO bookDTO = new BookDTO();
		if(bookEntity.getId() != null) {
			bookDTO.setId(bookEntity.getId());
		}
		bookDTO.setTitle(bookEntity.getTitle());
		bookDTO.setAuthor(bookEntity.getAuthor());
		bookDTO.setReleaseDate(bookEntity.getReleaseDate());
		bookDTO.setDescription(bookEntity.getDescription());
		bookDTO.setCategory(bookEntity.getCategory());
		bookDTO.setPage(bookEntity.getPage());
		bookDTO.setImage(bookEntity.getImage());
		
		return bookDTO;
	}
	
	public BookEntity toEntity(BookDTO bookDTO) {
		BookEntity bookEntity = new BookEntity();
		
		bookEntity.setTitle(bookDTO.getTitle());
		bookEntity.setAuthor(bookDTO.getAuthor());
		bookEntity.setReleaseDate(bookDTO.getReleaseDate());
		bookEntity.setDescription(bookDTO.getDescription());
		bookEntity.setCategory(bookDTO.getCategory());
		bookEntity.setPage(bookDTO.getPage());
		bookEntity.setImage(bookDTO.getImage());		
		
		return bookEntity;
	}
	
	public BookEntity toEntity(BookDTO bookDTO, BookEntity bookEntity) {
		
		bookEntity.setTitle(bookDTO.getTitle());
		bookEntity.setAuthor(bookDTO.getAuthor());
		bookEntity.setReleaseDate(bookDTO.getReleaseDate());
		bookEntity.setDescription(bookDTO.getDescription());
		bookEntity.setCategory(bookDTO.getCategory());
		bookEntity.setPage(bookDTO.getPage());
		bookEntity.setImage(bookDTO.getImage());		
		
		return bookEntity;
	}
}
