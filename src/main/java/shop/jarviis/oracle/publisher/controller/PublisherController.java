package shop.jarviis.oracle.publisher.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import shop.jarviis.oracle.publisher.domain.PublisherDTO;
import shop.jarviis.oracle.publisher.service.PublisherService;

@Controller @RequestMapping("/pubs")
public class PublisherController{
	@Autowired PublisherService publisherService;
	@Autowired PublisherDTO publisherDTO;
	@RequestMapping(value="/register")
	public void save(PublisherDTO t) {
		publisherService.save(t);
		System.out.println("*****Save Complete : " + t.toString());
	}
	@RequestMapping(value="/list")
	public void findAll() {
		this.forPrint(publisherService.findAll());
	}
	@RequestMapping(value="/update")
	public void update(PublisherDTO t) {
		publisherService.update(t);
		System.out.println("*****Update Complete : " + t.toString());
		
	}
	@RequestMapping(value="/delete")
	public void delete(@RequestParam Integer pubId) {
		publisherService.delete(pubId);
		System.out.println("*****Delete Complete : " + pubId);
		
	}
	@RequestMapping("/detail/pubId")
	public void findById(@RequestParam int pubId) {		
		System.out.println(publisherService.findById(pubId).toString());
	}
	@RequestMapping("/detail/pubName")
	public void findByPubName(@RequestParam String pubName) {
		this.forPrint(publisherService.findByPubName(pubName));
	}
	@RequestMapping("/detail/mgrName")
	public void findByMgrName(@RequestParam String mgrName) {	
		this.forPrint(publisherService.findByMgrName(mgrName));
	}
	@RequestMapping("/detail/phone")
	public void findByPhone(@RequestParam String phone) {
		this.forPrint(publisherService.findByPhone(phone));
	}
	public void forPrint(List<PublisherDTO> list) {
		System.out.println("*****Select Complete : ");
		for(PublisherDTO p : list) {
			System.out.println(p.toString());
		}
	}

}
