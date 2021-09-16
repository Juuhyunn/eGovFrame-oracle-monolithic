package shop.jarviis.oracle.mappers;


import java.util.List;

import org.springframework.stereotype.Repository;

import shop.jarviis.oracle.book.model.BookDTO;
import shop.jarviis.oracle.common.GenericInterface;

@Repository
public interface BookMapper extends GenericInterface<BookDTO, Integer>{
	List<BookDTO> findByBookTitle(String bookTitle);
	List<BookDTO> findByPrice(int price);
	List<BookDTO> findByPubId(int pubId);
	
}
