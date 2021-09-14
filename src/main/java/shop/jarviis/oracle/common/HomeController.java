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
	public String customerList() {return "user/List";}
	@RequestMapping(value="/custDetail", method=RequestMethod.GET)
	public String customerDetail() {return "user/Detail";}
	@RequestMapping(value = "/custRegi", method = RequestMethod.GET)
	public String customerRegister() {return "user/Register";}
	@RequestMapping(value = "/custUp", method = RequestMethod.GET)
	public String customerUpdate() {return "user/Update";}
	@RequestMapping(value = "/custDel", method = RequestMethod.GET)
	public String customerDelete() {return "user/Delete";}
	@RequestMapping(value = "/custLogin", method = RequestMethod.GET)
	public String customerLogin() {return "user/Login";}
	
	@RequestMapping(value = "/bookList", method = RequestMethod.GET)
	public String bookList() {return "book/List";}
	@RequestMapping(value = "/bookDetail", method = RequestMethod.GET)
	public String bookDetail() {return "book/Detail";}
	@RequestMapping(value = "/bookRegi", method = RequestMethod.GET)
	public String bookRegister() {return "book/Register";}
	@RequestMapping(value = "/bookUp", method = RequestMethod.GET)
	public String bookUpdate() {return "book/Update";}
	@RequestMapping(value = "/bookDel", method = RequestMethod.GET)
	public String bookDelete() {return "book/Delete";}
	
	@RequestMapping(value = "/orderList", method = RequestMethod.GET)
	public String orderList() {return "order/List";}
	@RequestMapping(value = "orderDetail", method = RequestMethod.GET)
	public String orderDetail() {return "order/Detail";}
	@RequestMapping(value = "/orderRegi", method = RequestMethod.GET)
	public String orderRegister() {return "order/Register";}
	@RequestMapping(value = "/orderUp", method = RequestMethod.GET)
	public String orderUpdate() {return "order/Update";}
	@RequestMapping(value = "/orderDel", method = RequestMethod.GET)
	public String orderDelete() {return "order/Delete";}
}
