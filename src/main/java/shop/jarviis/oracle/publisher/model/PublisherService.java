package shop.jarviis.oracle.publisher.model;


import java.util.List;

import org.springframework.stereotype.Component;

import shop.jarviis.oracle.common.GenericInterface;

@Component
public interface PublisherService extends GenericInterface<PublisherDTO, Integer>{

	List<PublisherDTO> findByPubName(String pubName);
	List<PublisherDTO> findByMgrName(String mgrName);
	List<PublisherDTO> findByPhone(String phone);
}
