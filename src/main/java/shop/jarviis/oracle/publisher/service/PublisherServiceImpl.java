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
	public List<PublisherDTO> findAll() {
		// TODO Auto-generated method stub
		return publisherMapper.findAll();
	}

	@Override
	public PublisherDTO findById(int pubId) {
		// TODO Auto-generated method stub
		return publisherMapper.findById(pubId);
	}

	@Override
	public List<PublisherDTO> findByPubName(String pubName) {
		// TODO Auto-generated method stub
		return publisherMapper.findByPubName(pubName);
	}

	@Override
	public List<PublisherDTO> findByMgrName(String mgrName) {
		// TODO Auto-generated method stub
		return publisherMapper.findByMgrName(mgrName);
	}

	@Override
	public List<PublisherDTO> findByPhone(String phone) {
		// TODO Auto-generated method stub
		return publisherMapper.findByPhone(phone);
	}

}
