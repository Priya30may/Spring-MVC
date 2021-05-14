package mvc1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WorldController {
	
	

	@RequestMapping(value="/login1",method=RequestMethod.GET)
	public String hello()
	{
		return "index";	
	}
	
	@RequestMapping(value="/login1",method=RequestMethod.POST)
	public String SayHello3(@RequestParam Integer p,@RequestParam Float r,@RequestParam Float t,ModelMap model)
	{  
		model.put("p",p);
		model.put("r", r);
		model.put("t",t);
		
		float n=p*(1+r*t);
		
		model.put("n",n);
		
		return "Hello World";	
	}

}
