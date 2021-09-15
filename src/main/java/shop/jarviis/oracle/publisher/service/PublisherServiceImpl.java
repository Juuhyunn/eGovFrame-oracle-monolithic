package shop.jarviis.oracle.publisher.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.jarviis.oracle.mappers.PublisherMapper;
import shop.jarviis.oracle.publisher.domain.PublisherDTO;

@Service
public class PublisherServiceImpl implements PublisherService{
	@Autowired PublisherMapper publisherMapper;

	@Override
	public void save(PublisherDTO t) {
		publisherMapper.save(t);
	}

	@Override
	public PublisherDTO findById(Integer id) {
		return publisherMapper.findById(id);
	}

	@Override
	public List<PublisherDTO> findAll() {
		return publisherMapper.findAll();
	}

	@Override
	public void update(PublisherDTO t) {
		publisherMapper.update(t);
	}

	@Override
	public void delete(Integer id) {
		publisherMapper.delete(id);
	}

	@Override
	public List<PublisherDTO> findByPubName(String pubName) {
		return publisherMapper.findByPubName(pubName);
	}

	@Override
	public List<PublisherDTO> findByMgrName(String mgrName) {
		return publisherMapper.findByMgrName(mgrName);
	}

	@Override
	public List<PublisherDTO> findByPhone(String phone) {
		return publisherMapper.findByPhone(phone);
	}

}
