package shop.jarviis.oracle.publisher.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import shop.jarviis.oracle.publisher.domain.PublisherDTO;
import shop.jarviis.oracle.publisher.service.PublisherService;

@Controller
public class PublisherController {
	@Autowired PublisherService publisherService;
	@GetMapping("/pubs")
	public void findAll() {
		List<PublisherDTO> list = publisherService.findAll();
		for(PublisherDTO p : list) {
			System.out.println(p.toString());
		}
	}
	@GetMapping("/pubs/pubId/{pubId}")
	public void findById(@PathVariable int pubId) {
		PublisherDTO publisherDTO = publisherService.findById(pubId);
		System.out.println(publisherDTO.toString());
	}
	@GetMapping("/pubs/pubName/{pubName}")
	public void findByPubName(@PathVariable String pubName) {
		List<PublisherDTO> list = publisherService.findByPubName(pubName);
		for (PublisherDTO p : list) {
			System.out.println(p.toString());
		}
	}
	@GetMapping("/pubs/mgrName/{mgrName}")
	public void findByMgrName(@PathVariable String mgrName) {
		List<PublisherDTO> list = publisherService.findByMgrName(mgrName);
		for(PublisherDTO p : list) {
			System.out.println(p.toString());
		}
	}
	@GetMapping("/pubs/phone/{phone}")
	public void findByPhone(@PathVariable String phone) {
		List<PublisherDTO> list = publisherService.findByPhone(phone);
		for(PublisherDTO p : list) {
			System.out.println(p.toString());
		}
	}

}
