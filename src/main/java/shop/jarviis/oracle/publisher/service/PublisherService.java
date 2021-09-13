package shop.jarviis.oracle.publisher.service;

import java.util.List;

import org.springframework.stereotype.Component;

import shop.jarviis.oracle.publisher.domain.PublisherDTO;

@Component
public interface PublisherService {
	public List<PublisherDTO> findAll();
	public PublisherDTO findById(int pubId);
	public List<PublisherDTO> findByPubName(String pubName);
	public List<PublisherDTO> findByMgrName(String mgrName);
	public List<PublisherDTO> findByPhone(String phone);
	public void save(PublisherDTO publisherDTO);
	

}
