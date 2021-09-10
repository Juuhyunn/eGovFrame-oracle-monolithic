package shop.jarviis.oracle.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import shop.jarviis.oracle.book.domain.BookDTO;
import shop.jarviis.oracle.book.service.BookService;

@Controller
public class BookController {
	@Autowired BookService bookService;
	@RequestMapping("/books")	
	public void findAll() {
		List<BookDTO> list = bookService.findAll();
		for (BookDTO b : list) {
			System.out.println(b.toString());
			
		}
	}
	@RequestMapping("/books/bookId/{bookId}")
	public void findById(@PathVariable int bookId) {
		BookDTO bookDTO = bookService.findById(bookId);
		System.out.println(bookDTO.toString());
	}
	@RequestMapping("/books/pubId/{pubId}")
	public void findByPubId(@PathVariable int pubId) {
		List<BookDTO> list = bookService.findByPubId(pubId);
		for (BookDTO b : list) {
			System.out.println(b.toString());
		}
	}
	@RequestMapping("/books/bookTitle/{bookTitle}")
	public void findByBookTitle(@PathVariable String bookTitle) {
		List<BookDTO> list = bookService.findByBookTitle(bookTitle);
		for (BookDTO b : list) {
			System.out.println(b.toString());
		}
	}
	@RequestMapping("/books/price/{price}")
	public void findByPrice(@PathVariable int price) {
		List<BookDTO> list = bookService.findByPrice(price);
		for(BookDTO b : list) {
			System.out.println(b.toString());
		}
	}

}
