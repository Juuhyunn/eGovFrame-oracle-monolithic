package shop.jarviis.oracle.book.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import shop.jarviis.oracle.book.model.BookDTO;
import shop.jarviis.oracle.book.model.BookService;

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
	@RequestMapping(value="/list", method=RequestMethod.POST)
	public void findAll() {
		this.forPrint(bookService.findAll());
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
	@RequestMapping("/detail/bookId")
	public void findById(@RequestParam int bookId) {		
		System.out.println(bookService.findById(bookId).toString());
	}
	@RequestMapping("/detail/bookTitle")
	public void findByCustName(@RequestParam String bookTitle) {
		this.forPrint(bookService.findByBookTitle(bookTitle));
	}
	@RequestMapping("/detail/price")
	public void findByAddress(@RequestParam int price) {	
		this.forPrint(bookService.findByPrice(price));
	}
	@RequestMapping("/detail/pubId")
	public void findByPhone(@RequestParam int pubId) {
		this.forPrint(bookService.findByPubId(pubId));
	}
	public void forPrint(List<BookDTO> list) {
		System.out.println("*****Select Complete : ");
		for(BookDTO b : list) {
			System.out.println(b.toString());
		}
	}
	
}
