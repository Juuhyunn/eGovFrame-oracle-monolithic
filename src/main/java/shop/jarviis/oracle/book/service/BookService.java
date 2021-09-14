package shop.jarviis.oracle.book.service;


import org.springframework.stereotype.Component;

import shop.jarviis.oracle.book.domain.BookDTO;
import shop.jarviis.oracle.common.GenericInterface;

@Component
public interface BookService extends GenericInterface<BookDTO, Integer>{

}
