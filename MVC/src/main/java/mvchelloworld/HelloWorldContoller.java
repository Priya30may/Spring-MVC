package mvchelloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldContoller {
	
	
	@RequestMapping(value="/login2",method=RequestMethod.GET)
	
	public String hello()
	{
		return "indexnew";	
	}
	
	@RequestMapping(value="/login2",method=RequestMethod.POST)
	public String hello1()
	{
		return "Hello World2";	
	}

}
