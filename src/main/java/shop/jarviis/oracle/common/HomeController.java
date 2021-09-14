package shop.jarviis.oracle.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * Handles requests for the application home page..
 */
@SessionAttributes("contextPath")
@Controller
public class HomeController {
		
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(
		HttpSession session,
		HttpServletRequest request) { 
		String contextPath = request.getContextPath();
		session.setAttribute("contextPath", contextPath);
		return "index";
	}
	@RequestMapping(value="/custList", method=RequestMethod.GET)
	public String customerList() {
		return "user/List";
	}
	@RequestMapping(value="/custDetail", method=RequestMethod.GET)
	public String customerDetail() {
		return "user/Detail";
	}
	@RequestMapping(value = "/custRegi", method = RequestMethod.GET)
	public String customerRegister() {		
		return "user/Register";
	}
	@RequestMapping(value = "/custUp", method = RequestMethod.GET)
	public String customerUpdate() {
		return "user/Update";
	}
	@RequestMapping(value = "/custDel", method = RequestMethod.GET)
	public String customerDelete() {
		return "user/Delete";
	}
	@RequestMapping(value = "/addPub", method = RequestMethod.GET)
	public String addPub() {
		return "publisher/AddPub";
	}
	@RequestMapping(value="/addBook", method = RequestMethod.GET)
	public String addBook() {
		return "book/AddBook";
	}
	@RequestMapping(value="/addOrder", method=RequestMethod.GET)
	public String addOrder() {
		return "order/AddOrder";
	}
	
}
