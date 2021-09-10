package shop.jarviis.oracle.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.jarviis.oracle.book.domain.BookDTO;
import shop.jarviis.oracle.mappers.BookMapper;

@Service
public class BookServiceImpl implements BookService{
	@Autowired BookMapper bookMapper; 
	@Override
	public List<BookDTO> findAll() {
		// TODO Auto-generated method stub
		return bookMapper.findAll();
	}
	@Override
	public BookDTO findById(int bookId) {
		// TODO Auto-generated method stub
		return bookMapper.findById(bookId);
	}

}
