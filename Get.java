package server;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Get {
	@RequestMapping(value = "/")
	public ResponseEntity<Patient> get(String ID){
		
	}
}
