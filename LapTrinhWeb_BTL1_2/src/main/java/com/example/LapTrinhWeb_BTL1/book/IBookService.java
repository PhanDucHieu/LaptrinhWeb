package com.example.LapTrinhWeb_BTL1.book;

import java.util.List;

public interface IBookService {
	BookDTO save(BookDTO bookDTO);
	BookDTO update(BookDTO bookDTO);
	void delete(Integer id);
	List<BookDTO> getAllBooks();
	BookDTO getBookById(Integer id);
}
