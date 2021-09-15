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
	@RequestMapping(value="/detail")
	public void findById(@RequestParam Integer pubId) {
		publisherService.findById(pubId);
		System.out.println("*****Detail : " + publisherService.findById(pubId).toString());
	}
	@RequestMapping(value="/list")
	public void findAll() {
		List<PublisherDTO> list = publisherService.findAll();
		System.out.println("*****List : ");
		for(PublisherDTO p : list) {
			System.out.println(p.toString());
		}
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

}
