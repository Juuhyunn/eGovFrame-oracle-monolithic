package shop.jarviis.oracle.mappers;


import org.springframework.stereotype.Repository;

import shop.jarviis.oracle.common.GenericInterface;
import shop.jarviis.oracle.publisher.domain.PublisherDTO;

@Repository
public interface PublisherMapper extends GenericInterface<PublisherDTO, Integer>{
}
