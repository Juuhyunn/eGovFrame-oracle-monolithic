package shop.jarviis.oracle.mappers;

import java.util.List;

import org.springframework.stereotype.Repository;

import shop.jarviis.oracle.publisher.domain.PublisherDTO;

@Repository
public interface PublisherMapper {
	public List<PublisherDTO> findAll();
	public PublisherDTO findById(int pubId);
	public List<PublisherDTO> findByPubName(String pubName);
	public List<PublisherDTO> findByMgrName(String mgrName);
	public List<PublisherDTO> findByPhone(String phone);
	public void save(PublisherDTO publisherDTO);
}
