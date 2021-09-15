package shop.jarviis.oracle.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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
	@RequestMapping("/move/{dir}/{jsp}")
	public String mapping(@PathVariable String dir, @PathVariable String jsp) {
		return dir + "/" + jsp;
	}
}
