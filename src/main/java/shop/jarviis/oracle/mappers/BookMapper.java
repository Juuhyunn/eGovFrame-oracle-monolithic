package shop.jarviis.oracle.mappers;

import java.util.List;

import org.springframework.stereotype.Repository;

import shop.jarviis.oracle.book.domain.BookDTO;
import shop.jarviis.oracle.common.GenericInterface;

@Repository
public interface BookMapper extends GenericInterface<BookDTO, Integer>{
	
}
