package shop.jarviis.oracle.publisher.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import shop.jarviis.oracle.publisher.domain.PublisherDTO;
import shop.jarviis.oracle.publisher.service.PublisherService;

@Controller @RequestMapping("/pubs")
public class PublisherController {
	@Autowired PublisherService publisherService;
	@Autowired PublisherDTO publisherDTO;
	@GetMapping("/")
	public void findAll() {
		List<PublisherDTO> list = publisherService.findAll();
		for(PublisherDTO p : list) {
			System.out.println(p.toString());
		}
	}
	@GetMapping("/pubId/{pubId}")
	public void findById(@PathVariable int pubId) {
		PublisherDTO publisherDTO = publisherService.findById(pubId);
		System.out.println(publisherDTO.toString());
	}
	@GetMapping("/pubName/{pubName}")
	public void findByPubName(@PathVariable String pubName) {
		List<PublisherDTO> list = publisherService.findByPubName(pubName);
		for (PublisherDTO p : list) {
			System.out.println(p.toString());
		}
	}
	@GetMapping("/mgrName/{mgrName}")
	public void findByMgrName(@PathVariable String mgrName) {
		List<PublisherDTO> list = publisherService.findByMgrName(mgrName);
		for(PublisherDTO p : list) {
			System.out.println(p.toString());
		}
	}
	@GetMapping("/phone/{phone}")
	public void findByPhone(@PathVariable String phone) {
		List<PublisherDTO> list = publisherService.findByPhone(phone);
		for(PublisherDTO p : list) {
			System.out.println(p.toString());
		}
	}
	@RequestMapping(value="/addPub", method= {RequestMethod.POST})
	public String addPub(
			@RequestParam("pubId") int pubId,
			@RequestParam("pubName") String pubName,
			@RequestParam("mgrName") String mgrName,
			@RequestParam("phone") String phone) {
		System.out.println("pubId :" + pubId);
		System.out.println("pubName :" + pubName);
		System.out.println("mgrName :" + mgrName);
		System.out.println("phone :" + phone);
		publisherDTO.setPubId(pubId);
		publisherDTO.setPubName(pubName);
		publisherDTO.setMgrName(mgrName);
		publisherDTO.setPhone(phone);
		publisherService.save(publisherDTO);
		return "/publisher/AddPub";
	}

}
