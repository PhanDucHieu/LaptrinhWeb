package com.example.LapTrinhWeb_BTL1.book;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
public class BookController {

	@Autowired
	private IBookService bookService;

	@GetMapping("/listBooks")
	public String getAllBooks(Model model) {
		System.out.println("GET ALL BOOKS");
		List<BookDTO> books = bookService.getAllBooks();
		model.addAttribute("books", books);
		return "books";
	}

	@GetMapping("/book/{id}")
	public String getBookById(Model model, @PathVariable String id) {
		if(id.equals("add")) {
			System.out.println("GET ADD BOOK PAGE 2");
			BookDTO book = new BookDTO();
			model.addAttribute("book", book);
			return "bookForm";
		}
		
		System.out.println("GET BOOK BY ID");
		model.addAttribute("id", id);
		BookDTO book = bookService.getBookById(Integer.valueOf(id));
		model.addAttribute("book", book);
		return "bookForm";
	}

	@GetMapping("/addBook")
	public String pageAddBook(Model model) {
		System.out.println("GET ADD BOOK PAGE 1 ");
		return "redirect:/book/add";

	}

	@PostMapping("/book/{id}")
	public String addBook(@ModelAttribute BookDTO book, Model model, @PathVariable String id) {
		System.out.println("ADD BOOK");
		
		//Validate field empty
		if(Objects.equals(book.getTitle(), "") || Objects.equals(book.getAuthor(), "")
				|| Objects.equals(book.getReleaseDate(), "")) {
			System.out.println("HAVE ERRORS");
			model.addAttribute("book", book);
			model.addAttribute("messageTitle",Objects.equals(book.getTitle().trim(),"") ? "This field cannot be empty" : null );
			model.addAttribute("messageAuthor",Objects.equals(book.getAuthor().trim(),"") ? "This field cannot be empty" : null );
			model.addAttribute("messageReleaseDate",Objects.equals(book.getReleaseDate().trim(),"") ? "This field cannot be empty" : null );
			return "bookForm";
		} else {
			book.setTitle(book.getTitle().trim());
			book.setAuthor(book.getAuthor().trim());
			book.setReleaseDate(book.getReleaseDate().trim());
		}
		
		id = "add";
		model.addAttribute("id", id);
		bookService.save(book);
		return "redirect:/listBooks";
	}
	
	@PutMapping("/book/{id}")
	public String updateBook(@ModelAttribute BookDTO book, Model model, @PathVariable String id) {
		System.out.println("UPDATE BOOK");
		book.setId(Integer.valueOf(id));
		bookService.update(book);
		return "redirect:/listBooks";
	}

	@GetMapping("delete/{id}")
	public String delete(@PathVariable Integer id) {
		System.out.println("DELETE BOOK");
		bookService.delete(id);
		return "redirect:/listBooks";
	}

}
