package shop.jarviis.oracle.book.service;

import java.util.List;

import org.springframework.stereotype.Component;

import shop.jarviis.oracle.book.domain.BookDTO;

@Component
public interface BookService {
	public List<BookDTO> findAll();
	public BookDTO findById(int bookId);

}
