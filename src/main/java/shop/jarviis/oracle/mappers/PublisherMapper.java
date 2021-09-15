package shop.jarviis.oracle.mappers;


import java.util.List;

import org.springframework.stereotype.Repository;

import shop.jarviis.oracle.common.GenericInterface;
import shop.jarviis.oracle.publisher.domain.PublisherDTO;

@Repository
public interface PublisherMapper extends GenericInterface<PublisherDTO, Integer>{
	List<PublisherDTO> findByPubName(String pubName);
	List<PublisherDTO> findByMgrName(String mgrName);
	List<PublisherDTO> findByPhone(String phone);
}
