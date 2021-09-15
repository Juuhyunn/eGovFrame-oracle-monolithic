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
	public void save(BookDTO t) {
		bookMapper.save(t);
	}

	@Override
	public BookDTO findById(Integer id) {
		return bookMapper.findById(id);
	}

	@Override
	public List<BookDTO> findAll() {
		return bookMapper.findAll();
	}

	@Override
	public void update(BookDTO t) {
		bookMapper.update(t);
		
	}

	@Override
	public void delete(Integer id) {
		bookMapper.delete(id);
	}

	@Override
	public List<BookDTO> findByBookTitle(String bookTitle) {
		return bookMapper.findByBookTitle(bookTitle);
	}

	@Override
	public List<BookDTO> findByPrice(int price) {
		return bookMapper.findByPrice(price);
	}

	@Override
	public List<BookDTO> findByPubId(int pubId) {
		return bookMapper.findByPubId(pubId);
	} 
	

}
