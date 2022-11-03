package com.example.LapTrinhWeb_BTL1.book;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements IBookService {
	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private BookConverter bookConverter;
	
	@Override
	public BookDTO save(BookDTO bookDTO) {
		BookEntity bookEntity = bookConverter.toEntity(bookDTO);
		bookEntity =bookRepository.save(bookEntity);
		return bookConverter.toDTO(bookEntity);
	}

	@Override
	public BookDTO update(BookDTO bookDTO) {
		BookEntity oldBook = bookRepository.findById(bookDTO.getId()).get();
		BookEntity bookEntity = bookConverter.toEntity(bookDTO, oldBook);
		bookEntity =bookRepository.save(bookEntity);
		return bookConverter.toDTO(bookEntity);
	}

	@Override
	public void delete(Integer id) {
		bookRepository.deleteById(id);
		
	}

	@Override
	public List<BookDTO> getAllBooks() {
		// TODO Auto-generated method stub
		List<BookEntity> listEntities = bookRepository.findAll();
		List<BookDTO> liDtos = new ArrayList<>();
		for (BookEntity bookEntity : listEntities) {
			
			liDtos.add(bookConverter.toDTO(bookEntity));
		}
		return liDtos;
	}

	@Override
	public BookDTO getBookById(Integer id) {
		BookEntity bookEntity = bookRepository.findById(id).get();
		return bookConverter.toDTO(bookEntity);
	}
}
