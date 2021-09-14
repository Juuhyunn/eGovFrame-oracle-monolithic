package shop.jarviis.oracle.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import shop.jarviis.oracle.book.domain.BookDTO;
import shop.jarviis.oracle.book.service.BookService;

@Controller
@RequestMapping("/books")
public class BookController{
	@Autowired BookService bookService;
	@Autowired BookDTO bookDTO;
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public void save(BookDTO t) {
		bookService.save(t);
		System.out.println("*****Save Complete : " + t.toString());
	}
	@RequestMapping(value="/detail")
	public void findById(@RequestParam Integer bookId) {
		System.out.println("*****USER");
		System.out.println(bookService.findById(bookId).toString());
	}
	@RequestMapping(value="/list", method=RequestMethod.POST)
	public void findAll() {
		List<BookDTO> list = bookService.findAll();
		System.out.println("*****LIST");
		for(BookDTO b : list) {
			System.out.println(b.toString());
		}
	}
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public void update(BookDTO t) {
		bookService.update(t);
		System.out.println("*****Update Complete : " + t.toString());
		
	}
	@RequestMapping(value="/delete")
	public void delete(@RequestParam Integer bookId) {
		bookService.delete(bookId);
		System.out.println("*****Delete Complete : " + bookId);	
	}
	
}
