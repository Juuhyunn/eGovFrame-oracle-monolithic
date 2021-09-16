package shop.jarviis.oracle.book.model;


import java.util.List;

import org.springframework.stereotype.Component;

import shop.jarviis.oracle.common.GenericInterface;

@Component
public interface BookService extends GenericInterface<BookDTO, Integer>{

	List<BookDTO> findByBookTitle(String bookTitle);
	List<BookDTO> findByPrice(int price);
	List<BookDTO> findByPubId(int pubId);

}
