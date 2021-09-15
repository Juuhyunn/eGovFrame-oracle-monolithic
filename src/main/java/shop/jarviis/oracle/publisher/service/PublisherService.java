package shop.jarviis.oracle.publisher.service;


import java.util.List;

import org.springframework.stereotype.Component;

import shop.jarviis.oracle.common.GenericInterface;
import shop.jarviis.oracle.publisher.domain.PublisherDTO;

@Component
public interface PublisherService extends GenericInterface<PublisherDTO, Integer>{

	List<PublisherDTO> findByPubName(String pubName);
	List<PublisherDTO> findByMgrName(String mgrName);
	List<PublisherDTO> findByPhone(String phone);
}
